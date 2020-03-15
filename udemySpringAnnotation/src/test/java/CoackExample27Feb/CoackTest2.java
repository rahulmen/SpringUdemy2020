package CoackExample27Feb;

import CoachExample27Feb.Coach;
import CoachExample27Feb.FootballCoach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CoackTest2 {


  public static void main(String[] args) {

    ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext(
        "applicationContext2.xml");

    System.getProperty("user.dir");

    Coach coach = classPathXmlApplicationContext.getBean("coachBeanFootBall", Coach.class);
    FootballCoach footballCoach = (FootballCoach) coach;
    footballCoach.trainingUpdate();
    footballCoach.whichTeam();
    System.out.println("Coach Name : "+footballCoach.getCoachName());;
    System.out.println("Coack EmailAddress : "+footballCoach.getCoachEmailAddress());

    Coach coach1 = classPathXmlApplicationContext.getBean("coachBeanFootBall", Coach.class);
    FootballCoach footballCoach1 = (FootballCoach) coach1;
    footballCoach1.trainingUpdate();
    footballCoach1.whichTeam();
    System.out.println("Coach Name : "+footballCoach1.getCoachName());;
    System.out.println("Coack EmailAddress : "+footballCoach1.getCoachEmailAddress());

    boolean value = (coach==coach1);
    System.out.println(value);

    classPathXmlApplicationContext.close();

  }

}
