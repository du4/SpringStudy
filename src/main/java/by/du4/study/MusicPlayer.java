package by.du4.study;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MusicPlayer {

    private List<Music> musicList = new ArrayList<>();

    @Autowired
    private ClassicalMusic classicalMusic;
    @Autowired
    public  RockMusic rockMusic;

    private String name;

    private int volume;

    public MusicPlayer() {
    }

    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }

    public String playMusic(){
        return classicalMusic.getSong() + " " + rockMusic.getSong();
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
