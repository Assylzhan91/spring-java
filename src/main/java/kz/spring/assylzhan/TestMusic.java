package kz.spring.assylzhan;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Assylzhan Baimuratov
 **/
public class TestMusic {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Music someMusic = context.getBean("someMusic", Music.class);
        Music rockMusic = context.getBean("rockMusic", Music.class);
        MusicPlayer someMusicPlayer = new MusicPlayer(someMusic);
        MusicPlayer rockMusicPlayer = new MusicPlayer(rockMusic);
        someMusicPlayer.playMusic();
        rockMusicPlayer.playMusic();
        context.close();
    }

}
