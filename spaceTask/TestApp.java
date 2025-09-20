public class TestApp {
    public static void main(String[] args) {
        Mission mars = new Mission("Mars mission", "Bruce", "Wayne", 365);
        mars.addAstronaut("Clark", "Kent");
        mars.addAstronaut("Barry", "Allen");
        System.out.println(mars);

        ArchiveMission archive = new ArchiveMission("Justice League");
        archive.add(mars);
        System.out.println(archive);
        archive.kickOut("Mars mission");
        System.out.println(archive);
    }
}
