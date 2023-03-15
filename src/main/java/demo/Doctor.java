package demo;

import org.springframework.stereotype.Component;

@Component // what ever the class create the beans out of it
public class Doctor implements Staff {

    public void assist(){
        System.out.println("Doctor is Assisting");
    }
}
