package com.bingo.spring.email.service.impl;

import com.bingo.spring.email.bean.Email;
import com.bingo.spring.email.service.IMailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.springframework.ui.freemarker.FreeMarkerTemplateUtils;
import org.springframework.util.ResourceUtils;

import javax.mail.internet.MimeMessage;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

@Service
public class MailServiceImpl implements IMailService {
}
