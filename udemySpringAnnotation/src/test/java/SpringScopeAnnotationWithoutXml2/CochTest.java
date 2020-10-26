package SpringScopeAnnotationWithoutXml2;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CochTest {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext annotationConfigApplicationContext =
                new AnnotationConfigApplicationContext(BeanInitialiser.class);
        Team team = (Team)annotationConfigApplicationContext.getBean("realMadrid");
        RealMadrid realMadrid = (RealMadrid)team;
        System.out.println("Team Name is : "+team.getClass().getSimpleName());
        System.out.println("Caption of team is : "+team.captain());
        realMadrid.teamCoach();
        System.out.println(realMadrid.players());
        realMadrid.teamUpdate();
    }

}
