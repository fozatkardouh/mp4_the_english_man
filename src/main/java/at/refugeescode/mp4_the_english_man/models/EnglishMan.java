package at.refugeescode.mp4_the_english_man.models;

import org.springframework.stereotype.Component;

@Component
public class EnglishMan {

    private Lighter lighter;
    private Monocle monocle;

    private boolean hadSmoked;
    private boolean hadRead;

    public EnglishMan(Lighter lighter, Monocle monocle) {
        this.lighter = lighter;
        this.monocle = monocle;
    }

    public void smoke(Cigar cigar) {
        lighter.lit(cigar);
        try {
            hadSmoked = cigar.smoke();
        } catch (Exception ignored) {
        }

    }

    public void read(NewsPaper newsPaper) {
        monocle.read(newsPaper);
        hadRead = true;
    }

    public boolean hadAGoodDay() {
        return hadRead && hadSmoked;
    }

}
