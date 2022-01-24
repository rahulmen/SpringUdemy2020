package SpringBeanAnnotationJan2022;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Configuration
public class BeanInitialise {

    public BeanInitialise() {
        System.out.println("Bean initialise object created");
    }

    @PostConstruct
    public void init(){
        System.out.println("Beans are created");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Beans has been destroyed");
    }

    @Bean @Lazy
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Mobile mobile(){
        return new Mobile();
    }

    @Bean @Lazy
    public Television television(){
        return new Television();
    }



}
