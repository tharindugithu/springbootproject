package demo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component // what ever the class create the beans out of it
//@Scope(scopeName = "singleton") by default it is singleton
@Scope(scopeName = "prototype")
public class Doctor implements Staff {
    private String qualification;

    public void assist(){
        System.out.println("Doctor is Assisting");
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "qualification='" + qualification + '\'' +
                '}';
    }
}
