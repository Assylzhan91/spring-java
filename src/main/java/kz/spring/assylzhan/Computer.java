package kz.spring.assylzhan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Computer {

    private final int id;
    private final MusicPlayer musicPlayer;
    @Autowired
    public Computer(final MusicPlayer musicPlayer) {
        this.id = 1;
        this.musicPlayer = musicPlayer;
    }

    @Override
    public String toString() {
        return "Computer{" + "id=" + id + ", musicPlayer=" + musicPlayer.playMusic() +'}';
    }
}
