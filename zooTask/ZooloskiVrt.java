import java.util.ArrayList;

public class ZooloskiVrt {
    private String naziv;
    private ArrayList<Zivotinja> zivotinje;

    public ZooloskiVrt(String naziv) {
        this.naziv = naziv;
        zivotinje = new ArrayList<>();
    }

    public void dodajZivotinju(Zivotinja z) {
        zivotinje.add(z);
    }

    public double ukupnaHrana() {
        double sum = 0;

        for (Zivotinja z : zivotinje) {
            sum += z.izracunajDnevnuHranu();
        }

        return sum;
    }

    public int brojZivotinjaStarijihOd(int godine) {
        int sum = 0;
        double avg = 0;

        if (zivotinje.isEmpty()) {
            return 0;
        }

        for (Zivotinja z : zivotinje) {
            sum += z.getGodine();
        }

        avg = sum / zivotinje.size();

        int count = 0;

        for (Zivotinja z : zivotinje) {
            if (z.getGodine() > avg && z.getGodine() > godine) {
                count++;
            }
        }

        return count;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Zoo vrt ").append(naziv).append(" trenutno ima ").append(zivotinje.size()).append(" zivotinja\n");

        sb.append("Ukupna hrana potrebna dnevno: ").append(ukupnaHrana());

        return sb.toString();
    }
}
