package by.dubovskiy.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

// Аннотация @Component для автоматического создания бенов
@Component("musicPlayerBean")
public class MusicPlayer {

    // @Autowired
    private Music music;

    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;
    private RapMusic rapMusic;
    private List<Music> musicList = new ArrayList<>();
    private String name;
    private int volume;

    public MusicPlayer(){}


    // Аннотация @Autowired, контейнер Spring будет искать соответствующий компонент (бин) и автоматически внедрять его в конструктор.
    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, RapMusic rapMusic, RockMusic rockMusic) {
        this.classicalMusic = classicalMusic;
        this.rapMusic = rapMusic;
        this.rockMusic = rockMusic;
    }

    // Метод воспроизведения одной композиции
    public String PlayMusic() {
        return "Играет композиция: " + classicalMusic.getSong();
//        System.out.println("Играет композиция: " + classicalMusic.getSong());
//        System.out.println("Играет композиция: " + rapMusic.getSong());
//        System.out.println("Играет композиция: " + rockMusic.getSong());
    }

    // Метод воспроизведения листа композиций
    public void PlayMusicList() {
        musicList.forEach(music -> System.out.println("Играет композиция: " + music.getSong()));
    }

    // Аннотация @Autowired, контейнер Spring будет искать соответствующий компонент (бин) и автоматически внедрять его в сетер.
    //@Autowired
    public void setMusic(Music music) {
        this.music = music;
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

}
