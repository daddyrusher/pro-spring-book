package com.daddyrusher.prospringbook.models;

public interface ArtworkSender {
    void sendNetwork(String artworkPath);
    String getFriendlyName();
    String getShortName();
}
