package SpringReferenceDependencyInjectionUsingAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Varvade implements Player {

  @Qualifier("coachCareer")
  @Autowired
  private Career career;

  private int age = 56;
  private String country = "Barcaleno";

  Varvade(){
    System.out.println(this.getClass().getSimpleName()+" Bean Created");
  }


  public String game() {
    System.out.println(career.carrerInfo(this,age,country));
    return "FootBall Coach";
  }
}
