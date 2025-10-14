package kz.spring.assylzhan;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Assylzhan Baimuratov
 **/
public class TestMusic {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Music rockMusic = context.getBean("rockMusic", RockMusic.class);
        Music classicalMusic = context.getBean("classicalMusic", ClassicalMusic.class);
        System.out.println(rockMusic.getSong());
        System.out.println(classicalMusic.getSong());
        
        context.close();
    }

}
