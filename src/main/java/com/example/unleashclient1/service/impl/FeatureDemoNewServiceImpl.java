package com.example.unleashclient1.service.impl;

import com.example.unleashclient1.service.FeatureDemoService;
import org.springframework.stereotype.Service;

@Service("featureNewService")
public class FeatureDemoNewServiceImpl implements FeatureDemoService {
    @Override
    public String featureDemo( String name) {
        return "In new implementation : " + name;
    }
}
