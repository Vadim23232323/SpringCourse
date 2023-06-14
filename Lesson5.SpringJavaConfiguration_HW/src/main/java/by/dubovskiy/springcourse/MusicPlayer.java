package by.dubovskiy.springcourse;

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

    Music music;

    public MusicPlayer(@Qualifier("musicListBean") Music music) {
        this.music = music;
       // System.out.println("Передана" + music.getSong());
    }

    public String PlayMusic() {

        return "Играет композиция: " + Random.getRandomSong(music.getSong()) +  " Громкость: " + this.volume + " %";

    }
}
