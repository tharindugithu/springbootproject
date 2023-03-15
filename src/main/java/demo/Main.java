package demo;
import org.springframework.beans.factory.annotation.Autowired;
import  org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Doctor d = context.getBean(Doctor.class);
//        Staff s = context.getBean(Doctor.class);
//        s.assist();
        d.assist();
    }

}
