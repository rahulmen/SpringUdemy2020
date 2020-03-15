package SpringConstructorDependencyInjectionUsingAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SachinTendulkar implements Player {

  private Career career;
  private int age = 44;
  private String country = "India";

  @Autowired
  SachinTendulkar(@Qualifier("playerCareer") Career career){
    this.career=career;
  }

  public String game() {
    System.out.println(career.carrerInfo(this,age,country));
    return "Cricket";
  }
}
