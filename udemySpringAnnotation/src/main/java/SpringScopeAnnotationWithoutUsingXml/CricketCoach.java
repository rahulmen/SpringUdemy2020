package SpringScopeAnnotationWithoutUsingXml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
@PropertySource("classpath:coachPersonalData.properties")
public class CricketCoach implements Coach {

  @Qualifier("happyFortuneService")
  @Autowired
  FortuneServive fortuneServive;

  @Value("${cricketCoachName}")
  String cricketCoachName;

  @Value("${cricketCoachEmail}")
  String cricketCoachEmail;

  CricketCoach(){
    System.out.println(this.getClass().getSimpleName()+" Bean Initialised");
  }

  public void getDailyWorkout() {
    System.out.println("Play T-20 match for practice");
  }

  public void getDailyFortune(){
    fortuneServive.getDailyFortune();
  }

  public String getCricketCoachName() {
    return cricketCoachName;
  }

  public String getCricketCoachEmail() {
    return cricketCoachEmail;
  }
}
