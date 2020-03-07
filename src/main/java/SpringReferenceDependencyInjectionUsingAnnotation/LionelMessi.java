package SpringReferenceDependencyInjectionUsingAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/*
In Spring if at @Component tag if we do not provide any bean name than by default Spring
will take ClassName by lowering first character as bean name
Example :- ClassName :- LionelMessi
            Bean id Name :- lionelMessi
 */

@Component
public class LionelMessi implements Player {

  @Qualifier("playerCareer")
  @Autowired
  private Career career;

  private int age = 34;
  private String country = "Argentina";


  LionelMessi(){
    System.out.println("Default Player Constructor");
  }

  public String game() {
    System.out.println(career.carrerInfo(this,age,country));
    return "FootBall";
  }

}
