package CoachExample27Feb;

public class FootballCoach implements Coach {

  private League FootBallleague;
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

  public FootballCoach(){
    System.out.println("Football Coach is Hired for Football League with No Argument");
  }

  public FootballCoach(League league){
    System.out.println("Football Coach is Hired for Football League with one Argument");
    this.FootBallleague=league;
  }

  public void trainingUpdate() {
    System.out.println("Played 90 mins football match");
  }

  public void whichTeam() {
    String[] teams = this.FootBallleague.getTeam();
    System.out.print("Teams are :");
    for(String team:teams){
      System.out.print(team+" ");
    }
  }
}
