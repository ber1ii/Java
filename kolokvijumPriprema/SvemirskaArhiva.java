import java.util.HashMap;

public class SvemirskaArhiva implements ISvemirskaArhiva {
    private String naziv;
    private HashMap<String, Misija> misije;

    public SvemirskaArhiva(String naziv) {
        this.naziv = naziv;
        misije = new HashMap<>();
    }

    @Override
    public boolean dodaj(Misija m) {
        for (String existing : misije.keySet()) {
            if (m.getNaziv().equals(existing)) {
                return false;
            }
        }

        misije.put(m.getNaziv(), m);
        return true;
    }

    @Override
    public int izbaci(String nazivMisije) {
        for (String existing : misije.keySet()) {
            if (existing.equals(nazivMisije)) {
                misije.remove(nazivMisije);
                return 1;
            }
        }

        return -1;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Naziv arhive: ").append(naziv).append("\n");

        if (!misije.isEmpty()) {
            for (Misija m : misije.values()) {
                sb.append(m.toString()).append("\n");
            }
        } else {
            sb.append("Prazna arhiva!");
        }

        return sb.toString();
    }
}
