package by.dubovskiy.springcourse;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestSpring {
    public static void main(String[] args) {

        // ------------------------Класс Computer внедрение зависимости через аннотацию @Qualifier --------------------

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        Computer computer = context.getBean("computer", Computer.class);

        System.out.println(computer);

        MusicPlayer musicPlayer = context.getBean("musicPlayerBean", MusicPlayer.class);

        System.out.println("Громкость - " + musicPlayer.getVolume() + " %");

        context.close();

    }
}
