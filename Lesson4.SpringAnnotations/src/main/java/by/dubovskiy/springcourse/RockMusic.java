package by.dubovskiy.springcourse;

import org.springframework.stereotype.Component;

// аннотация @Component для автоматического создания бенов
@Component("musicRockBean")
public class RockMusic implements Music{

    @Override
    public String getSong() {
        return "wind cries Mary";
    }
}
