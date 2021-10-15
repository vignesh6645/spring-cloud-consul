package com.example.springconsuldemo;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(value = "my")
public class MyConfig {
    private String UserName;
    private String password;
}
