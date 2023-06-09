package by.dubovskiy.springcourse;

import org.springframework.stereotype.Component;

// аннотация @Component для автоматического создания бенов
@Component("musicRapBean")
public class RapMusic implements Music{

    // аннотация @Override указывает что метод должен быть переопределен
    @Override
    public String getSong() {
        return "Loc-Dog - Счастье в простом";
    }
}
