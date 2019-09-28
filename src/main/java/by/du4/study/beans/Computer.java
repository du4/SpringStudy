package by.du4.study.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Computer  {
    private static int id = 0;
    private MusicPlayer musicPlayer;

    @Autowired
    public Computer(MusicPlayer musicPlayer) {
        id ++;
        this.musicPlayer = musicPlayer;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "id=" + id +
                ", musicPlayer=" + musicPlayer +
                '}';
    }

    public MusicPlayer getMusicPlayer() {
        return musicPlayer;
    }
}
