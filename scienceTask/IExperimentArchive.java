public interface IExperimentArchive {
    boolean add(Experiment e);

    int remove(String name);
}
