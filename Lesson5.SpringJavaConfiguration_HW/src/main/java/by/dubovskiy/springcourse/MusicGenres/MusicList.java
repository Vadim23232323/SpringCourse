package by.dubovskiy.springcourse.MusicGenres;

import by.dubovskiy.springcourse.Music;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component("musicListBean")
public class MusicList implements Music{

    List<String> musicList = new ArrayList<>();

    @Autowired
    public List<String> musicList(@Qualifier("musicRapBean") Music music1, @Qualifier("musicRockBean") Music music2, @Qualifier("musicClasscalBean") Music music3) {
        musicList.addAll(music1.getSong());
        musicList.addAll(music2.getSong());
        musicList.addAll(music3.getSong());
        return  musicList;
    }

    @Override
    public List<String> getSong() {
        return musicList;
    }

}
