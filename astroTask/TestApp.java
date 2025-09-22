public class TestApp {
    public static void main(String[] args) {
        Astronaut a1 = new Astronaut("Buzz", "Aldrin");
        Astronaut a2 = new Astronaut("Buzz", "Lightyear");
        Astronaut a3 = new Astronaut("Kanye", "West");
        Astronaut a4 = new Astronaut("Kim", "Chae-Won");

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(a4);

        Mission m1 = new Mission("Mars", "Johnny", "Craig", 365);
        Mission m2 = new Mission("Jupiter", "Tony", "Soprano", 1000);

        m1.dodajAstronauta("Kim", "Chae-Won");
        m1.dodajAstronauta("Kanye", "West");

        m2.dodajAstronauta("Klein", "Moretti");
        m2.dodajAstronauta("Walter", "White");

        System.out.println(m1);
        System.out.println(m2);

        SvemirskaArhiva arhiva = new SvemirskaArhiva("Arhiva");
        arhiva.dodaj(m1);
        arhiva.dodaj(m2);

        System.out.println(arhiva);

        arhiva.izbaci("Mars");

        System.out.println(arhiva);
    }
}
