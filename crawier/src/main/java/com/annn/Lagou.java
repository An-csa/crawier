package com.annn;

import com.alibaba.fastjson.JSON;
import com.google.gson.Gson;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Lagou {
    @Test
    public void test1() throws IOException, InterruptedException {
        String url = "https://www.lagou.com/jobs/positionAjax.json?px=default&city=%E5%A4%A7%E8%BF%9E&needAddtionalResult=false";
        CloseableHttpClient client = HttpClients.createDefault();
        HttpPost post;
        List<Result> list=new ArrayList<>();
        String[] ua= {"Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.1 (KHTML, like Gecko) Chrome/22.0.1207.1 Safari/537.1",
                "Mozilla/5.0 (X11; CrOS i686 2268.111.0) AppleWebKit/536.11 (KHTML, like Gecko) Chrome/20.0.1132.57 Safari/536.11",
                "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/536.6 (KHTML, like Gecko) Chrome/20.0.1092.0 Safari/536.6",
                "Mozilla/5.0 (Windows NT 6.2) AppleWebKit/536.6 (KHTML, like Gecko) Chrome/20.0.1090.0 Safari/536.6",
                "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/66.0.3359.181 Safari/537.36"};
        Random rand = new Random();
        int uaNum;
        for (int i = 0; i < 8; i++) {
            uaNum=rand.nextInt(3);
            post = new HttpPost(url);
            post.setHeader("Accept", "application/json, text/javascript, */*; q=0.01");
            post.setHeader("Accept-Encoding", "gzip, deflate, br");
            post.setHeader("Accept-Language", "zh-CN,zh;q=0.9");
            post.setHeader("Connection", "keep-alive");
            post.setHeader("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
            post.setHeader("Host", "www.lagou.com");
            post.setHeader("Origin", "https://www.lagou.com");
            post.setHeader("Referer", "https://www.lagou.com/jobs/list_Java?px=default&city=%E5%A4%A7%E8%BF%9E");
            post.setHeader("User-Agent", ua[uaNum]);
            post.setHeader("X-Anit-Forge-Code", "0");
            post.setHeader("X-Anit-Forge-Token", "None");
            post.setHeader("X-Requested-With", "XMLHttpRequest");
            post.setHeader("Cookie","_ga=GA1.2.566391931.1525427722; user_trace_token=20180504175522-42c34e29-4f81-11e8-807f-525400f775ce; LGUID=20180504175522-42c35207-4f81-11e8-807f-525400f775ce; index_location_city=%E5%85%A8%E5%9B%BD; WEBTJ-ID=20180530172111-163b059e71b33e-06c77178692d74-33697704-2073600-163b059e71c3c4; _gid=GA1.2.1106301202.1527672073; _putrc=058556D53768DD55123F89F2B170EADC; JSESSIONID=ABAAABAACBHABBI5E63B2082ED7C4CE8EEB1893E57630CD; login=true; unick=%E5%B8%B8%E6%80%9D%E5%AE%89; showExpriedIndex=1; showExpriedCompanyHome=1; showExpriedMyPublish=1; witkey_login_authToken=\"NZ0IqiTugl4hU6BCgLeh39rvbS+JkzXr6dqKsKoCB4juEhVdNDHbPUN0/ZLV5GRHa1hzpz7UiWSzAXWIOTfA0JQIfDWTtVWd4WDa/JOwOsQHf9X8dWfJGKYxao/zu9Ylzj27qsg90V28S4ir1ejVCrYnyblgKpsQt4mrtKBMlTJ4rucJXOpldXhUiavxhcCELWDotJ+bmNVwmAvQCptcy5e7czUcjiQC32Lco44BMYXrQ+AIOfEccJKHpj0vJ+ngq/27aqj1hWq8tEPFFjdnxMSfKgAnjbIEAX3F9CIW8BSiMHYmPBt7FDDY0CCVFICHr2dp5gQVGvhfbqg7VzvNsw==\"; hasDeliver=6; Hm_lvt_4233e74dff0ae5bd0a3d81c6ccf756e6=1525427722,1527672072,1527765987; gate_login_token=0ee0780dafbb7c3edc2faa2bb37d664f83899da76c4874212644dd8158d5356a; TG-TRACK-CODE=index_navigation; SEARCH_ID=de7adfb040a842a9b94c2db84c2997a9; _gat=1; Hm_lpvt_4233e74dff0ae5bd0a3d81c6ccf756e6=1527771301; LGSID=20180531205501-d4de8ff7-64d1-11e8-8be9-525400f775ce; PRE_UTM=; PRE_HOST=; PRE_SITE=https%3A%2F%2Fwww.lagou.com%2Fzhaopin%2FJava%2F2%2F%3FfilterOption%3D3; PRE_LAND=https%3A%2F%2Fwww.lagou.com%2Fjobs%2Flist_Java%3Fpx%3Ddefault%26city%3D%25E5%25A4%25A7%25E8%25BF%259E; LGRID=20180531205501-d4de9175-64d1-11e8-8be9-525400f775ce");
            List<BasicNameValuePair> pairList = new ArrayList<BasicNameValuePair>();
            pairList.add(new BasicNameValuePair("first", "true"));
            pairList.add(new BasicNameValuePair("pn", String.valueOf(i)));
            pairList.add(new BasicNameValuePair("kd", "Java"));
            post.setEntity(new UrlEncodedFormEntity(pairList, "utf-8"));
            CloseableHttpResponse response = client.execute(post);
            if (response.getStatusLine().getStatusCode() == 200) {
                String entity = EntityUtils.toString(response.getEntity(), "utf-8");
                Gson gson = new Gson();
                Result result = gson.fromJson(entity, Result.class);
               list.add(result);

            } else {
                System.out.println("error:" + response.getStatusLine().getStatusCode());
            }
            Thread.sleep(2000);
        }
        List<List<Result.ContentBean.PositionResultBean.ResultBean>> collect = list.stream().map(Result::getContent)
                .map(Result.ContentBean::getPositionResult)
                .map(Result.ContentBean.PositionResultBean::getResult)
                .collect(Collectors.toList());

        System.out.println(collect);

    }
}
