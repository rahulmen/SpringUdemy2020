package SpringBeanDefinationUsingJava;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CoachTest {

  public static void main(String[] args) {

    AnnotationConfigApplicationContext annotationConfigApplicationContext =
            new AnnotationConfigApplicationContext(BeanInitialiser.class);
    Coach coach = annotationConfigApplicationContext.getBean("headCricketCoach",Coach.class);
    Coach coach1 = annotationConfigApplicationContext.getBean("subHeadCricketCoach",Coach.class);
    System.out.println("Class Executed is :"+coach.getClass().getName());
    coach.getDailyWorkout();
    coach.getDailyFortune();
    System.out.println("Class Executed is :"+coach.getClass().getName());
    coach1.getDailyWorkout();
    coach1.getDailyFortune();
    annotationConfigApplicationContext.close();

  }

}
