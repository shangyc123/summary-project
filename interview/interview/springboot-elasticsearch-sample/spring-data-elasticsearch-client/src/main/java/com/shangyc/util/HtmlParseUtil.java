package com.shangyc.util;

import com.shangyc.pojo.Content;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Component;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

@Component
public class HtmlParseUtil {
    public static void main(String[] args) throws Exception {
        new HtmlParseUtil().parseJD("娃哈哈").forEach(System.out::println);
    }

    public List<Content> parseJD(String keyword) throws Exception {

        String url = "https://search.jd.com/Search?keyword="+keyword+"&enc=utf-8";

        Document document = Jsoup.parse(new URL(url), 30000);
        Element element = document.getElementById("J_goodsList");

        Elements elements = element.getElementsByTag("li");

        ArrayList<Content> goodsList= new ArrayList<>();
        for (Element el : elements) {
            String img = el.getElementsByTag("img").eq(0).attr("source-data-lazy-img");
            String price = el.getElementsByClass("p-price").eq(0).text();
            String title = el.getElementsByClass("p-name").eq(0).text();

            Content content = new Content();
            content.setImg(img);
            content.setPrice(price);
            content.setTitle(title);
            goodsList.add(content);
        }
        return goodsList;
    }
}
