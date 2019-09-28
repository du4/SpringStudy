package by.du4.study.beans;

import by.du4.study.Music;
import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music {

    private String [] songs = {
            "Nirvana - Smells Like Teen Spirit",
            "Guns ‘n’ Roses - November Rain",
            "Metallica - Enter Sandman"
    };

    @Override
    public String getSong() {
        return songs[randomNumber(songs.length)];
    }




}
