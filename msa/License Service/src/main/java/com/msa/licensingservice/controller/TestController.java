package com.msa.licensingservice.controller;

import com.msa.licensingservice.service.LicenseService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/test")
@RequiredArgsConstructor
public class TestController {

    private final LicenseService licenseService;

    @GetMapping("")
    public void property(){
        licenseService.getProperty();
    }

}
