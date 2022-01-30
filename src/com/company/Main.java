package com.company;

import com.company.emails.AwsProvider;
import com.company.emails.EmailProvider;
import com.company.emails.EmailsSender;
import com.company.emails.MailgunProvider;
import com.company.factory.Game;
import com.company.factory.GameType;
import com.company.factory.PcGame;
import com.company.prototype.Cat;
import com.company.singleton.Singleton;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {

        // EMAILS
        EmailProvider[] emailProviders = { new MailgunProvider(), new AwsProvider() };
        EmailsSender emailsSender = new EmailsSender(emailProviders);

//        emailsSender.send("Zdzisław", "Hello world!");

        // SINGLETON

        Singleton s1 = Singleton.getInstance();

//        System.out.println(s1.getCount());
        s1.increment();

        Singleton s2 = Singleton.getInstance();
//        System.out.println(s2.getCount());

        // Factory

        // Prototype

        Cat a = new Cat("a",1);

        Cat b = a;
        Cat c = a.createCatClone();


        System.out.println(a + " " + a.getDog());
        System.out.println(b + " " + b.getDog());
        System.out.println(c + " " + c.getDog());
    // Samouczek
        // 1. Dodaj zdjęcie
        // 2. Dodaj opis
        // 3. Zaproś znajomych
    }
}
