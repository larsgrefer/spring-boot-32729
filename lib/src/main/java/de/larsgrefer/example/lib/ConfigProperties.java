package de.larsgrefer.example.lib;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("new")
public class ConfigProperties {

    private int serverSslPort;

    public int getServerSslPort() {
        return serverSslPort;
    }

    public void setServerSslPort(int serverSslPort) {
        this.serverSslPort = serverSslPort;
    }
}
