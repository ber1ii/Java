import java.util.ArrayList;

public class Experiment {
    private String name;
    private Scientist leadScientist;
    private ArrayList<Scientist> team;
    private int durationDays;

    public Experiment(String name, String firstNameL, String lastNameL, int durationDays) {
        this.name = name;
        this.leadScientist = new Scientist(firstNameL, lastNameL);
        team = new ArrayList<>();
        this.durationDays = durationDays;
    }

    public Experiment(String name, Scientist s, int durationDays) {
        this.name = name;
        this.leadScientist = s;
        team = new ArrayList<>();
        this.durationDays = durationDays;
    }

    public String getName() {
        return name;
    }

    public Scientist getLeadScientist() {
        return leadScientist;
    }

    public ArrayList<Scientist> getTeam() {
        return team;
    }

    public int getDuration() {
        return durationDays;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLeadScientist(Scientist lead) {
        this.leadScientist = lead;
    }

    public void setTeam(ArrayList<Scientist> team) {
        this.team = team;
    }

    public void setDuration(int durationDays) {
        this.durationDays = durationDays;
    }

    boolean addScientist(String first, String last) {
        for (Scientist s : team) {
            if (s.getFirstName().equals(first) && s.getLastName().equals(last)) {
                return false;
            }
        }

        team.add(new Scientist(first, last));

        return true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Name: ").append(name).append("\n");
        sb.append("Lead scientist: ").append(leadScientist.toString()).append("\n");
        sb.append("Duration(days): ").append(durationDays).append("\n");
        sb.append("Team:\n");

        if (team.isEmpty()) {
            sb.append("Team currently has no members\n");
        } else {
            for (Scientist s : team) {
                sb.append(s.toString()).append("\n");
            }
        }

        return sb.toString();
    }
}
