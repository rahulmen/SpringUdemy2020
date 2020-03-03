package CoachExample27Feb;

public class CricketCoach implements Coach {

  private League criLeague;

  public CricketCoach(){}

  public void setCriLeague(League criLeague){
    this.criLeague=criLeague;
  }

  public void trainingUpdate() {
    System.out.println("Played for 20 over match");
  }

  public void whichTeam() {
    String[] teams = this.criLeague.getTeam();
    System.out.print("Teams are :");
    for (String team : teams) {
      System.out.print(team + " ");
    }
  }
}
