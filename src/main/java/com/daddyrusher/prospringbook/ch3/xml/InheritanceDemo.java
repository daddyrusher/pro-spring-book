package com.daddyrusher.prospringbook.ch3.xml;

import org.springframework.context.support.GenericXmlApplicationContext;

public class InheritanceDemo {
    public static void main(String[] args) {
        GenericXmlApplicationContext context = new GenericXmlApplicationContext();
        context.load("classpath:spring/app-context.xml");
        context.refresh();

        Singer parent = (Singer) context.getBean("parent");
        Singer child = (Singer) context.getBean("child");

        System.out.println("Parent:\n" + parent);
        System.out.println("Child:\n"+ child);

        context.close();
    }
}
