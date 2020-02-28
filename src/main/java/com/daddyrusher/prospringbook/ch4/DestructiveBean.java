package com.daddyrusher.prospringbook.ch4;

import org.springframework.context.support.GenericXmlApplicationContext;

import java.io.File;

public class DestructiveBean {
    private File file;
    private String filePath;

    public void afterPropertiesSet() throws Exception {
        System.out.println("Initializing bean");

        if (filePath == null) {
            throw new IllegalArgumentException("You must specify the filePath property of " + DestructiveBean.class);
        }

        this.file = new File(filePath);
        this.file.createNewFile();
        System.out.println("File exists: " + file.exists());
    }

    public void destroy() {
        System.out.println("Destroying bean");

        if (!file.delete()) {
            System.err.println("ERROR: failed to delete file");
        }

        System.out.println("File exists: " + file.exists());
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public static void main(String[] args) {
        GenericXmlApplicationContext context = new GenericXmlApplicationContext();
        context.load("classpath:spring/app-context-06.xml");
        context.refresh();

        DestructiveBean destructiveBean = (DestructiveBean) context.getBean("destructiveBean");

        System.out.println("Calling destroy");
        context.destroy();
        System.out.println("Called destroy");

    }
}
