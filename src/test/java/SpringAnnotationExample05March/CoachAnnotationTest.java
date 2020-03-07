package SpringAnnotationExample05March;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CoachAnnotationTest {

  public static void main(String[] args) {

    ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContextAnnotation.xml");
    Coach coach = classPathXmlApplicationContext.getBean("cricketCoachBean",Coach.class);
    coach.getDailyWorkOut();
    classPathXmlApplicationContext.close();
  }


}
