package Gifts;

import Sweets.Sweet;

import java.util.ArrayList;
import java.util.Collections;

//  Buffer class acting as storage unit to store various sweets  using ArrayList Inside
public class Gift {
    ArrayList<Sweet> gifts = new ArrayList<>();

    public void add(Sweet sweet) {
        gifts.add(sweet);
    }

    public void sort() {
        Collections.sort(gifts);
    }

    public int totalWeight() {
        int weight = 0;
        for (Sweet gift : gifts) {
            weight += gift.getWeight();
        }
        return weight;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Sweet gift : this.gifts) {
            sb.append(gift.getName()).append("\n");
        }
        return sb.toString();
    }
}
