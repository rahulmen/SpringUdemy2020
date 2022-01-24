package CoachPractice2022Jan;

public class Laliga implements League{

    private Coach coach;
    private String player;

    public Coach getCoach() {
        return coach;
    }

    public void setCoach(Coach coach) {
        this.coach = coach;
    }

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    @Override
    public String leagueDescription() {
        return "This is a best french league which has player like : "+this.getPlayer()+ "\n" +
                "And best coach like : "+coach.getName()+ "\n" +
                coach.whichTeam()+" has an update :"+ coach.dailyUpdate();
    }
}
