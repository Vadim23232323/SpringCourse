package by.dubovskiy.springcourse.MusicGenres;

import by.dubovskiy.springcourse.Music;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

// аннотация @Component для автоматического создания бенов
@Component("musicRapBean")
public class RapMusic implements Music {

    @Override
    public List<String> getSong() {
        List<String> songList = new ArrayList<>();
        songList.add("Loc-Dog - Счастье в простом.");
        songList.add("25/17 - Виражи.");
        songList.add("Domino - Трюк.");
        return songList;
    }
}
