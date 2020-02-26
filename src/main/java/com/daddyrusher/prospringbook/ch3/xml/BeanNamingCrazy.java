package com.daddyrusher.prospringbook.ch3.xml;

import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.Arrays;
import java.util.Map;

public class BeanNamingCrazy {
    public static void main(String[] args) {
        GenericXmlApplicationContext context = new GenericXmlApplicationContext();
        context.load("classpath:spring/app-context-03.xml");
        context.refresh();

        Map<String, String> beans = context.getBeansOfType(String.class);

        beans.forEach((key, value) -> System.out.println("id: " + key + "\n aliases: " + Arrays.toString(context.getAliases(key)) + "\n"));
        context.close();
    }
}
