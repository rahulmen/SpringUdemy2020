package SpringScopeAnnotationWithoutXml2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
@Scope("singleton")
public class RealMadrid implements Team{

    @Qualifier("zidane")
    @Autowired
    private Coach coach;

    @Qualifier("goodTeamUpdate")
    @Autowired
    TeamUpdate teamUpdate;

    @Override
    public String captain() {
        return "Sergio Ramos";
    }

    @Override
    public List<String> players() {
        return new ArrayList<>(Arrays.asList("Hazard","Benzema","Vinícius","Modric"));
    }

    public void teamCoach(){
        System.out.println("Coach of "+this.getClass().getSimpleName()+" team is " + coach.getClass().getSimpleName()+
                " who teaches "+coach.getGame());
    }

    public void teamUpdate(){
        System.out.println(teamUpdate.getNews());
    }
}
