package school.project.securitybracelet.web.service;

import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.mail.internet.MimeMessage;

public class EmailSender {
    private String host = "smtp.gmail.com";
    private String user = "fffffecarg@gmail.com";
    private String pass = "135secbraslet";
    private String from = "fffffecarg@gmail.com";
    private String subject = "DO NOT REPLY";
    private String messageText = "Your page about %s %s was just opened. Please contact with %s and make sure that" +
            "everything is alright. \n \n \n Sincerely, \n Your QRSecurity company";
    private boolean sessionDebug = false;
    private Properties props;


    public EmailSender() {
        props = System.getProperties();

        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", host);
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.required", "true");
    }

    public void sendEmail(String email, String firstName, String lastName) {
        try {
            this.messageText = String.format(this.messageText, firstName, lastName, firstName);

            java.security.Security.addProvider(new com.sun.net.ssl.internal.ssl.Provider());
            Session mailSession = Session.getDefaultInstance(props, null);
            mailSession.setDebug(sessionDebug);
            Message msg = new MimeMessage(mailSession);
            msg.setFrom(new InternetAddress(from));
            InternetAddress[] address = {new InternetAddress(email)};
            msg.setRecipients(Message.RecipientType.TO, address);
            msg.setSubject(subject);
            msg.setSentDate(new Date());
            msg.setText(messageText);

            Transport transport = mailSession.getTransport("smtp");
            transport.connect(host, user, pass);
            transport.sendMessage(msg, msg.getAllRecipients());
            transport.close();
            System.out.println("message send successfully");
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
