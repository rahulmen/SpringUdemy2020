package CoackExample27Feb;

import CoachExample27Feb.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CoackTest {


  public static void main(String[] args) {

    ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext(
        "applicationContext.xml");

    System.getProperty("user.dir");

    Coach coach = classPathXmlApplicationContext.getBean("coachBean", Coach.class);

    coach.trainingUpdate();


    classPathXmlApplicationContext.close();


  }

}
