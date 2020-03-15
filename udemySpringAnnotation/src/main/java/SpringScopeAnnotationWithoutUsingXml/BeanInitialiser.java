package SpringScopeAnnotationWithoutUsingXml;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("SpringScopeAnnotationWithoutUsingXml")
public class BeanInitialiser {

  @PostConstruct
  public void initMethod(){
    System.out.println("Beans are Intiliased");
  }

  @PreDestroy
  public void destroyMethod(){
    System.out.println("Beans are destroyed");
  }


}
