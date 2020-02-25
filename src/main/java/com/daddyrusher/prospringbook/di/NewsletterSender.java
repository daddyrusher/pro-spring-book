package com.daddyrusher.prospringbook.di;

public interface NewsletterSender {
    void setSmtpServer(String smtpServer);
    String getSmtpServer();
    void setFromAddress(String address);
    String getFromAddress();
    void send();
}
