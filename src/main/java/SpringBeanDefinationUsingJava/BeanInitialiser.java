package SpringBeanDefinationUsingJava;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BeanInitialiser {

  @PostConstruct
  public void initMethod(){
    System.out.println("Beans are Intiliased");
  }

  @PreDestroy
  public void destroyMethod(){
    System.out.println("Beans are destroyed");
  }

  @Bean
  public Coach cricketCoach(){
    return new CricketCoach(happyFortuneService());
  }

  @Bean
  public FortuneServive happyFortuneService(){
    return new HappyFortuneService();
  }

}
