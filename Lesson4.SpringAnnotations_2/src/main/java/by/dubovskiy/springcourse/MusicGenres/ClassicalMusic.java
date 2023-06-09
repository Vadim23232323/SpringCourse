package by.dubovskiy.springcourse.MusicGenres;

import by.dubovskiy.springcourse.Music;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;

// аннотация @Component для автоматического создания бенов
@Component("musicClasscalBean")
@Scope("singleton")
public class ClassicalMusic implements Music {

    // Приватный конструктор для класса, для создания factory-method
    private ClassicalMusic(){}

    public static ClassicalMusic getClassicalMusic(){
        return new ClassicalMusic();
    }

    // аннотация @PostConstruct
    @PostConstruct
    public void myInit(){
        System.out.println("Инициализация бина");
    }

    @PreDestroy
    public void myDestroy(){
        System.out.println("Разрушение бина");
    }

    @Override
    public List<String> getSong() {
        List<String> songList = new ArrayList<>();
        songList.add("О, Фортуна «Кармина Бурана»");
        songList.add("«Времена года» Антонио Вивальди");
        songList.add("«Лунная соната» Людвига ван Бетховена");
        return songList;
    }


}
