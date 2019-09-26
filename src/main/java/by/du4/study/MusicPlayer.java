package by.du4.study;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {

    private List<Music> musicList = new ArrayList<>();

    private String name;

    private int volume;

    public MusicPlayer() {
    }

    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }

    public void playMusic(){
        musicList.forEach(music -> System.out.println(music.getSong()));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }


    @Override
    public String toString() {
        return "MusicPlayer{" +
                "music=" + musicList +
                ", name='" + name + '\'' +
                ", volume=" + volume +
                '}';
    }
}
