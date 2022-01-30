package com.company.emails;

public class EmailsSender implements EmailProvider {

    EmailProvider[] providers;

    public EmailsSender(EmailProvider[] provider){
        this.providers = provider;
    }

    @Override
    public void send(String to, String content) {
        for(EmailProvider emailProvider: providers){
            try {
                emailProvider.send(to, content);
                return;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
