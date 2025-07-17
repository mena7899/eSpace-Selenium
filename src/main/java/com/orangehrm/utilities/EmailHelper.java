package com.orangehrm.utilities;

import jakarta.mail.*;
import jakarta.mail.internet.*;
import java.io.File;
import java.security.cert.X509Certificate;
import java.util.Properties;

import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

public class EmailHelper {

    // SMTP configuration
    private static final String SMTP_HOST = "mail.isfpegypt.com"; // replace with your SMTP host
    private static final String SMTP_PORT = "587";
    private static final String SMTP_USER = "RTA_TEST@isfpdomain.com"; // replace with your email
    private static final String SMTP_PASSWORD = ""; // replace with your email password

    public static void sendFailureEmail(String testName, File screenshot, String steps) {
        try {
        	
        	
            // Trust all SSL certificates (not recommended for production)
            TrustManager[] trustAllCertificates = new TrustManager[]{
                new X509TrustManager() {
                    public X509Certificate[] getAcceptedIssuers() { return null; }
                    public void checkClientTrusted(X509Certificate[] certs, String authType) {}
                    public void checkServerTrusted(X509Certificate[] certs, String authType) {}
                }
            };
            
            SSLContext sc = SSLContext.getInstance("TLS");
            sc.init(null, trustAllCertificates, new java.security.SecureRandom());
            SSLSocketFactory sslSocketFactory = sc.getSocketFactory();
            // SMTP setup (same as before)
            Properties properties = new Properties();
            properties.put("mail.smtp.auth", "true");
            properties.put("mail.smtp.starttls.enable", "true");
            properties.put("mail.smtp.host", SMTP_HOST);
            properties.put("mail.smtp.port", SMTP_PORT);
            properties.put("mail.smtp.ssl.socketFactory", sslSocketFactory);
            properties.put("mail.smtp.ssl.protocols", "TLSv1.2");
            
            Session session = Session.getInstance(properties, new Authenticator() {
                @Override
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(SMTP_USER, SMTP_PASSWORD);
                }
            });

            // Email message setup
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("RTA_TEST@isfpegypt.com"));
            //RTA_TEAM@isfpegypt.com
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse("melias@isfpegypt.com"));
            message.setSubject("Test Failure - " + testName);

            // Prepare email body
            MimeBodyPart bodyPart = new MimeBodyPart();
            String emailBody = "Test Failure Details:\n\n" +
                    "Test Name: " + testName + "\n\n" +
                    "Steps leading to failure:\n" +
                    steps + // Add the detailed steps here
                    "\n========================================";

            bodyPart.setText(emailBody);

            // Set up multipart to include the body and attachment
            Multipart multipart = new MimeMultipart();
            multipart.addBodyPart(bodyPart);

            // Attach screenshot to the email
            MimeBodyPart attachmentPart = new MimeBodyPart();
            attachmentPart.attachFile(screenshot);
            multipart.addBodyPart(attachmentPart);

            // Set the email content and send the email
            message.setContent(multipart);
            Transport.send(message);
            System.out.println("Email sent successfully with failure details and screenshot.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
