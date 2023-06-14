package by.dubovskiy.springcourse;

import by.dubovskiy.springcourse.config.SpringConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestSpring {
    public static void main(String[] args) {

        // ------------------------Класс Computer внедрение зависимости через аннотацию @Qualifier --------------------

//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//
//        Computer computer = context.getBean("computer", Computer.class);
//
//        System.out.println(computer);
//
//        MusicPlayer musicPlayer = context.getBean("musicPlayerBean", MusicPlayer.class);
//
//        System.out.println("Громкость - " + musicPlayer.getVolume() + " %");
//
//        context.close();

        // ---------------------------------------- Класс конфигурации SpringConfig -----------------------------------

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                SpringConfig.class
        );

        MusicPlayer musicPlayer = context.getBean("musicPlayerBean", MusicPlayer.class);

        for (int i = 0; i < 20; i++) {
            System.out.println(musicPlayer.PlayMusic());
        }

        context.close();

    }
}
