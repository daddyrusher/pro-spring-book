package com.daddyrusher.prospringbook.ch3.xml;

import org.springframework.context.support.GenericXmlApplicationContext;

public class DependsOnDemo {
    public static void main(String[] args) {
        GenericXmlApplicationContext context = new GenericXmlApplicationContext();
        context.load("classpath:spring/application-context-02.xml");
        context.refresh();

        com.daddyrusher.prospringbook.ch3.annotated.Singer johnMayer = context.getBean("johnMayer", com.daddyrusher.prospringbook.ch3.annotated.Singer.class);
        johnMayer.sing();

        context.close();
    }
}
