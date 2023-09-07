package com.msa.licensingservice.service;

import com.msa.licensingservice.config.ServiceConfig;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@Log4j2
@RequiredArgsConstructor
public class LicenseService {

    private final ServiceConfig config;

    public void getProperty() {
        log.info("{}", config.getProperty());
    }
}
