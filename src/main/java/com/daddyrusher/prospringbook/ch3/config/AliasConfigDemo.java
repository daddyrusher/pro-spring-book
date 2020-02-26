package com.daddyrusher.prospringbook.ch3.config;

import com.daddyrusher.prospringbook.ch3.annotated.Singer;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.GenericApplicationContext;

import java.util.Arrays;
import java.util.Map;

public class AliasConfigDemo {
    @Configuration
    public static class AliasBeanConfig {
       /* @Bean(name = {"johnMayer", "john", "jonathan", "johnny"})
        public Singer singer() {
            return new Singer();
        }*/
    }

    public static void main(String[] args) {
        GenericApplicationContext context = new AnnotationConfigApplicationContext(AliasBeanConfig.class);

        Map<String, Singer> beans = context.getBeansOfType(Singer.class);
        beans.forEach((key, value) -> System.out.println("id: " + key + "\n aliases: " + Arrays.toString(context.getAliases(key))));

        context.close();
    }
}
