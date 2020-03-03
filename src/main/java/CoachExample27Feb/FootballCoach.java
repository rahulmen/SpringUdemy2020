package CoachExample27Feb;

public class FootballCoach implements Coach {

  private League league;

  public FootballCoach(League league){
    this.league=league;
  }

  public void trainingUpdate() {
    System.out.println("Played 90 mins football match");
  }

  public void whichTeam() {
    String[] teams = this.league.getTeam();
    System.out.print("Teams are :");
    for(String team:teams){
      System.out.print(team+" ");
    }
  }
}
