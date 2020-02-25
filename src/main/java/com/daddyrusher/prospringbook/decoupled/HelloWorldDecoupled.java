package com.daddyrusher.prospringbook.decoupled;

import com.daddyrusher.prospringbook.models.HelloWorldMessageProvider;
import com.daddyrusher.prospringbook.models.MessageProvider;
import com.daddyrusher.prospringbook.models.MessageRenderer;
import com.daddyrusher.prospringbook.models.StandardOutMessageRenderer;

public class HelloWorldDecoupled {
    public static void main(String[] args) {
        MessageRenderer messageRenderer = new StandardOutMessageRenderer();
        MessageProvider messageProvider = new HelloWorldMessageProvider();
        messageRenderer.setMessageProvider(messageProvider);
        messageRenderer.render();
    }
}
