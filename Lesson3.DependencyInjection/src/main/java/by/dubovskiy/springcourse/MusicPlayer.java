package by.dubovskiy.springcourse;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private Music music;

    private List<Music> musicList = new ArrayList<>();
    private String name;
    private int volume;

    public MusicPlayer(){}

    public MusicPlayer(Music music) {
        this.music = music;
    }

    // Метод воспроизведения одной композиции
    public void PlayMusic() {
        System.out.println("Играет композиция: " + music.getSong());
    }

    // Метод воспроизведения листа композиций
    public void PlayMusicList() {
        musicList.forEach(music -> System.out.println("Играет композиция: " + music.getSong()));
    }

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
