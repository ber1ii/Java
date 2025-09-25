import java.util.ArrayList;

public class Misija {
    private String naziv;
    private Astronaut komandant;
    private ArrayList<Astronaut> posada;
    private int trajanjeUDanima;

    public Misija(String naziv, Astronaut komandant, int trajanje) {
        this.naziv = naziv;
        this.komandant = komandant;
        posada = new ArrayList<>();
        this.trajanjeUDanima = trajanje;
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

    public void setNaziv(String newNaziv) {
        naziv = newNaziv;
    }

    public void setKomandant(Astronaut newK) {
        komandant = newK;
    }

    public void setPosada(ArrayList<Astronaut> newP) {
        posada = newP;
    }

    public void setTrajanje(int trajanje) {
        trajanjeUDanima = trajanje;
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
        sb.append("komandant:").append("\n").append(komandant.toString());
        sb.append("\ntrajanje (izrazeno u danima): ").append(trajanjeUDanima);

        if (!posada.isEmpty()) {
            sb.append("posada:\n");
            for (Astronaut a : posada) {
                sb.append(a.toString()).append("\n");
            }
        }
        return sb.toString();
    }
}
