package by.dubovskiy.springcourse;

import org.springframework.stereotype.Component;

// аннотация @Component для автоматического создания бенов
@Component("musicClasscalBean")
public class ClassicalMusic implements Music{

    // Приватный конструктор для класса, для создания factory-method
    private ClassicalMusic(){}

    public static ClassicalMusic getClassicalMusic(){
        return new ClassicalMusic();
    }

    public void myInit(){
        System.out.println("Инициализация бина");
    }

    public void myDestroy(){
        System.out.println("Разрушение бина");
    }

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }


}
