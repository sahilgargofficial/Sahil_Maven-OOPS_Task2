package Sweets;

// Abstract class for defining Function(abstract) which implements comparable interface
public abstract class Sweet implements Comparable<Sweet> {
    int price;
    int sweetness_level;
    private String name;
    private int weight;

    public Sweet(int sweetness, String name, int weight, int price) {
        this.sweetness_level = sweetness;
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Sweet name = " + this.name + " weight = " + this.weight + " price " + this.price + "sweetness is" + this.sweetness_level;
    }

    public int compareTo(Sweet sweet) {
        return this.price - sweet.getPrice();
    }

    public int getSweetness() {
        return sweetness_level;
    }

    public void setSweetness(int sweetness) {
        if (sweetness > 0 && sweetness < 9)
            this.sweetness_level = sweetness;
        else {
            this.sweetness_level = 9;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


}
