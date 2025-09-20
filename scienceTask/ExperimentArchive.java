import java.util.HashMap;

public class ExperimentArchive implements IExperimentArchive {
    private String archiveName;
    private HashMap<String, Experiment> experiments;

    public ExperimentArchive(String archiveName) {
        this.archiveName = archiveName;
        this.experiments = new HashMap<>();
    }

    @Override
    public boolean add(Experiment e) {
        if (experiments.containsKey(e.getName())) {
            return false;
        }

        experiments.put(e.getName(), e);
        return true;
    }

    @Override
    public int remove(String name) {
        if (experiments.containsKey(name)) {
            experiments.remove(name);
            return 1;
        }

        return -1;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Archive: ").append(archiveName).append("\n");
        sb.append("Total experiments stored: ").append(experiments.size()).append("\n");
        sb.append("Experiments:\n");

        if (experiments.isEmpty()) {
            sb.append("Nothing currently in archive!");
        } else {
            for (Experiment e : experiments.values()) {

                sb.append(e.toString()).append("\n");
            }
        }

        return sb.toString();
    }
}
