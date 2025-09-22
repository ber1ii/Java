import java.util.HashMap;

public class SvemirskaArhiva implements ISvemirskaArhiva {
    private String naziv;
    private HashMap<String, Mission> misije;

    public SvemirskaArhiva(String naziv) {
        this.naziv = naziv;
        misije = new HashMap<>();
    }

    @Override
    public boolean dodaj(Mission m) {
        for (String k : misije.keySet()) {
            if (m.getNaziv().equals(k)) {
                return false;
            }
        }

        misije.put(m.getNaziv(), m);
        return true;
    }

    @Override
    public int izbaci(String naziv) {
        for (String k : misije.keySet()) {
            if (naziv.equals(k)) {
                misije.remove(naziv);
                return 1;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Arhiva: ").append(naziv).append("\n");
        for (Mission m : misije.values()) {
            sb.append(m.toString()).append("\n");
        }

        return sb.toString();
    }
}
