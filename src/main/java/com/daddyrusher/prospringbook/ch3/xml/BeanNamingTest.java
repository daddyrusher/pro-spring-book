package com.daddyrusher.prospringbook.ch3.xml;

import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.Map;

public class BeanNamingTest {
    public static void main(String[] args) {
        GenericXmlApplicationContext context = new GenericXmlApplicationContext();
        context.load("classpath:spring/app-context-xml.xml");
        context.refresh();

        Map<String, String> beans = context.getBeansOfType(String.class);

        beans.forEach((key, value) -> System.out.println(key));

        context.close();
    }
}
