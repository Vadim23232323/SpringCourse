package by.dubovskiy.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.Member;

public class TestSpring {
    public static void main(String[] args) {

        // ------------------------Класс Computer внедрение зависимости через аннотацию @Qualifier --------------------

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Computer computer = context.getBean("computer", Computer.class);

        System.out.println(computer);

        MusicPlayer musicPlayer = context.getBean("musicPlayerBean", MusicPlayer.class);

        System.out.println("Громкость - " + musicPlayer.getVolume() + " %");

        context.close();

    }
}
