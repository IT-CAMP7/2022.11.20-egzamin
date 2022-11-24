package pl.camp.it.egzamin;

import java.util.Scanner;

public class Owoce {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] values = scanner.nextLine().split(" ");
        //values[2] = Integer.MAX_VALUE + "";
        owoce3(values);
    }

    public static void owoce(String[] values) {
        int apples = Integer.parseInt(values[0]);
        int oranges = Integer.parseInt(values[1]);
        int coins = Integer.parseInt(values[2]);
        while (coins > 0) {
            if(apples > oranges) {
                oranges++;
                coins--;
            } else {
                apples++;
                coins--;
            }
        }

        System.out.println("Pomarancze: " + oranges);
        System.out.println("Jablka: " + apples);
        System.out.println("Roznica: " + Math.abs(apples-oranges));
    }

    public static void owoce2(String[] values) {
        int apples = Integer.parseInt(values[0]);
        int oranges = Integer.parseInt(values[1]);
        int coins = Integer.parseInt(values[2]);

        int startDiff = Math.abs(oranges-apples);
        if(startDiff <= coins) {
            coins -= startDiff;

            int temp = apples > oranges ? apples : oranges;
            apples = temp + coins/2 + coins%2;
            oranges = temp + coins/2;
        } else {
            if(apples < oranges) {
                apples += coins;
            } else {
                oranges += coins;
            }
        }

        System.out.println("Pomarancze: " + oranges);
        System.out.println("Jablka: " + apples);
        System.out.println("Roznica: " + Math.abs(apples-oranges));
    }

    public static void owoce3(String[] values) {
        int apples = Integer.parseInt(values[0]);
        int oranges = Integer.parseInt(values[1]);
        int coins = Integer.parseInt(values[2]);

        if(coins < 1) {
            System.out.println("Pomarancze: " + oranges);
            System.out.println("Jablka: " + apples);
            System.out.println("Roznica: " + Math.abs(apples-oranges));
            return;
        }

        if(apples > oranges) {
            coins--;
            oranges++;
        } else {
            coins--;
            apples++;
        }

        owoce3(new String[]{apples+"", oranges+"", coins+""});
    }
}
