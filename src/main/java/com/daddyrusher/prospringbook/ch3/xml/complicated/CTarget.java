package com.daddyrusher.prospringbook.ch3.xml.complicated;

import org.springframework.context.support.GenericXmlApplicationContext;

public class CTarget {
    public static void main(String[] args) {
        GenericXmlApplicationContext context = new GenericXmlApplicationContext();
        context.load("classpath:spring/app-context-04.xml");
        context.refresh();

        System.out.println("\nUsing byType:\n");
        CTarget c = (CTarget) context.getBean("targetByType");
        context.close();
    }
}
