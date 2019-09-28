package by.du4.study.beans;

import by.du4.study.Music;
import by.du4.study.MusicStyle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {

    private Music musicIdm;
    private Music musicRock;
    private Music classicalMusic;
    @Autowired
    public MusicPlayer(
             @Qualifier("idmMusic") Music musicIdm,
             @Qualifier("rockMusic")Music musicRock,
             @Qualifier("classicalMusic")Music classicalMusic
    ) {
        this.musicIdm = musicIdm;
        this.musicRock = musicRock;
        this.classicalMusic = classicalMusic;
    }

    private String name;

    private int volume;

    public String playMusic( MusicStyle style){
        String songName;
        switch (style){
            case IDM: songName = musicIdm.getSong(); break;
            case ROCK: songName = musicRock.getSong();  break;
            case CLASSIC: songName = classicalMusic.getSong();  break;
            default: songName = musicIdm.getSong();
        }

        return songName;
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
                ", name='" + name + '\'' +
                ", volume=" + volume +
                '}';
    }
}
