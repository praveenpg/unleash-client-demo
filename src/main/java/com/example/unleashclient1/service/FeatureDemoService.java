package com.example.unleashclient1.service;

import org.unleash.features.annotation.Toggle;

public interface FeatureDemoService {
    @Toggle(name = "demo-toggle2", alterBean = "featureNewService")
    String featureDemo(final String name);
}
