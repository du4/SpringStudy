package by.du4.study.beans;

import by.du4.study.Music;
import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music {

    private String [] songs = {
            "Satie - Trois Gymnopédies",
            "Saint-Saens - The Carnival of the Animals",
            "Chopin - Nocturnes"
    };

    @Override
    public String getSong() {
        return songs[randomNumber(songs.length)];
    }

}
