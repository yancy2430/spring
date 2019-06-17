package com.bingo.spring.email.bean;

import com.bingo.spring.email.service.IMailService;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.springframework.ui.freemarker.FreeMarkerTemplateUtils;
import org.springframework.util.ResourceUtils;

import javax.mail.internet.MimeMessage;
import java.io.File;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@Data
@ToString
@AllArgsConstructor
public class Email implements Serializable {
    private static final long serialVersionUID = 1L;
    //必填参数
    private String email;//接收方邮件
    private String subject;//主题
    private String content;//邮件内容
    //选填
    private String template;//模板
    private HashMap<String, String> kvMap;// 自定义参数
}