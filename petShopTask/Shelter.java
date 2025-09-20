import java.util.ArrayList;
import java.util.HashMap;

public class Shelter {
    private ArrayList<Pet> pets;
    private HashMap<String, Owner> owners;

    public Shelter() {
        pets = new ArrayList<>();
        owners = new HashMap<>();
    }

    public void addPet(Pet p) {
        pets.add(p);
    }

    public boolean addOwner(String id, Owner o) {
        if (owners.containsKey(id)) {
            return false;
        }

        owners.put(id, o);
        return true;
    }

    public int countOldPets(int minAge) {
        int count = 0;

        for (Pet p : pets) {
            if (p.getAge() > minAge) {
                count++;
            }
        }

        return count;
    }

    public void listOwners() {
        if (!owners.isEmpty()) {
            for (var entry : owners.entrySet()) {
                System.out.println("Owner ID: " + entry.getKey() + ", Owner name: " + entry.getValue());
            }
        }
    }

    public ArrayList<Pet> getPets() {
        return pets;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (Pet p : pets) {
            sb.append(p).append("\n");
        }

        return sb.toString();
    }
}
