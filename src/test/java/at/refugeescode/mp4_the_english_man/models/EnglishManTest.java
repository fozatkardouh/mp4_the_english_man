package at.refugeescode.mp4_the_english_man.models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;


@ExtendWith(SpringExtension.class)
@SpringBootTest
class EnglishManTest {

    @Autowired
    private EnglishMan englishMan;

    @Test
    void hadAGoodDay() {
        englishMan.read(new NewsPaper());
        englishMan.smoke(new Cigar());
        boolean hadAGoodDay = englishMan.hadAGoodDay();
        Assertions.assertEquals(true, hadAGoodDay);
    }

}