package com.company.emails;

public interface EmailProvider {
    public void send(String to, String content) throws Exception;

}
