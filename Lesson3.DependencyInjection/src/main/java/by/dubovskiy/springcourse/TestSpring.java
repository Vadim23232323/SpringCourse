package by.dubovskiy.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // ------------------ Зависимость в ручную ---------------------
        // Music music = context.getBean("musicBean", Music.class);

        // MusicPlayer musicPlayer = new MusicPlayer(music);

        // ----------------- Зависимость из context, scope --------------------

//        MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//
//        firstMusicPlayer.PlayMusic();
//        firstMusicPlayer.PlayMusicList();
//
//        boolean comparison = firstMusicPlayer == secondMusicPlayer;
//
//        System.out.println(comparison);
//
//        System.out.println(firstMusicPlayer);
//        System.out.println(secondMusicPlayer);
//
//        System.out.println("Название артиста: " + firstMusicPlayer.getName());
//        System.out.println("Громкость: " + firstMusicPlayer.getVolume());

        // ----------------- Init и Destroy метод --------------------

        ClassicalMusic classicalMusic = context.getBean("musicClasscalBean", ClassicalMusic.class);

        System.out.println(classicalMusic.getSong());

        context.close();
    }
}
