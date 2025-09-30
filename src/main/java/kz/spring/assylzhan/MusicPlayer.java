package kz.spring.assylzhan;

/**
 * @Assylzhan Baimuratov
 **/
public class MusicPlayer {
    private Music music;
    private String songName;
    private int volume;

    public String getSongName() {
        return songName;
    }

    public void setSongName(final String songName) {
        this.songName = songName;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(final int volume) {
        this.volume = volume;
    }

    public MusicPlayer(Music music) {
        this.music = music;
    }

    public MusicPlayer() {}

    public void playMusic() {
        System.out.println("Playing: " + music.getSong());
    }
    public void setMusic(Music music) {
        this.music = music;
    }
}
