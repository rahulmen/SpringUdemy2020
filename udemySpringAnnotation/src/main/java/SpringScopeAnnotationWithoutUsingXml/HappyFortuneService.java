package SpringScopeAnnotationWithoutUsingXml;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class HappyFortuneService implements FortuneServive {

  HappyFortuneService(){
    System.out.println(this.getClass().getSimpleName()+" Bean Initialised");
  }

  public void getDailyFortune() {
    System.out.println("I am happy being coach of cricket team");
  }
}
