package kz.spring.assylzhan;

import org.springframework.stereotype.Component;

/**
 * @Assylzhan Baimuratov
 **/
@Component
public class ClassicalMusic implements Music {
    @Override
    public String getSong() {
        return "Some classic music";
    }
}
