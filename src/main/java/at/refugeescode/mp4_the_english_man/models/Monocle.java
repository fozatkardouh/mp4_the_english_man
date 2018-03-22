package at.refugeescode.mp4_the_english_man.models;

import org.springframework.stereotype.Component;

@Component
public class Monocle {

    public void read(NewsPaper newsPaper) {
        newsPaper.read();
    }

}
