package SpringAnnotationExample05March;

import org.springframework.stereotype.Component;

@Component("kabaddiCoach")
public class KabaddiCoach implements Coach{

    @Override
    public void getDailyWorkOut() {
        System.out.println("8km Sprint for Kabaddi match practice");
    }
}
