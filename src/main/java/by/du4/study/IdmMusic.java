package by.du4.study;

import org.springframework.stereotype.Component;

//@Component
public class IdmMusic implements Music {
    @Override
    public String getSong() {
        return "Aphex Twin - Come to Daddy";
    }
}
