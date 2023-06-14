package by.dubovskiy.springcourse.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("by.dubovskiy.springcourse")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {

    }
