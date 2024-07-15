package com.java.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;

@Configuration
public class FileUrl_config {
    // 이미지나 동영상, 파일업로드 관련해서 다른 폴더를 연결할 때 설정
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/upload/**")
                .addResourceLocations("file:///Users/igyuwon/upload/");

        registry.addResourceHandler("/uploadImages/**")
                .addResourceLocations("file:///Users/igyuwon/images/");


    }


}
