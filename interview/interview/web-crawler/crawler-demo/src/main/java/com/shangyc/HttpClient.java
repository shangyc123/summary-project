package com.shangyc;


import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.junit.Test;

import java.util.ArrayList;

/**
 *
 * 演示使用httpClient实现网络爬虫
 */
public class HttpClient {

    @Test
    //httpClient 演示get请求
    public void testGet() throws Exception {
        //1. 创建httpClient对象
        CloseableHttpClient httpClient = HttpClients.createDefault();
        //2. 创建httpGet请求，并进行相关的配置
        HttpGet httpGet = new HttpGet("http://www.itcast.cn/?username=java");
        httpGet.setHeader("Pragma","no-cache");
        //3. 发起请求
        CloseableHttpResponse response = httpClient.execute(httpGet);
        //4.判断响应状态码，并获取响应数据
        if(response.getStatusLine().getStatusCode()==200){
            String html = EntityUtils.toString(response.getEntity(),"utf-8");
            System.out.println(html);
        }
        //5. 关闭资源
        httpClient.close();
        response.close();
    }

    @Test
    public void testPost() throws Exception {
        //1. 创建httpclient对象
        CloseableHttpClient httpClient = HttpClients.createDefault();
        //2. 创建httppost请求
        HttpPost httpPost = new HttpPost("http://www.itcast.cn/");
        //准备用集合来存放参数
        ArrayList<NameValuePair> params = new ArrayList<>();
        params.add(new BasicNameValuePair("username","java"));
        UrlEncodedFormEntity entity = new UrlEncodedFormEntity(params, "utf-8");
        httpPost.setEntity(entity);//设置请求体或参数
        httpPost.setHeader("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/63.0.3239.108 Safari/537.36");
        //3. 发送请求体
        CloseableHttpResponse response = httpClient.execute(httpPost);
        //4. 判断响应状态码并获取数据
        if(response.getStatusLine().getStatusCode()==200){
            String html = EntityUtils.toString(response.getEntity(),"utf-8");
            System.out.println(html);
        }

        //5. 关闭资源
        response.close();
        httpClient.close();
    }

}

