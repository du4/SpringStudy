package by.du4.study.beans;

import by.du4.study.Music;
import org.springframework.stereotype.Component;

@Component
public class IdmMusic implements Music {
    private String [] songs = {
            "Aphex Twin - Come to Daddy",
            "Autechre - Nul",
            "Orbital - Chime"
    };

    @Override
    public String getSong() {
        return songs[randomNumber(songs.length)];
    }
}
