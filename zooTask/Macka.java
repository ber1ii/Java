public class Macka extends Zivotinja {
    public Macka(String ime, int godine) {
        super(ime, godine);
    }

    @Override
    public double izracunajDnevnuHranu() {
        return Math.max(0.2, godine * 0.05);
    }

    @Override
    public String getVrsta() {
        return "Macka";
    }
}
