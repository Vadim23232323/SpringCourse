package by.dubovskiy.springcourse;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan("by.dubovskiy.springcourse")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {

}
