package CoachExample27Feb;

public class CricketCoach implements Coach {

  private League league;

  public CricketCoach(League league){
    this.league=league;
  }

  public void trainingUpdate() {
    System.out.println("Played for 20 over match");
  }

  public void whichTeam() {
    String[] teams = this.league.getTeam();
    System.out.print("Teams are :");
    for (String team : teams) {
      System.out.print(team + " ");
    }
  }
}
