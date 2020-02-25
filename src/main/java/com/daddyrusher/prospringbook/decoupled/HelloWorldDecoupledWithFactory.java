package com.daddyrusher.prospringbook.decoupled;

import com.daddyrusher.prospringbook.models.MessageProvider;
import com.daddyrusher.prospringbook.models.MessageRenderer;
import com.daddyrusher.prospringbook.models.MessageSupportFactory;

public class HelloWorldDecoupledWithFactory {
    public static void main(String[] args) {
        MessageRenderer messageRenderer = MessageSupportFactory.getInstance().getMessageRenderer();
        MessageProvider messageProvider = MessageSupportFactory.getInstance().getMessageProvider();
        messageRenderer.setMessageProvider(messageProvider);
        messageRenderer.render();
    }
}
