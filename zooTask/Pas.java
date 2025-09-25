public class Pas extends Zivotinja {
    public Pas(String ime, int godine) {
        super(ime, godine);
    }

    @Override
    public double izracunajDnevnuHranu() {
        return Math.max(0.3, godine * 0.1);
    }

    @Override
    public String getVrsta() {
        return "Pas";
    }
}
