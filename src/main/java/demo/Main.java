package demo;
import org.springframework.beans.factory.annotation.Autowired;
import  org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfiguretion.class);
        Doctor d = context.getBean(Doctor.class);
//        Staff s = context.getBean(Doctor.class);
//        s.assist();
        //singleton design pattern only one obj create a whole application
        d.assist();
        d.setQualification("MBBS");
        System.out.println(d);
        Doctor d2 = context.getBean(Doctor.class);
        System.out.println(d2);
    }

}
