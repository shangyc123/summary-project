package com.shangyc.structural_pattern_7.flyweight_pattern;

public class JDKStringClient {


    //JDK类库中的String类使用了享元模式，我们通过如下代码来加以说明：
    public static void main(String args[]){

        String str1 = "abcd";
        String str2 = "abcd";
        String str3 = "ab" + "cd";
        String str4 = "ab";
        str4 += "cd";


        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
        System.out.println(str1 == str4);


        str2 += "e";
        System.out.println(str1 == str2);

//        true 统一个对象
//        true 先编译后存储，也是一个对象
//        false 初始值不一样，先创建对象，后改变
//        false 复制了一个原有的对象，进行改变，对象不一致

        //关于Java String类这种在修改享元对象时，先将原有对象复制一份，
        // 然后在新对象上再实施修改操作的机制称为“Copy On Write”，
        // 大家可以自行查询相关资料来进一步了解和学习“Copy On Write”机制，在此不作详细说明。

    }
}
