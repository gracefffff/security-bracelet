package school.project.securitybracelet.web.service;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class EmailSender {
    private String to = "mr.heylovskiy@gmail.com";
    private String from = "mr.heylovskiy@yandex.ru";
    private String host = "localhost";

    public EmailSender() {

    }

    public void sendEmail() {
        Properties properties = System.getProperties();
        properties.setProperty("mail.smtp.host", host);
//        Session session = Session.getDefaultInstance(properties);

        try {
            MimeMessage message = new MimeMessage((Session) null);
            message.setFrom(new InternetAddress(from));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
            message.setSubject("Ping");
            message.setText("Hello, this is example of sending email  ");

            // Send message
            Transport.send(message);
            System.out.println("message sent successfully....");

        } catch (MessagingException mex) {
            mex.printStackTrace();
        }
    }
}
