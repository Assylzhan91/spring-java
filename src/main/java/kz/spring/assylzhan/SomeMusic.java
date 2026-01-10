package kz.spring.assylzhan;

import org.springframework.stereotype.Component;

/**
 * @Assylzhan Baimuratov
 **/
public class SomeMusic implements Music {

    private SomeMusic() {
    }

    public static SomeMusic getSomeMusic() {
        return new SomeMusic();
    }

    @Override
    public String getSong() {
        return "Some 1 music";
    }

}
