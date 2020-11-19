package com.itwa.service;

import java.util.Objects;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import com.itwa.domain.ApplicationConfiguration;
import com.itwa.util.YamlConfigUtils;

@Service
public class ConfigurationService {
    private static final Logger logger = LoggerFactory.getLogger(ConfigurationService.class);

    private final ApplicationConfiguration applicationConfiguration;

    public ConfigurationService() {
        this.applicationConfiguration = Objects.requireNonNull(YamlConfigUtils
                        .loadYamlConfig(getConfigPath(), ApplicationConfiguration.class),
                "Application configuration can't be null.");

        logger.debug("Application configuration: {}.", applicationConfiguration);
    }

    public ApplicationConfiguration getApplicationConfiguration() {
        return applicationConfiguration;
    }

    private static String getConfigPath() {
        String configPath = System.getProperty("application.config.path");

        if (!StringUtils.hasText(configPath)) {
            throw new IllegalStateException("Can't start application without config path.");
        }
        return configPath;
    }
}
