package SpringAnnotationExample05March;

import org.springframework.stereotype.Component;

@Component("cricketCoachBean")
public class CricketCoach implements Coach {

  public void getDailyWorkOut() {
    System.out.println("Do 4 km running");
  }
}
