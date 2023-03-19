package demo;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AuthenticationAspect {

    //within used for which type of class
    //..* mean all the class in demo package
    //demo.class_name.* --> class_name all methods
    @Pointcut("within(demo.*)")
    public void authenticationPointCut(){
        //System.out.println("hi");
    }
    //FOR SPECIFIC CLASS --> ("within(demo.Test)")
    //demo..* --> package or root of package
    @Pointcut("within(demo.*)")
    public void authorizationPointCut(){ }

    @Around(" authenticationPointCut() && authorizationPointCut() ")
    public void aroundMethod(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("before");
        proceedingJoinPoint.proceed();
        System.out.println("after");
    }

//    @Before(" authenticationPointCut() && authorizationPointCut() ")
//    public void authenticate(){
//        System.out.println("Authenticating processing");
//    }
}
