package SpringScopeAnnotationWithoutXml2;

public class BadTeamUpdate implements TeamUpdate{

    @Override
    public String getNews() {
        return "Team is doing Good but most player left the team :( !!";
    }
}
