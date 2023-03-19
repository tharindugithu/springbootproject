package demo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component // what ever in demo package we need it
public class LogginAspect {
    //we want to call and whre we want to call
    //this is the method we want to call all the times before execute
    //star for any return type
    //execution used for which type of method excute after or before this
    @Before("execution(*  demo.ShoppingCart.checkOut(..))")
    public void beforeLogger(JoinPoint jp){
        String arg = (String) jp.getArgs()[0];//get argument
        System.out.println("Before Logging "+arg);
    }
    @Before("args(name)")
    public void stringArg(String name){
        System.out.println(name);
    }

    /*
    * if checkOut() is need argument
    * need to change like below
    * "execution(*  *.*.checkOut(..))"
    * */
    //2nd * for any package
    //3rd * for any class
    @After("execution(* demo.ShoppingCart.checkOut(..))")
    public void afterLogger(){
        System.out.println("After Logging");
    }
}
