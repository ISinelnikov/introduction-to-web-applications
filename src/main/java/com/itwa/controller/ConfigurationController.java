package com.itwa.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.itwa.domain.ApplicationConfiguration;
import com.itwa.service.ConfigurationService;

@RestController
public class ConfigurationController {
    private final ConfigurationService configurationService;

    public ConfigurationController(ConfigurationService configurationService) {
        this.configurationService = configurationService;
    }

    @GetMapping(value = "/api/application-configuration")
    public ResponseEntity<ApplicationConfiguration> getApplicationConfiguration() {
        return ResponseEntity.ok(configurationService.getApplicationConfiguration());
    }
}
