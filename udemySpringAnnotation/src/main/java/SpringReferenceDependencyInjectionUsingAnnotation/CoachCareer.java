package SpringReferenceDependencyInjectionUsingAnnotation;

import java.util.Random;
import org.springframework.stereotype.Component;

@Component
public class CoachCareer implements Career {

  CoachCareer(){
    System.out.println(this.getClass().getSimpleName()+" Bean Created");
  }


  String[] lotteryLeftYear = {"This coach can provide coaching for 5 more years",
      "This coach can provide coaching for 10 more years","This coach can provide coaching for 15 more years",
      "This player can provide coaching for 20 more years"};

  private Random random = new Random();

  public String carrerInfo(Player player, int age, String country) {
    System.out.println("=====================All Beans Initialised=====================\n");
    System.out.println("=====================SPRING EXECUTION STARTED========================");
    return "Coach Name :"+player.getClass().getSimpleName()+"\n"+"Coach age :"+age+"\nCoach Country: "+country+"\nLeft Years :"+lotteryLeftYear[random.nextInt(lotteryLeftYear.length)];
  }
}
