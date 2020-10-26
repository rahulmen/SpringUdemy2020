package SpringScopeAnnotationWithoutXml2;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Configuration
@ComponentScan("SpringScopeAnnotationWithoutXml2")
public class BeanInitialiser {

    @PostConstruct
    public void initMethod(){
        System.out.println("Bean are created");
    }

    @PreDestroy
    public void destroyMethod(){
        System.out.println("Bean are destroyed");

    }
}
