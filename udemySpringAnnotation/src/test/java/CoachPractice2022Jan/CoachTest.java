package CoachPractice2022Jan;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CoachTest {


    public static void main(String[] args) {

      ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext(
                "applicationContext2022.xml");

      League league = classPathXmlApplicationContext.getBean("footballLeague",League.class);
      System.out.println(league.leagueDescription());

    }
}
