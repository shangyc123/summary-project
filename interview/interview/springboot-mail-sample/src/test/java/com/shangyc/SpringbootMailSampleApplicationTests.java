package com.shangyc;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

@SpringBootTest
class SpringbootMailSampleApplicationTests {

    @Test
    void contextLoads() {
    }


    @Autowired
    private JavaMailSender sender;;

    @Autowired
    private TemplateEngine templateEngine;


    @Test
    public void testSenMailByTemplate() throws MessagingException {
        MimeMessage message = sender.createMimeMessage();

        MimeMessageHelper mailMessage = new MimeMessageHelper(message,true);
        mailMessage.setSubject("测试邮件主题");

        //读取模板内容
        Context context = new Context();
        context.setVariable("username","java");
        String info = templateEngine.process("template/mailTemplate.ftl", context);

        mailMessage.setText(info,true);

        mailMessage.setFrom("1275075292@qq.com");
        mailMessage.setTo("694697328@qq.com");

        sender.send(message);
    }
}
