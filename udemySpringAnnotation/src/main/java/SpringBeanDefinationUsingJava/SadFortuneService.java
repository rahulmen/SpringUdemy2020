package SpringBeanDefinationUsingJava;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class SadFortuneService implements FortuneServive {

  SadFortuneService(){
    System.out.println(this.getClass().getSimpleName()+" Bean Initialised");
  }

  public void getDailyFortune() {
    System.out.println("I am sad not being coach of cricket team");
  }
}
