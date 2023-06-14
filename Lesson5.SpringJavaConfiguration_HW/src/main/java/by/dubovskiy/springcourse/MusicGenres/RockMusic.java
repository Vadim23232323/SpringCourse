package by.dubovskiy.springcourse.MusicGenres;

import by.dubovskiy.springcourse.Music;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

// аннотация @Component для автоматического создания бенов
@Component("musicRockBean")
public class RockMusic implements Music {

    @Override
    public List<String> getSong() {
        List<String> songList = new ArrayList<>();
        songList.add("Ария - Ангел.");
        songList.add("Нервы - Вороны.");
        songList.add("Земфира - Жить в твоей голове.");
        return songList;
    }

}
