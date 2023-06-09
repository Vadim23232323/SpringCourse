package by.dubovskiy.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.Member;

public class TestSpring {
    public static void main(String[] args) {

        // ---------------------------------- Создание бенов через аннотацию @Component --------------------------------

//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//
//        Music music = context.getBean("musicRapBean", Music.class);
//
//        MusicPlayer musicPlayer = new MusicPlayer();
//
//        musicPlayer.PlayMusic();
//
//        context.close();

        // ------------------------ Внедрение зависимости через аннотацию @Autowired в конструктор  --------------------

//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//
//        MusicPlayer musicPlayer = context.getBean("musicPlayerBean", MusicPlayer.class);
//
//        musicPlayer.PlayMusic();
//
//        context.close();

        // ------------------------ Внедрение зависимости через аннотацию @Autowired в сетер  --------------------

//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//
//        MusicPlayer musicPlayer = context.getBean("musicPlayerBean", MusicPlayer.class);
//
//        musicPlayer.PlayMusic();
//
//        context.close();

        // ------------------------Класс Computer внедрение зависимости через аннотацию @Autowired  --------------------

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Computer computer = context.getBean("computer", Computer.class);

        System.out.println(computer);

        context.close();


    }
}
