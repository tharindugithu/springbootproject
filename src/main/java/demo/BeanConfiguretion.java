package demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "demo")
public class BeanConfiguretion {

//   @Bean//this is the bean that u load
//    public Doctor doctor(){
//       return new Doctor();
//   }

}
