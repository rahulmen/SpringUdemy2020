package CoackExample27Feb;

import CoachExample27Feb.Coach;
import CoachExample27Feb.CricketCoach;
import CoachExample27Feb.FootballCoach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CoackTest3 {


  public static void main(String[] args) {

    ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext(
        "applicationContext3.xml");

    System.getProperty("user.dir");

    Coach coach = classPathXmlApplicationContext.getBean("coachBeanCricket", Coach.class);
    CricketCoach cricketCoach = (CricketCoach) coach;
    cricketCoach.trainingUpdate();
    cricketCoach.whichTeam();
    System.out.println("Coach Name : "+cricketCoach.getCoachName());;
    System.out.println("Coack EmailAddress : "+cricketCoach.getCoachEmailAddress());

    classPathXmlApplicationContext.close();

  }

}
