package com.company.emails;

import com.company.singleton.Singleton;

public class AwsProvider implements EmailProvider{
    @Override
    public void send(String to, String content) {
        System.out.println(to + " " + content + " aws ");
    }
}
