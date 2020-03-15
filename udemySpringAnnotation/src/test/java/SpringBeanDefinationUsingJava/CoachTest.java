package SpringBeanDefinationUsingJava;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CoachTest {

  public static void main(String[] args) {

    AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(BeanInitialiser.class);

    Coach coach = annotationConfigApplicationContext.getBean("cricketCoach",Coach.class);

    CricketCoach cricketCoach = (CricketCoach)coach;

    cricketCoach.getDailyWorkout();

    cricketCoach.getDailyFortune();

    annotationConfigApplicationContext.close();

  }

}
