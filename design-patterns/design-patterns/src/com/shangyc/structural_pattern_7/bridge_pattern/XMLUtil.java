package com.shangyc.structural_pattern_7.bridge_pattern;


import org.w3c.dom.*;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class XMLUtil {
    //该方法用于从XML配置文件中提取具体类类名，并返回一个实例对象
    //运用反射创建对象
    public static Object getBean(String args){
        DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder builder = dFactory.newDocumentBuilder();
            Document doc;
            doc = builder.parse(new File("src/com/shangyc/structural_pattern_7/bridge_pattern/config.xml"));
            NodeList nl=null;
            Node classNode=null;
            String cName=null;
            nl = doc.getElementsByTagName("className");
            if(args.equals("image")) {
                classNode=nl.item(0).getFirstChild();
            }else if(args.equals("os")) {
                classNode=nl.item(1).getFirstChild();
            }
            cName=classNode.getNodeValue();
            //com.yinjun.bridgepattern.JPGImage
            Class c=Class.forName("com.shangyc.structural_pattern_7.bridge_pattern." + cName);
            Object obj=c.newInstance();
            return obj;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
