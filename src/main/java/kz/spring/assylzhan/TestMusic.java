package kz.spring.assylzhan;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Assylzhan Baimuratov
 **/
public class TestMusic {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //Music music = context.getBean("musicBean", Music.class);
        //MusicPlayer musicPlayer = new MusicPlayer(music);
        MusicPlayer musicPlayer1 = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer musicPlayer2 = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer1.setSongName("Second song ");
        System.out.println(musicPlayer1.getSongName());
        System.out.println(musicPlayer2.getSongName());
        context.close();
    }

}
