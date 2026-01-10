package kz.spring.assylzhan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @Assylzhan Baimuratov
 **/
@Component
public class MusicPlayer {

    private RockMusic rockMusic;
    private ClassicalMusic classicalMusic;

    public MusicPlayer(RockMusic rockMusic, ClassicalMusic classicalMusic) {
         this.rockMusic = rockMusic;
         this.classicalMusic = classicalMusic;
    }

    public String playMusic() {
        return classicalMusic.getSong();
    }

}
