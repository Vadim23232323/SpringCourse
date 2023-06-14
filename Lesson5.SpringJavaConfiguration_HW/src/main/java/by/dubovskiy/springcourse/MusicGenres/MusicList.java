package by.dubovskiy.springcourse.MusicGenres;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MusicList {
    List<String> musicList = new ArrayList<>();

    public List<String> musicList() {

    }
}
