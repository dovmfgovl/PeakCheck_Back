package com.bision.subway.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig  implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**") // 모든 경로에 대해 CORS 허용
                .allowedOrigins("http://localhost:3000") // React 개발 서버 URL
                .allowedMethods("GET", "POST") // 허용할 HTTP 메서드
                .allowCredentials(true); // 쿠키 인증 요청 허용
    }
}
