package com.daddyrusher.prospringbook.di;

import com.daddyrusher.prospringbook.lookup.cdl.Dependency;

public class SetterInjection {
    private Dependency dependency;

    public void setDependency(Dependency dependency) {
        this.dependency = dependency;
    }

    @Override
    public String toString() {
        return dependency.toString();
    }
}
