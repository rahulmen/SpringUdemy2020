package AnnotationPractice2022;

import org.springframework.context.annotation.ComponentScan;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@ComponentScan("AnnotationPractice2022")
public class BeanInitialiser {

    @PostConstruct
    public void postConstructorMessage(){
        System.out.println("Bean Initialisee");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Beans are destroyed");
    }


}
