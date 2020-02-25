package com.daddyrusher.prospringbook.annotated;

import com.daddyrusher.prospringbook.models.HelloWorldMessageProvider;
import com.daddyrusher.prospringbook.models.MessageProvider;
import com.daddyrusher.prospringbook.models.MessageRenderer;
import com.daddyrusher.prospringbook.models.StandardOutMessageRenderer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.daddyrusher"})
public class HelloWorldConfiguration {
    @Bean
    public MessageRenderer renderer() {
        MessageRenderer messageRenderer = new StandardOutMessageRenderer();
        messageRenderer.setMessageProvider(provider());
        return messageRenderer;
    }

    @Bean
    public MessageProvider provider() {
        return new HelloWorldMessageProvider();
    }

}
