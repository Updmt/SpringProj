package alishev.course;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private List<Music> musicList = new ArrayList<>();

    /*private Music music;

    //IoC
    public MusicPlayer(Music music) {
        this.music = music;
    }

    public void setMusic(Music music) {
        this.music = music;
    }*/


    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    /*public void playMusic2() {
        System.out.println("Playing: " + music.getSong());
    }*/

    public void playMusicList() {
        for (Music song : musicList) {
            System.out.println("Playing: " + song.getSong());
        }
    }
}
