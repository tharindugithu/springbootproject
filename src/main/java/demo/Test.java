package demo;

import org.springframework.stereotype.Component;

@Component
public class Test {
    public void checkOut(String tHARI){
        //aspects , there are the cross cutting concerns
        //login
        //auth and authorization
        //
        System.out.println("CheckOut is Called");
    }
}