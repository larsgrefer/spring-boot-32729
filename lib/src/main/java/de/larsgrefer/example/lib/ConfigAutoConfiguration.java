package de.larsgrefer.example.lib;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import javax.annotation.PostConstruct;

@AutoConfiguration
@EnableConfigurationProperties(ConfigProperties.class)
public class ConfigAutoConfiguration {

    @Autowired
    private ConfigProperties configProperties;

    @PostConstruct
    public void init() {
        System.out.println(configProperties.getServerSslPort());
    }
}
