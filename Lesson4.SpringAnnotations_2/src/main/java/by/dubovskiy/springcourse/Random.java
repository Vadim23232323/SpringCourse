package by.dubovskiy.springcourse;

import by.dubovskiy.springcourse.MusicGenres.MusicGenres;

import java.util.List;

public class Random {

    public static String getRandomSong(List<String> songList) {
        java.util.Random random = new java.util.Random();
        int randomIndex = random.nextInt(songList.size());
        return songList.get(randomIndex);
    }

    public static MusicGenres getRandomGenres() {
        java.util.Random random = new java.util.Random();
        int randomIndex = random.nextInt(MusicGenres.values().length);
        return MusicGenres.values()[randomIndex];
    }

}
