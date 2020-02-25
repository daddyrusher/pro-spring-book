package com.daddyrusher.prospringbook.annotated;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.stereotype.Service;

import java.util.StringJoiner;

@Service
public class InjectSimpleSpel {
    @Value("#{injectSimpleConfig.name}")
    private String name;
    @Value("#{injectSimpleConfig.age + 1}")
    private int age;
    @Value("#{injectSimpleConfig.height}")
    private float height;
    @Value("#{injectSimpleConfig.programmer}")
    private boolean programmer;
    @Value("#{injectSimpleConfig.ageInSeconds}")
    private Long ageInSeconds;

    @Override
    public String toString() {
        return new StringJoiner(", ", InjectSimpleSpel.class.getSimpleName() + "[", "]")
                .add("name='" + name + "'")
                .add("age=" + age)
                .add("height=" + height)
                .add("programmer=" + programmer)
                .add("ageInSeconds=" + ageInSeconds)
                .toString();
    }

    public static void main(String[] args) {
        GenericXmlApplicationContext context = new GenericXmlApplicationContext();
        context.load("classpath:spring/app-context-annotation.xml");
        context.refresh();

        InjectSimpleSpel injectSimpleSpel = (InjectSimpleSpel) context.getBean("injectSimpleBean");
        System.out.println(injectSimpleSpel);
        context.close();
    }
}
