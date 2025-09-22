import java.util.ArrayList;

public class Mission {
    private String naziv;
    private Astronaut komandant;
    private ArrayList<Astronaut> posada;
    private int trajanjeUDanima;

    public Mission(String naziv, String kIme, String kPrezime, int trajanjeUDanima) {
        this.naziv = naziv;
        this.komandant = new Astronaut(kIme, kPrezime);
        posada = new ArrayList<>();
        this.trajanjeUDanima = trajanjeUDanima;
    }

    public String getNaziv() {
        return naziv;
    }

    public Astronaut getKomandant() {
        return komandant;
    }

    public ArrayList<Astronaut> getPosada() {
        return posada;
    }

    public int getTrajanje() {
        return trajanjeUDanima;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public void setKomandant(Astronaut komandant) {
        this.komandant = komandant;
    }

    public void setPosada(ArrayList<Astronaut> posada) {
        this.posada = posada;
    }

    public void setTrajanje(int trajanjeUDanima) {
        this.trajanjeUDanima = trajanjeUDanima;
    }

    public boolean dodajAstronauta(String ime, String prezime) {
        for (Astronaut a : posada) {
            if (a.getIme().equals(ime) && a.getPrezime().equals(prezime)) {
                return false;
            }
        }

        posada.add(new Astronaut(ime, prezime));
        return true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("naziv: ").append(naziv).append("\n");
        sb.append("komandant: ").append(komandant.toString()).append("\n");
        sb.append("trajanje (izrazeno u danima): ").append(trajanjeUDanima).append("\n");

        if (!posada.isEmpty()) {
            sb.append("posada:\n");
            for (Astronaut a : posada) {
                sb.append(a.toString()).append("\n");
            }
        }

        return sb.toString();
    }
}
