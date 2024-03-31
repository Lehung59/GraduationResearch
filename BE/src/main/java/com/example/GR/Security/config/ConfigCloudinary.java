package com.example.GR.Security.config;

import com.cloudinary.Cloudinary;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import java.util.HashMap;
import java.util.Map;

@Configuration
public class ConfigCloudinary {

    @Bean
    public Cloudinary cloudinary() {
        Map<String, String> config = new HashMap<>();
        config.put("cloud_name", "dmoc346uu");
        config.put("api_key", "173291451747369");
        config.put("api_secret", "CN0CG-CLOUDINARY_URL=cloudinary://173291451747369:TIic26sc2fv_N9lmBhJ1aJjjfzI@dmoc346uu");
        config.put("secure", "true");

        return new Cloudinary(config);
    }


}