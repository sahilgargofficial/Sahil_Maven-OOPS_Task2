package Sweets;


public class chocolates extends Sweet {

    String type;

    public chocolates(int sweetness, String name, int weight, int price, String type) {
        super(sweetness, name, weight, price);
        this.type = type;
    }
}
