package SpringBeanDefinationUsingJava;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

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

  @Bean @Lazy
  public Coach headCricketCoach(){
    return new CricketCoach(happyFortuneService());
  }

  @Bean @Lazy
  public Coach subHeadCricketCoach(){
    return new CricketCoach(sadFortuneService());
  }

  @Bean @Lazy
  public FortuneServive happyFortuneService(){
    return new HappyFortuneService();
  }

  @Bean @Lazy
  public FortuneServive sadFortuneService() { return new SadFortuneService(); }

}
