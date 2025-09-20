import java.util.HashMap;

public class PencilCase {
    private HashMap<String, Crayon> crayons;
    private int availableSlots;

    public PencilCase() {
        crayons = new HashMap<>();
        availableSlots = 5;
    }

    public boolean add(Crayon c) {
        if (crayons.containsKey(c.getSerialNumber())) {
            return false; // duplicate
        }

        if (crayons.size() >= availableSlots) {
            return false; // full
        }

        crayons.put(c.getSerialNumber(), c);
        return true;
    }

    public int countExpensive(double minPrice) {
        int count = 0;

        for (Crayon c : crayons.values()) {
            if (c.getPrice() > minPrice) {
                count++;
            }
        }

        return count;
    }

    @Override
    public String toString() {
        if (crayons.isEmpty()) {
            return "Pencil case is empty.";
        }

        StringBuilder sb = new StringBuilder("Pencil case contents:\n");

        for (Crayon c : crayons.values()) {
            sb.append(c).append("\n");
        }

        return sb.toString();
    }
}
