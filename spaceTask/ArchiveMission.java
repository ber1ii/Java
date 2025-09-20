import java.util.HashMap;

public class ArchiveMission implements ISpaceArchive {
    private String archiveName;
    private HashMap<String, Mission> missions;

    public ArchiveMission(String archiveName) {
        this.archiveName = archiveName;
        this.missions = new HashMap<>();
    }

    @Override
    public boolean add(Mission m) {
        if (missions.containsKey(m.getName())) {
            return false;
        }

        missions.put(m.getName(), m);
        return true;
    }

    @Override
    public int kickOut(String name) {
        if (missions.containsKey(name)) {
            missions.remove(name);
            return 1;
        }
        return -1;
    }

    @Override
    public String toString() {
        return "Archive: " + archiveName + "has " + missions.size() + " missions stored.";
    }
}
