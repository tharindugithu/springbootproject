package demo;


import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component

public class ShoppingCart {
    String name;
    public void checkOut(String tHARI) {
        name = tHARI;
        //aspects , there are the cross cutting concerns
        //login
        //auth and authorization
        //
        System.out.println("CheckOut is Called");
    }
}
