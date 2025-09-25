public class TestApp {
    public static void main(String[] args) {
        // === Kreiraj nekoliko zivotinja ===
        Pas p1 = new Pas("Rex", 2);
        Pas p2 = new Pas("Bobi", 5);
        Macka m1 = new Macka("Cica", 1);
        Macka m2 = new Macka("Maza", 7);

        // === Testiraj individualni ispis (polimorfno preko toString) ===
        System.out.println("=== Ispis pojedinacnih zivotinja ===");
        System.out.println(p1);
        System.out.println();
        System.out.println(p2);
        System.out.println();
        System.out.println(m1);
        System.out.println();
        System.out.println(m2);
        System.out.println();

        // === Kreiraj zooloski vrt i dodaj zivotinje ===
        ZooloskiVrt zoo = new ZooloskiVrt("Palisad");
        zoo.dodajZivotinju(p1);
        zoo.dodajZivotinju(p2);
        zoo.dodajZivotinju(m1);
        zoo.dodajZivotinju(m2);

        // === Testiraj ukupan ispis zoo vrta ===
        System.out.println("=== Ispis zoo vrta ===");
        System.out.println(zoo);
        System.out.println();

        // === Testiraj ukupnaHrana() ===
        System.out.println("Ukupna hrana dnevno za sve zivotinje: "
                + zoo.ukupnaHrana() + " kg");

        // === Testiraj brojZivotinjaStarijihOd(parametar) ===
        int granica = 2;
        int brojStarijih = zoo.brojZivotinjaStarijihOd(granica);
        System.out.println("Broj zivotinja starijih od proseka i starijih od "
                + granica + " godina: " + brojStarijih);
    }
}