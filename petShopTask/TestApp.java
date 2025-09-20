public class TestApp {
    public static void main(String[] args) {
        Pet p1 = new Pet("Buddy", "Dog", 3);
        Pet p2 = new Pet("Whiskers", "Cat", 5);
        Pet p3 = new Pet("Nemo", "Fish", 1);

        Owner o1 = new Owner("John", "Doe");
        Owner o2 = new Owner("Jane", "Smith");

        Shelter shelter = new Shelter();
        shelter.addPet(p1);
        shelter.addPet(p2);
        shelter.addPet(p3);

        shelter.addOwner("O1", o1);
        shelter.addOwner("O2", o2);

        System.out.println(shelter);

        System.out.println("Pets older than 2: " + shelter.countOldPets(2));

        System.out.println("\nOwners in the shelter:");
        shelter.listOwners();

        System.out.println("\nPets (classic for loop):");
        for (int i = 0; i < shelter.countOldPets(0); i++) {
            Pet pet = shelter.getPets().get(i);
            System.out.println(pet);
        }
    }
}