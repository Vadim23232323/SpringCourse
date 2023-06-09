package by.dubovskiy.springcourse;

import by.dubovskiy.springcourse.MusicGenres.MusicGenres;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

// Аннотация @Component для автоматического создания бенов
@Component("musicPlayerBean")
public class MusicPlayer {
    @Value("${musicPlayer.name}")
    private String name;

    @Value("${musicPlayer.volume}")
    private int volume;

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    private Music music1;
    private Music music2;
    private Music music3;

    @Autowired
    public MusicPlayer(@Qualifier("musicRapBean") Music music1, @Qualifier("musicRockBean") Music music2, @Qualifier("musicClasscalBean") Music music3) {
        this.music1 = music1;
        this.music2 = music2;
        this.music3 = music3;
    }


    public String PlayMusic(MusicGenres musicGenres) {

        String playing = null;

        if (musicGenres == MusicGenres.RAP_MUSIC) {
            String randomSong = Random.getRandomSong(music1.getSong());
            playing = randomSong;
        }

        if (musicGenres == MusicGenres.ROCK_MUSIC) {
            String randomSong = Random.getRandomSong(music2.getSong());
            playing = randomSong;
        }
        if (musicGenres == MusicGenres.CLASSICAL_MUSIC) {
            String randomSong = Random.getRandomSong(music3.getSong());
            playing = randomSong;
        }

        return "Играет композиция: " + playing + " Жанр: " + musicGenres;
    }



}
