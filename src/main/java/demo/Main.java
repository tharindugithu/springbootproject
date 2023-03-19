package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
        ShoppingCart shoppingCart = context.getBean(ShoppingCart.class);
        //Test t = context.getBean(Test.class);
        // t.checkOut("Y");
        shoppingCart.checkOut("tHARI");
    }

}
