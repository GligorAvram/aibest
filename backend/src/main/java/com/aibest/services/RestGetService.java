package com.aibest.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RestGetService {

    private RestTemplate restTemplate;

    public RestGetService(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

    public String getCompanyDetails(String url) {
        return this.restTemplate.getForObject(url, String.class);
    }
}
