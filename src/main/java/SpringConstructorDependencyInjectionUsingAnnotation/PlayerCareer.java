package SpringConstructorDependencyInjectionUsingAnnotation;

import java.util.Random;
import org.springframework.stereotype.Component;

@Component
public class PlayerCareer implements Career {

  String[] lotteryLeftYear = {"This player can play 5 years more",
      "This player can play 10 years more","This player can play 15 years more",
      "This player can play 20 years more"};

  private Random random = new Random();

  public String carrerInfo(Player player,int age, String country) {
    return "Player Name :"+player.getClass().getSimpleName()+"\n"+"Player age :"+age+"\nPlayer Country: "+country+"\nLeft Year: "+lotteryLeftYear[random.nextInt(lotteryLeftYear.length)];
  }

}
