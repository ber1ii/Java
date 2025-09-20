public class Crayon implements PriceCalculation {
    private String serialNumber;
    private double price;
    private String color;
    private String type;

    // Parameterized Constructor
    public Crayon(String serialNumber, double price, String color, String type) {
        this.serialNumber = serialNumber;
        this.price = price;
        this.type = type;
        this.color = color;
    }

    // Copy constructor
    public Crayon(Crayon other) {
        this.serialNumber = other.serialNumber;
        this.price = other.price;
        this.color = other.color;
        this.type = other.color;
    }

    // Getters
    public String getSerialNumber() {
        return serialNumber;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public boolean applyDiscount(double percent) {
        if (percent <= 0) {
            System.out.println("Unsuccessful discount attempt!");
            return false;
        }

        if (percent >= 100) {
            percent = 99;
        }

        price -= price * (percent / 100.0);
        System.out.println("Price reduced by: " + percent + "%.");
        return true;
    }

    @Override
    public String toString() {
        return "Crayon{" +
                "serialNumber='" + serialNumber + '\'' +
                ", price = " + price +
                ", color = '" + color + '\'' +
                ", type = '" + type + '\'' +
                '}';
    }
}
