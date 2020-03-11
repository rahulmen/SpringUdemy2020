package SpringScopeAnnotationWithoutUsingXml;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CoachTest {

  public static void main(String[] args) {

    AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(BeanInitialiser.class);

    Coach coach = annotationConfigApplicationContext.getBean("cricketCoach",Coach.class);

    Coach coach1 = annotationConfigApplicationContext.getBean("cricketCoach",Coach.class);

    CricketCoach cricketCoach = (CricketCoach)coach;

    cricketCoach.getDailyWorkout();

    cricketCoach.getDailyFortune();

    System.out.println("Is it Singleton : "+(coach==coach1));

    System.out.println("Memory Location Same of both beans:\n"+coach+"\n"+coach1);

    annotationConfigApplicationContext.close();

  }

}
