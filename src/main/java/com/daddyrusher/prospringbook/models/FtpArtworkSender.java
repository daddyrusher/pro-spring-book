package com.daddyrusher.prospringbook.models;

public class FtpArtworkSender implements ArtworkSender {
    @Override
    public void sendNetwork(String artworkPath) {

    }

    @Override
    public String getFriendlyName() {
        return "File transfer protocol";
    }

    @Override
    public String getShortName() {
        return "ftp";
    }
}
