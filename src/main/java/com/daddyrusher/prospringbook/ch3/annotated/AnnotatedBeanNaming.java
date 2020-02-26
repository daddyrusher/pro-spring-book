package com.daddyrusher.prospringbook.ch3.annotated;

import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.Map;

public class AnnotatedBeanNaming {
    public static void main(String[] args) {
        GenericXmlApplicationContext context = new GenericXmlApplicationContext();
        context.load("classpath:spring/app-context-annotation.xml");
        context.refresh();

        Map<String, Singer> beans = context.getBeansOfType(Singer.class);
        beans.forEach((key, value) -> System.out.println("id: " + key));
        context.close();
    }
}
