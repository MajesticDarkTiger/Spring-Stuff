package com.TwoWheelsDown.Config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


// enables your project to use config annotations to help configure stuff
@Configuration

// You must give the base package of your entity folder, then spring
// will be able to scan and make beans of them
@EntityScan(basePackages = "com.TwoWheelsDown.Entity")

// This enables your spring project to scan for your repo's
// you will give the base packages of where all your repo's live
// it will allow spring to make beans of them
@EnableJpaRepositories(basePackages = "com.TwoWheelsDown.Repo")

public class ApplicationConfig {
    
}
