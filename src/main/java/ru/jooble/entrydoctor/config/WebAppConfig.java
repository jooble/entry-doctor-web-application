package ru.jooble.entrydoctor.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import ru.jooble.entrydoctor.controller.ControllerPackageMarker;
import ru.jooble.entrydoctor.service.ServicePackageMarker;

@Configuration
@EnableWebMvc
@ComponentScan(basePackageClasses = {ControllerPackageMarker.class,
        ServicePackageMarker.class})
public class WebAppConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addResourceHandlers(final ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/**").addResourceLocations("/static/");
    }
}
