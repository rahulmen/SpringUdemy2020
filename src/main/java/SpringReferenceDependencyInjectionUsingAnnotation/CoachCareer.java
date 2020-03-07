package SpringReferenceDependencyInjectionUsingAnnotation;

import org.springframework.stereotype.Component;

@Component
public class CoachCareer implements Career {

  public String carrerInfo(Player player, int age, String country) {
    return "Coach Name :"+player.getClass().getSimpleName()+"\n"+"Coach age :"+age+"\nCoach Country: "+country;
  }
}
