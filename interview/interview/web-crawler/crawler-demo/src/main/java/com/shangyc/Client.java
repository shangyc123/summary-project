package com.shangyc;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * URLConnection 是 JDK 自带的一个抽象类，其代表应用程序和 URL 之间的通信链接。
 * 在网络爬虫中，我们可以使用 URLConnection 请求一个 URL 地址，然后获取流信息，
 * 通过对流信息的操作，可获得请求到的实体内容.
 */
public class Client {
    @Test
    public void  testGet() throws  Exception{
        //1. 确定要访问/爬取的URL
        URL url = new URL("http://www.itcast.cn/?username=xxx");

        //2. 获取连接对象
        HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
        //3. 设置连接信息 请求方式 请求参数 请求头
        urlConnection.setRequestMethod("GET");//这里一定要大写
        urlConnection.setRequestProperty("Pragma","no-cache");
        urlConnection.setConnectTimeout(30000);
        //4. 获取数据
        InputStream in = urlConnection.getInputStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(in));
        String line;
        String html="";
        while ((line=bufferedReader.readLine())!=null){
            html+=line+"\n";
        }
        System.out.println(html);

        //5. 关闭资源
        in.close();
        bufferedReader.close();

    }

    @Test
    public void testPost() throws Exception{
        //1.确定首页的URL
        URL url = new URL("http://www.itcast.cn");
        //2.获取远程连接
        HttpURLConnection urlConnection =(HttpURLConnection) url.openConnection();
        //3.设置请求方式  请求参数  请求头
        urlConnection.setRequestMethod("POST");
        urlConnection.setDoOutput(true); // 原生jdk默认关闭了输出流
        urlConnection.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/63.0.3239.108 Safari/537.36");
        urlConnection.setConnectTimeout(30000); //连接超时 单位毫秒
        urlConnection.setReadTimeout(30000);   //读取超时 单位毫秒
        OutputStream out = urlConnection.getOutputStream();
        out.write("username=zhangsan&password=123".getBytes());
        //4.获取数据
        InputStream in = urlConnection.getInputStream();
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        String line;
        String html = "";
        while ((line = reader.readLine()) != null) {
            html +=  line + "\n";
        }
        System.out.println(html);
        in.close();
        reader.close();
    }


}
