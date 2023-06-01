package by.dubovskiy.springcourse;

public class MusicPlayer {
    private Music music;

    public MusicPlayer(Music music) {
        this.music = music;
    }

    public void PlayMusic() {
        System.out.println("Играет музыка: " + music.getSong());
    }
}
