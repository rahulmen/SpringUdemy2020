package SpringReferenceDependencyInjectionUsingAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SachinTendulkar implements Player {

  @Qualifier("playerCareer")
  @Autowired
  private Career career;

  private int age = 44;
  private String country = "India";

  SachinTendulkar(){
    System.out.println(this.getClass().getSimpleName()+" Bean Created");
  }


  public String game() {
    System.out.println(career.carrerInfo(this,age,country));
    return "Cricket";
  }
}
