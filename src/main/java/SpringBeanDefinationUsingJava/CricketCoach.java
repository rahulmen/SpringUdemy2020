package SpringBeanDefinationUsingJava;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class CricketCoach implements Coach {

  FortuneServive fortuneServive;

  CricketCoach(){
    System.out.println(this.getClass().getSimpleName()+" Bean Initialised");
  }

  CricketCoach(FortuneServive fortuneServive){
    this();
    this.fortuneServive=fortuneServive;
  }

  public void getDailyWorkout() {
    System.out.println("Play T-20 match for practice");
  }

  public void getDailyFortune(){
    fortuneServive.getDailyFortune();
  }
}
