package SpringReferenceDependencyInjectionUsingAnnotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PlayerTest {

  public static void main(String[] args) {
    ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContextVariableDIAnnotation.xml");

    /*Note :- Spring Bean using Java Bean Introspector to decapatialise the class Name Passed
    Like :- Class Name = Varvade
            java.beans.Introspector.decapatalise("Varvade");
            O/P :- varvade

     If first two character are capital then Introspector will not change the class name.
     */
    Player player = classPathXmlApplicationContext.getBean("varvade",Player.class);

    String game = player.game();
    System.out.println("Game :"+game);

    classPathXmlApplicationContext.close();
  }

}
