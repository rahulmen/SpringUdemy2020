package SpringReferenceDependencyInjectionUsingAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SaniaMirza implements Player {
  @Qualifier("playerCareer")
  @Autowired
  private Career career;

  private int age = 32;
  private String country = "Pakistan";

  SaniaMirza(){
    System.out.println("Default Player Constructor");
  }

  public String game() {
    System.out.println(career.carrerInfo(this,age,country));
    return "Long Tennis";
  }

}
