package com.annn;

import com.google.gson.Gson;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BaiduPacong {
    public static void main(String[] args) {
        try {
            test();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void test() throws IOException {
        String[] ua = {"Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.1 (KHTML, like Gecko) Chrome/22.0.1207.1 Safari/537.1",
                "Mozilla/5.0 (X11; CrOS i686 2268.111.0) AppleWebKit/536.11 (KHTML, like Gecko) Chrome/20.0.1132.57 Safari/536.11",
                "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/536.6 (KHTML, like Gecko) Chrome/20.0.1092.0 Safari/536.6",
                "Mozilla/5.0 (Windows NT 6.2) AppleWebKit/536.6 (KHTML, like Gecko) Chrome/20.0.1090.0 Safari/536.6",
                "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/66.0.3359.181 Safari/537.36"};
        Random rand = new Random();
        int uaNum;
        StringBuilder stringBuffer;
        Gson gson = new Gson();
        List<Baidu> baidus = new ArrayList<>();
        CloseableHttpClient client = HttpClients.createDefault();
        System.out.println("---------------请输入你要查询的关键字----------------");
            String word=new Scanner(System.in).nextLine();
        System.out.println("---------------请输入你要爬取的页数----------------");
        int page=new Scanner(System.in).nextInt();
        for (int i = 0; i < page; i++) {
            stringBuffer = new StringBuilder("https://image.baidu.com/search/acjson?tn=resultjson_com&ipn=rj&ct=201326592&is=&fp=result&queryWord="+word+"&cl=2&lm=-1&ie=utf-8&oe=utf-8&adpicid=&st=-1&z=&ic=0&word="+word+"&s=&se=&tab=&width=&height=&face=0&istype=2&qc=&nc=1&fr=&pn=" + (i + 1) * 30 + "&rn=30&gsm=3c&1527824207331=");
            HttpGet get = new HttpGet(String.valueOf(stringBuffer));
            uaNum = rand.nextInt(3);
            get.setHeader("Accept", "application/json, text/javascript, */*; q=0.01");
            get.setHeader("Accept-Encoding", "gzip, deflate, br");
            get.setHeader("Accept-Language", "zh-CN,zh;q=0.9");
            get.setHeader("Connection", "keep-alive");
            get.setHeader("Host", "image.baidu.com");
            get.setHeader("User-Agent", ua[uaNum]);
            get.setHeader("X-Requested-With", "XMLHttpRequest");
            CloseableHttpResponse response = client.execute(get);
            if (response.getStatusLine().getStatusCode() == 200) {
                String entity = EntityUtils.toString(response.getEntity(), "utf-8");
                Baidu baidu = gson.fromJson(entity, Baidu.class);
                baidus.add(baidu);
            } else {
                System.out.println("error:" + response.getStatusLine().getStatusCode());
            }
        }
        List<String> urls = new ArrayList<>();
        List<List<Baidu.DataBean>> collect = baidus.stream().map(Baidu::getData)
                .collect(Collectors.toList());
        for (List<Baidu.DataBean> beans : collect) {
            for (Baidu.DataBean bean : beans) {
                String hoverURL = bean.getHoverURL();
                if (hoverURL != null) {
                    System.out.println("发现表情图------------->"+bean.getFromPageTitleEnc());
                    urls.add(hoverURL);
                }
            }
        }
        for (String url : urls) {
            downloadWithOk(url);
        }

    }

    private static void downloadWithOk(String imgUrl) {
        OkHttpClient client = new OkHttpClient();
        Request req;
        try {
            req = new Request.Builder().url(imgUrl).build();

        Response res = client.newCall(req).execute();
        InputStream is = res.body().byteStream();
        URL url = new URL(imgUrl);
        String fileName = url.getPath();
        File dir = new File("./images/");
        fileName = fileName.substring(fileName.lastIndexOf("/"));
        if (!dir.exists()) {
            dir.mkdirs();
        }
        File file = new File(dir, fileName);
        copy(is, file);
            System.out.println("成功下载");
        } catch (Exception e) {
            System.out.println("错误的链接");
        }
    }

    private static void copy(InputStream is, File file) throws IOException {
        if (!file.exists()) {
            FileOutputStream fos = new FileOutputStream(file);
            byte[] bytes = new byte[1024];
            int length;
            while ((length = is.read(bytes)) != -1) {
                fos.write(bytes, 0, length);
            }
            fos.close();
            is.close();
        }
    }

}
