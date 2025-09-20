import java.util.ArrayList;

public class Mission {
    private String name;
    private Astronaut commander;
    private ArrayList<Astronaut> crew;
    private int durationDays;

    public Mission(String name, String commanderFirst, String commanderLast, int durationDays) {
        this.name = name;
        this.commander = new Astronaut(commanderFirst, commanderLast);
        this.durationDays = durationDays;
        this.crew = new ArrayList<>();
    }

    // getters
    public String getName() {
        return name;
    }

    public Astronaut getCommander() {
        return commander;
    }

    public ArrayList<Astronaut> getCrew() {
        return crew;
    }

    public int getDurationDays() {
        return durationDays;
    }

    // setters
    public void setName(String name) {
        this.name = name;
    }

    public void setCommander(Astronaut commander) {
        this.commander = commander;
    }

    public void setDurationDays(int durationDays) {
        this.durationDays = durationDays;
    }

    public boolean addAstronaut(String first, String last) {
        for (Astronaut a : crew) {
            if (a.getFirstName().equals(first) && a.getLastName().equals(last)) {
                return false; // duplicate
            }
        }

        crew.add(new Astronaut(first, last));
        return true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Name: ").append(name).append("\n");
        sb.append("Commander: ").append(commander.toString()).append("\n");
        sb.append("Duration(expressed in days): ").append(durationDays).append("\n");
        sb.append("Crew:\n");

        for (Astronaut a : crew) {
            sb.append(a.toString()).append("\n");
        }

        return sb.toString();
    }
}
