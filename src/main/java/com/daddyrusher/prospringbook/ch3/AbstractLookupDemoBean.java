package com.daddyrusher.prospringbook.ch3;

import com.daddyrusher.prospringbook.ch3.annotated.Singer;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component
public abstract class AbstractLookupDemoBean implements DemoBean {
    @Lookup("singer")
    public Singer getMySinger() {
        return null;
    }

    @Override
    public void doSomething() {
        /*getMySinger().sing();*/
    }
}
