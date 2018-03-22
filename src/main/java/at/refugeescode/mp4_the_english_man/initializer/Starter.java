package at.refugeescode.mp4_the_english_man.initializer;

import at.refugeescode.mp4_the_english_man.models.Cigar;
import at.refugeescode.mp4_the_english_man.models.EnglishMan;
import at.refugeescode.mp4_the_english_man.models.NewsPaper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Starter {

    @Autowired
    private EnglishMan englishMan;

    @Bean
    public ApplicationRunner startPoint() {
        return args -> {
            englishMan.read(new NewsPaper());
            englishMan.smoke(new Cigar());
            boolean hadAGoodDay = englishMan.hadAGoodDay();
            if (hadAGoodDay) {
                System.out.println("English man had a great day!");
            }
            else {
                System.out.println("English man had a shitty day!");
            }
        };
    }

}
