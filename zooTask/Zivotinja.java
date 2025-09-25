public abstract class Zivotinja {
    protected String ime;
    protected int godine;

    public Zivotinja(String ime, int godine) {
        this.ime = ime;
        this.godine = godine;
    }

    public String getIme() {
        return ime;
    }

    public int getGodine() {
        return godine;
    }

    abstract public double izracunajDnevnuHranu();

    abstract public String getVrsta();

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("vrsta: ").append(getVrsta()).append("\n");
        sb.append("ime: ").append(ime).append("\n");
        sb.append("godine: ").append(godine).append("\n");
        sb.append("dnevna hrana: ").append(String.format("%.2f", izracunajDnevnuHranu())).append(" kg");

        return sb.toString();
    }
}