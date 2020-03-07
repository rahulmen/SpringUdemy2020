package SpringReferenceDependencyInjectionUsingAnnotation;

import org.springframework.stereotype.Component;

@Component
public class PlayerCareer implements Career {

  public String carrerInfo(Player player,int age, String country) {
    return "Player Name :"+player.getClass().getSimpleName()+"\n"+"Player age :"+age+"\nPlayer Country: "+country;
  }
}
