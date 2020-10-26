package SpringConstructorDependencyInjectionUsingAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Zidane implements Player{

   private Career career;
    private int age = 52;
    private String country = "Spain";


    @Autowired
    Zidane(@Qualifier("coachCareer")Career career){
        this.career=career;
    }

    public String game() {
        System.out.println(career.carrerInfo(this,age,country));
        return "FootBall";
    }
}
