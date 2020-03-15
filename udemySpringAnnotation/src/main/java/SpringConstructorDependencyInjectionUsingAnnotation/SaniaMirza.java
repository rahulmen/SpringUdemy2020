package SpringConstructorDependencyInjectionUsingAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SaniaMirza implements Player {

  private Career career;
  private int age = 32;
  private String country = "Pakistan";

  @Autowired
  SaniaMirza(@Qualifier("playerCareer") Career career){
    this.career=career;
  }

  public String game() {
    System.out.println(career.carrerInfo(this,age,country));
    return "Long Tennis";
  }
}
