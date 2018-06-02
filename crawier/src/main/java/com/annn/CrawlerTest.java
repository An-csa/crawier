package com.annn;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;

/**
 * @author An
 */
public class CrawlerTest {

    @Test
    public void test1() {
        String html = "<html><head><title>TITLE</title></head><body><p>PPPP</p></body></html>";
        Document document = Jsoup.parse(html);
        System.out.println(document);
    }

    @Test
    public void test2() {
        String url = "https://bing.ioliu.cn";
        Document document = null;
        try {
            document = Jsoup.connect(url).get();
            Elements elements = document.select("a.download");
            List<String> hrefs = elements.eachAttr("abs:href");
            ExecutorService tp= Executors.newFixedThreadPool(3);
            tp.execute(()->{

            });
            hrefs.forEach(href -> {
                try {
                    this.download1(href);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void download1(String imgUrl) throws IOException {
        URL url = new URL(imgUrl);
        String fileName =url.getPath();
      fileName=  fileName.substring(fileName.lastIndexOf("/"));
        URLConnection urlConnection = url.openConnection();
        InputStream is = urlConnection.getInputStream();
        File dir = new File("./images/");
        if (!dir.exists()) {
            dir.mkdirs();
        }
        File file = new File(dir, fileName + ".jpg");
        copy(is, file);
    }
    private void downloadWithOk(String imgUrl) throws IOException {
        OkHttpClient client=new OkHttpClient();
        Request req=new Request.Builder().url(imgUrl).build();
        Response res = client.newCall(req).execute();
        InputStream is = res.body().byteStream();
        URL url = new URL(imgUrl);
        String fileName =url.getPath();
        File dir = new File("./images/");
        fileName=  fileName.substring(fileName.lastIndexOf("/"));
        if (!dir.exists()) {
            dir.mkdirs();
        }
        File file = new File(dir, fileName + ".jpg");
        copy(is, file);

    }

    private void copy(InputStream is, File file) throws IOException {
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

//    public static void main(String[] args)  {
//        new A(new B()).ask();
//    }

    @Test
    public void lambdaTest(){
        List<Integer> list=new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            list.add((int) (Math.random()*1000));
        }
        System.out.println(list.stream().filter((x) -> x < 500).collect(Collectors.toList()));
    }


}
