package CoachPractice2022Jan;

public class FootballCoach implements Coach{

    private String name;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String whichTeam() {
        return "Coach of football team";
    }

    @Override
    public String dailyUpdate() {
        return "Football training started";
    }
}
