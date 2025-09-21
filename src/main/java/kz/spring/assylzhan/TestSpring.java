package kz.spring.assylzhan;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Assylzhan Baimuratov
 **/
public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        TestBean testBean =  context.getBean("testBean", TestBean.class);
        System.out.println(testBean.getName());
        context.close();
    }

}
