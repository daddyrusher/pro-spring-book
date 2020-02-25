package com.daddyrusher.prospringbook.annotated;

import org.springframework.context.support.GenericXmlApplicationContext;

public class FieldInjection {
    public static void main(String[] args) {
        GenericXmlApplicationContext context = new GenericXmlApplicationContext();
        context.load("classpath:spring/app-context.xml");
        context.refresh();

        Singer singerBean = context.getBean(Singer.class);
        singerBean.sing();
        context.close();
    }
}
