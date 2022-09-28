package lesson12;

import java.util.HashSet;

public class Main3 {
    public static void main(String[] args) {

        HashSet<Coins> coins = new HashSet<>();
        Coins c1 = new Coins(1, 2, "med");
        Coins c2 = new Coins(2, 3, "med");
        Coins c3 = new Coins(4, 2, "serebro");
        Coins c4 = new Coins(1, 2, "med");

        coins.add(c1);
        coins.add(c2);
        coins.add(c3);
        coins.add(c4);

        System.out.println(coins);

    }
}
