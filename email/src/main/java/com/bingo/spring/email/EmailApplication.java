package com.bingo.spring.email;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.File;

@Slf4j
@SpringBootApplication
@RestController
public class EmailApplication {

    @Autowired
    private JavaMailSender mailSender;

    public static void main(String[] args) {
        SpringApplication.run(EmailApplication.class, args);

    }
    @RequestMapping("test")
    public void test() throws MessagingException {
        MimeMessage mimeMessage = mailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);
        //发件人
        helper.setFrom("yancy@tdeado.com");
        //收件人
        helper.setTo("599571442@qq.com");
        //标题
        helper.setSubject("subject");
        //文本
        helper.setText("message text");
        //附件
//        helper.addAttachment("downFile",new File("D:\\cygwin64\\home\\workspace3\\learn-demo\\zookeeper\\src\\test\\java\\com\\tzxylao\\design\\ZookeeperApplicationTests.java"));
        mailSender.send(mimeMessage);
    }

}
