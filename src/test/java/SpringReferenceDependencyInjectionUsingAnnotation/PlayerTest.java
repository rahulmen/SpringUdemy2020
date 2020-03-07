package SpringReferenceDependencyInjectionUsingAnnotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PlayerTest {

  public static void main(String[] args) {
    ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContextVariableDIAnnotation.xml");

    Player player = classPathXmlApplicationContext.getBean("varvade",Player.class);

    String game = player.game();
    System.out.println("Game :"+game);

    classPathXmlApplicationContext.close();
  }

}
