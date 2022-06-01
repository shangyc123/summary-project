package com.shangyc.controller;

import com.shangyc.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

@RestController
@RequestMapping("/mail")
public class MailController {

    @Autowired
    private MailService mailService;

    /**
     * 发送邮件
     *
     * @param address 用户名
     *  把接收人的信息传递进去
     * @return {@link String}
     */
    @GetMapping("/simple-mail/{address}")
    public String sendMail(@PathVariable(value = "address") String address) {
        mailService.sendSimpleMail(address);
        return "success";
    }

    /**
     * 发送附件电子邮件
     *
     * @param address 用户名
     * @return {@link String}
     */
    @GetMapping("/attachment-mail/{address}")
    public String sendEmail(@PathVariable("address") String address){
        mailService.sendAttachmentMail(address);
        return "附件文件发送成功";
    }


    /**
     * 测试发送模板邮件
     */

    @Autowired
    private TemplateEngine templateEngine;
    @GetMapping("/template-mail/{address}")
    public String sendTemplateEmail(@PathVariable("address") String address) {
        String subject = "【模板邮件】标题";

        //使用模板定制邮件正文内容
        Context context = new Context();
        context.setVariable("username", "zhangqi");
        context.setVariable("code", "4891");

        //使用TemplateEngline设置要处理的模板 页面
        String emailTemplate = templateEngine.process("template/mailTemplate.ftl", context);

        //发送模板邮件
        mailService.sendTemplateEmail(address, subject, emailTemplate);
        return "模板邮件发送成功";
    }


    @RequestMapping("/hello")
    public String hello(){
        return "hello world";
    }
}
