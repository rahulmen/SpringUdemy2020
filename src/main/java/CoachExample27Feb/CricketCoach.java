package CoachExample27Feb;

public class CricketCoach implements Coach {

  private League criLeague;
  private String coachName;
  private String coachEmailAddress;

  public String getCoachName() {
    return coachName;
  }

  public void setCoachName(String coackName) {
    this.coachName = coackName;
  }

  public String getCoachEmailAddress() {
    return coachEmailAddress;
  }

  public void setCoachEmailAddress(String coachEmailAddress) {
    this.coachEmailAddress = coachEmailAddress;
  }

  public CricketCoach(){
    System.out.println("Cricket Coach is Hired for Cricket League");
  }

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
    System.out.println();
  }
}
