public class TestApp {
    public static void main(String[] args) {
        Scientist s1 = new Scientist("Elon", "Musk");
        Scientist s2 = new Scientist("Robert J.", "Oppenheimer");
        Scientist s3 = new Scientist("Donald J.", "Trump");

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        Experiment e1 = new Experiment("Atomic Bomb", s2, 1400);
        e1.addScientist("Albert", "Einstein");
        e1.addScientist("Neil Degrasse", "Tyson");

        System.out.println(e1);

        e1.setLeadScientist(s1);
        System.out.println("After changing lead scientist to s1");
        System.out.println(e1);

        e1.setDuration(365);
        e1.setName("OpenAI");
        System.out.println(e1);

        Experiment e2 = new Experiment("Mexico Wall", s3, 700);
        e2.addScientist("JD", "Vance");
        e2.addScientist("Benjamin", "Netanyahu");

        System.out.println(e2);

        ExperimentArchive archive = new ExperimentArchive("Archive");
        archive.add(e1);
        archive.add(e2);

        System.out.println(archive);

        archive.remove("Mexico Wall");

        System.out.println(archive);
    }
}
