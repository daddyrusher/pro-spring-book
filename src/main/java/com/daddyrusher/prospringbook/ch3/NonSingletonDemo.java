package com.daddyrusher.prospringbook.ch3;

import com.daddyrusher.prospringbook.ch3.annotated.Singer;
import org.springframework.context.support.GenericXmlApplicationContext;

public class NonSingletonDemo {
    public static void main(String[] args) {
        GenericXmlApplicationContext context = new GenericXmlApplicationContext();
        context.load("classpath:spring/app-context-xml.xml");
        context.refresh();

        Singer singer1 = context.getBean("nonSingleton", Singer.class);
        Singer singer2 = context.getBean("nonSingleton", Singer.class);

        System.out.println("Identity Equal?: " + (singer1 == singer2));
        System.out.println("Value Equal?: " + singer1.equals(singer2));
        System.out.println(singer1);
        System.out.println(singer2);

        context.close();
    }
}
