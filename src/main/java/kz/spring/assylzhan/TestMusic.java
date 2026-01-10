package kz.spring.assylzhan;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Assylzhan Baimuratov
 **/
public class TestMusic {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Computer computer = context.getBean("computer", Computer.class);
        System.out.println(computer);

        context.close();
    }

}
