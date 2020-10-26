package SpringAnnotationExample05March;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CoachAnnotationTest {

  public static void main(String[] args) {

    ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContextAnnotation.xml");
    Coach coach = classPathXmlApplicationContext.getBean("cricketCoachBean",Coach.class);
    System.out.println("Class Name :"+coach.getClass().getName());
    coach.getDailyWorkOut();
    coach = classPathXmlApplicationContext.getBean("kabaddiCoach",Coach.class);
    System.out.println("Class Name :"+coach.getClass().getName());
    coach.getDailyWorkOut();
    classPathXmlApplicationContext.close();
  }


}
