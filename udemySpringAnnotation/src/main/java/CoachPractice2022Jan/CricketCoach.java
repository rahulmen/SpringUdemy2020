package CoachPractice2022Jan;

public class CricketCoach implements Coach{

    private String name;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String whichTeam() {
        return "Coach of Cricket Team";
    }

    @Override
    public String dailyUpdate() {
        return "Cricket Training Started";
    }
}
