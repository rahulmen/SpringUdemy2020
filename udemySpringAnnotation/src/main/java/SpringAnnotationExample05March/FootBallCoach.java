package SpringAnnotationExample05March;

import org.springframework.stereotype.Component;

@Component("footballCoachBean")
public class FootBallCoach implements Coach {

  public void getDailyWorkOut() {
    System.out.println("Do 4 Hours Dribbling");
  }

}
