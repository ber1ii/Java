public class TestApp {
    public static void main(String[] args) {
        Astronaut a1 = new Astronaut("Buzz", "Aldrin");
        Astronaut a2 = new Astronaut("A2", "A2");
        Astronaut a3 = new Astronaut("Kanye", "West");

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);

        Misija m1 = new Misija("Mars mission", a1, 365);
        System.out.println(m1);

        m1.dodajAstronauta("Kim", "Chae-Won");
        m1.dodajAstronauta("Huh", "Yunjin");

        System.out.println(m1);

        Misija m2 = new Misija("Jupiter mission", a3, 700);

        SvemirskaArhiva arhiva = new SvemirskaArhiva("Space archive");

        m2.dodajAstronauta("Rose", "Rosie");
        m2.dodajAstronauta("Aeri", "Desu");

        arhiva.dodaj(m1);
        arhiva.dodaj(m2);

        System.out.println(arhiva);
    }
}
