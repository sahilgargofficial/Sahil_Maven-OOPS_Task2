package epam_Maven_task2;

import Gifts.Gift;
import Sweets.Sweet;
import Sweets.cake;
import Sweets.candy;
import Sweets.chocolates;

public class NewYearGift {
    public static void main(String[] args) {
        Sweet silk = new chocolates(8, "Silk", 60, 120, "milk");
        Sweet dairyMilk = new chocolates(8, "Dairy Milk", 60, 120, "milk");
        Sweet truffle = new cake(3, "Truffle", 250, 300, "chocolate");
        Sweet candy_man = new candy(4, "Filo", 10, 2, "mango");
        Sweet melody = new candy(5, "melody", 12, 5, "chocolate");

        Gift gift = new Gift();
        gift.add(silk);
        gift.add(dairyMilk);
        gift.add(candy_man);
        gift.add(truffle);
        gift.add(melody);
        System.out.println("Sweets in Gift are :");
        System.out.println(gift.toString());
        System.out.println("Total weight of your gift = " + gift.totalWeight() + "gm");
        gift.sort();
        System.out.println("After sorting according to price sweets in gift are :\n" + gift.toString());
    }
}
