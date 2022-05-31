package com.shangyc;

import org.apache.http.HttpHost;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.util.EntityUtils;
import org.junit.Test;

public class ThreadPoolClient {
    @Test
    public  void test_pool()throws Exception{
        //创建httpClient连接管理器
        PoolingHttpClientConnectionManager cm = new PoolingHttpClientConnectionManager();
        //设置参数
        cm.setMaxTotal(200);//设置最大连接数
        cm.setDefaultMaxPerRoute(20);//设置每个主机的最大并发
        doGet(cm);
        doGet(cm);
    }

    private void doGet ( PoolingHttpClientConnectionManager cm) throws Exception{
        //3. 从连接池中获取httpclient对象
        CloseableHttpClient httpClient = HttpClients.custom().setConnectionManager(cm).build();
        //创建httpGet对象
        HttpGet httpGet = new HttpGet("http://www.itcast.cn/");
        //发送请求
        CloseableHttpResponse response = httpClient.execute(httpGet);
        //获取数据
        if(response.getStatusLine().getStatusCode()==200){
            String html = EntityUtils.toString(response.getEntity(), "utf-8");
            System.out.println(html);
        }
        //关闭资源
        response.close();
        //httpClient对象需要还回去而不是关闭

    }

    //超时时间的设置
    @Test
    public void testConfig()throws Exception{
        //创建请求配置对象
        RequestConfig requestConfig=RequestConfig.custom()
                .setSocketTimeout(10000)//设置连接超时时间
                .setConnectTimeout(10000)//设置创建连接超时时间
                .setConnectionRequestTimeout(10000)//设置请求超时时间
                .setProxy(new HttpHost("47.116.76.219",80))//添加代理服务器
                .build();
        //1.创建httpClient对象
        CloseableHttpClient httpClient = HttpClients.custom().setDefaultRequestConfig(requestConfig).build();
        //2.创建httpget对象
        HttpGet httpGet = new HttpGet("http://www.itcast.cn/");
        //3.发起请求
        CloseableHttpResponse response = httpClient.execute(httpGet);
        //4. 获取响应数据
        if(response.getStatusLine().getStatusCode()==200){
            String html = EntityUtils.toString(response.getEntity(), "utf-8");
            System.out.println(html);
        }
        //关闭服务
        response.close();

    }


}
