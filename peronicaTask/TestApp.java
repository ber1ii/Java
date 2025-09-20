public class TestApp {
    public static void main(String[] args) {
        Crayon red = new Crayon("001", 100, "Red", "Wax");
        Crayon blue = new Crayon("002", 75, "Blue", "Oil");
        Crayon copyRed = new Crayon(red); // test copy constructor

        PencilCase case1 = new PencilCase();

        System.out.println("Add red: " + case1.add(red)); // true
        System.out.println("Add blue: " + case1.add(blue)); // true
        System.out.println("Add red again: " + case1.add(copyRed)); // false (duplicate)

        System.out.println("\n" + case1);

        red.applyDiscount(20); // Price reduced by 20%
        blue.applyDiscount(-5); // Unsuccessful

        System.out.println("\nExpensive > 60: " + case1.countExpensive(60));

        System.out.println("\nFinal case1 contents:\n" + case1);
    }
}
