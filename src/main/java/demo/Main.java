package demo;
import  org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        Doctor d = context.getBean(Doctor.class);//get value from the class type
        d.assist();
        System.out.println(d.getQualification());
        //System.out.println(d.getQualification()); active line 9 in spring.xml
        //d.getNurse().assist(); active line 10 in spring.xml
        Nurse n = (Nurse) context.getBean("nurse");//get the value from id
        //n.assist();
        Staff s = context.getBean(Doctor.class);//get value from the class type
        //s.assist();

    }
}
