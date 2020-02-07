package Sweets;

public class cake extends Sweet {
    String flavour;

    public cake(int sweetness, String name, int weight, int price, String flavour) {
        super(sweetness, name, weight, price);
        this.flavour = flavour;
    }
}
