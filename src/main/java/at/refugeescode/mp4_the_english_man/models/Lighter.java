package at.refugeescode.mp4_the_english_man.models;

import org.springframework.stereotype.Component;

@Component
public class Lighter {

    public void lit(Cigar cigar) {
        cigar.setIsLit(true);
    }

}
