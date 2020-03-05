package SpringAnnotationExample05March;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CoachAnnotationTest {

  public static void main(String[] args) {

    ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContextAnnotation.xml");
    Coach coach = classPathXmlApplicationContext.getBean("coachBean",Coach.class);
    coach.getDailyWorkOut();
  }


}
