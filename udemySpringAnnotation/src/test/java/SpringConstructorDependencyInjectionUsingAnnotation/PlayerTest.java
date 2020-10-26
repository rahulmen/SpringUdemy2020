package SpringConstructorDependencyInjectionUsingAnnotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PlayerTest {

  public static void main(String[] args) {
    ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContextConstDIAnnotation.xml");

    Player player = classPathXmlApplicationContext.getBean("zidane",Player.class);

    String game = player.game();
    System.out.println("Player Game :"+game);

    classPathXmlApplicationContext.close();
  }

}
