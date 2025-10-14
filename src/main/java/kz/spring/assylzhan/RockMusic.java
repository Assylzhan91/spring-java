package kz.spring.assylzhan;

import org.springframework.stereotype.Component;

/**
 * @Assylzhan Baimuratov
 **/
@Component
public class RockMusic implements Music {

    private RockMusic() {
    }

    public static RockMusic getRockMusic() {
        return new RockMusic();
    }

    @Override
    public String getSong() {
        return "Some rock music";
    }

}
