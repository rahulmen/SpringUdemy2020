package SpringReferenceDependencyInjectionUsingAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component @Lazy
public class SaniaMirza implements Player {

  @Qualifier("playerCareer")
  @Autowired
  private Career career;

  private int age = 32;
  private String country = "Pakistan";

  SaniaMirza(){
    System.out.println(this.getClass().getSimpleName()+" Bean Created");
  }

  public String game() {
    System.out.println(career.carrerInfo(this,age,country));
    return "Long Tennis";
  }

}
