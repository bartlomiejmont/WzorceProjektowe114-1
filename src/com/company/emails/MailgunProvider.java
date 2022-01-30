package com.company.emails;

public class MailgunProvider implements EmailProvider{

    @Override
    public void send(String to, String content) throws Exception {
        throw new Exception("SENDING FAILED");
//        System.out.println(to + " " + content + " mailgun");
    }
}
