package com.daddyrusher.prospringbook.ch3.config;

import com.daddyrusher.prospringbook.ch3.AbstractLookupDemoBean;
import com.daddyrusher.prospringbook.ch3.DemoBean;
import com.daddyrusher.prospringbook.ch3.annotated.Singer;
import com.daddyrusher.prospringbook.ch3.StandardLookupDemoBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.util.StopWatch;

public class LookupConfigDemo {
    @Configuration
    @ComponentScan(basePackages = {"com.daddyrusher.prospringbook.ch3"})
    public static class LookupConfig {}

    public static void main(String[] args) {
        GenericApplicationContext context = new AnnotationConfigApplicationContext(LookupConfig.class);

        DemoBean abstractBean = context.getBean("abstractLookupDemoBean", AbstractLookupDemoBean.class);
        DemoBean standardBean = context.getBean("standardLookupDemoBean", StandardLookupDemoBean.class);
        displayInfo("abstractLookupBean", abstractBean);
        displayInfo("standardLookupBean", standardBean);

        context.close();
    }

    public static void displayInfo(String beanName, DemoBean bean) {
        Singer singer1 = bean.getMySinger();
        Singer singer2 = bean.getMySinger();

        System.out.println(beanName + ": Singer Instances the same? " + (singer1 == singer2));

        StopWatch stopWatch = new StopWatch();
        stopWatch.start("lookupDemo");
        for (int x = 0; x < 100000; x++) {
            Singer singer = bean.getMySinger();
            /*singer.sing();*/
        }

        stopWatch.stop();

        System.out.println("100000 gets took " + stopWatch.getTotalTimeMillis() + " ms");
    }
}
