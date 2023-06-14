package by.dubovskiy.springcourse;

import java.util.List;

public class Random {

    public static String getRandomSong(List<String> songList) {
        java.util.Random random = new java.util.Random();
        int randomIndex = random.nextInt(songList.size());
        return songList.get(randomIndex);
    }
}
