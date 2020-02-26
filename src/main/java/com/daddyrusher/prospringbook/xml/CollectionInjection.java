package com.daddyrusher.prospringbook.xml;

import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

@Service
public class CollectionInjection {
    @Resource(name = "map")
    private Map<String, Object> map;

    @Resource(name = "props")
    private Properties props;

    @Resource(name = "set")
    private Set set;

    @Resource(name = "list")
    private List list;

    public static void main(String[] args) {
        GenericXmlApplicationContext context = new GenericXmlApplicationContext();
        context.load("classpath:spring/app-context-xml.xml");
        context.refresh();

        CollectionInjection instance = (CollectionInjection) context.getBean("injectCollection");
        instance.displayInfo();

        context.close();
    }

    public void displayInfo() {
        System.out.println("Map contents: \n");
        map.forEach((key, value) -> System.out.println("Key: " + key + " - Value: " + value));
        System.out.println("\nProperties contents: \n");
        props.forEach((key, value) -> System.out.println("Key: " + key + " - Value: " + value));
        System.out.println("\nSet contents: \n");
        set.forEach(value -> System.out.println("Value: " + value));
        System.out.println("\nList contents: \n");
        list.forEach(value -> System.out.println("Value: " + value));
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }

    public void setProps(Properties props) {
        this.props = props;
    }

    public void setSet(Set set) {
        this.set = set;
    }

    public void setList(List list) {
        this.list = list;
    }
}
