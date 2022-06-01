package com.shangyc.entity;

import java.io.Serializable;

public class EmailEntity implements Serializable {
    /**
     * 邮件接收方，可多人
     */
    private String[] receivers;
    /**
     * 邮件主题
     */
    private String subject;
    /**
     * 邮件内容
     */
    private String content;
}
