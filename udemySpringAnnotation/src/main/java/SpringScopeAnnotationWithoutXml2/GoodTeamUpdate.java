package SpringScopeAnnotationWithoutXml2;

import org.springframework.stereotype.Component;

@Component
public class GoodTeamUpdate implements TeamUpdate{

    @Override
    public String getNews() {
        return "Team is doing Good and won Laliga 2020-21 :) !!";
    }
}
