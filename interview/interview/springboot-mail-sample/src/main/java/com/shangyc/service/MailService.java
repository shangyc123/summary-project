package com.shangyc.service;

public interface MailService {
    void sendSimpleMail(String mail);

    void sendAttachmentMail(String mail);

    void sendTemplateEmail(String to, String subject, String content);
}
