/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Blackjack2;

import static Blackjack2.Data.*;

/**
 *
 * @author sethurbach
 */
public class A1234 {
    public static void A1234() {

        if (a1 == 1) {
            count1++;
        }
        if (a1 == 2) {
            count2++;
        }
        if (a1 == 3) {
            count3++;
        }
        if (a1 == 4) {
            count4++;
        }
        if (a1 == 5) {
            count5++;
        }
        if (a1 == 6) {
            count6++;
        }
        if (a1 == 7) {
            count7++;
        }
        if (a1 == 8) {
            count8++;
        }
        if (a1 == 9) {
            count9++;
        }
        if (a1 == 10) {
            count10++;
        }
        if (a1 == 11) {
            count11++;
        }
        if (a1 == 12);
        count12++;
        if (a1 == 13) {
            count13++;
        }
        if (a2 == 1) {
            count1++;
        }
        if (a2 == 2) {
            count2++;
        }
        if (a2 == 3) {
            count3++;
        }
        if (a2 == 4) {
            count4++;
        }
        if (a2 == 5) {
            count5++;
        }
        if (a2 == 6) {
            count6++;
        }
        if (a2 == 7) {
            count7++;
        }
        if (a2 == 8) {
            count8++;
        }
        if (a2 == 9) {
            count9++;
        }
        if (a2 == 10) {
            count10++;
        }
        if (a2 == 11) {
            count11++;
        }
        if (a2 == 12) {
            count12++;
        }
        if (a2 == 13) {
            count13++;
        }
        if (a3 == 1) {
            count1++;
        }
        if (a3 == 2) {
            count2++;
        }
        if (a3 == 3) {
            count3++;
        }
        if (a3 == 4) {
            count4++;
        }
        if (a3 == 5) {
            count5++;
        }
        if (a3 == 6) {
            count6++;
        }
        if (a3 == 7) {
            count7++;
        }
        if (a3 == 8) {
            count8++;
        }
        if (a3 == 9) {
            count9++;
        }
        if (a3 == 10) {
            count10++;
        }
        if (a3 == 11) {
            count11++;
        }
        if (a3 == 12) {
            count12++;
        }
        if (a3 == 13) {
            count13++;
        }
        if (a4 == 1) {
            count1++;
        }
        if (a4 == 2) {
            count2++;
        }
        if (a4 == 3) {
            count3++;
        }
        if (a4 == 4) {
            count4++;
        }
        if (a4 == 5) {
            count5++;
        }
        if (a4 == 6) {
            count6++;
        }
        if (a4 == 7) {
            count7++;
        }
        if (a4 == 8) {
            count8++;
        }
        if (a4 == 9) {
            count9++;
        }
        if (a4 == 10) {
            count10++;
        }
        if (a4 == 11) {
            count11++;
        }
        if (a4 == 12) {
            count12++;
        }
        if (a4 == 13) {
            count13++;
        }
        switch (a1) {
            case 1:
                a11 = "A";
                break;
            case 11:
                a11 = "J";
                break;
            case 12:
                a11 = "Q";
                break;
            case 13:
                a11 = "K";
                break;
            default:
                a11 = Integer.toString(a1);
                break;
        }
        switch (a2) {
            case 1:
                a22 = "A";
                break;
            case 11:
                a22 = "J";
                break;
            case 12:
                a22 = "Q";
                break;
            case 13:
                a22 = "K";
                break;
            default:
                a22 = Integer.toString(a2);
                break;
        }
        switch (a3) {
            case 1:
                a33 = "A";
                break;
            case 11:
                a33 = "J";
                break;
            case 12:
                a33 = "Q";
                break;
            case 13:
                a33 = "K";
                break;
            default:
                a33 = Integer.toString(a3);
                break;
        }
        switch (a4) {
            case 1:
                a44 = "A";
                break;
            case 11:
                a44 = "J";
                break;
            case 12:
                a44 = "Q";
                break;
            case 13:
                a44 = "K";
                break;
            default:
                a44 = Integer.toString(a4);
                break;
        }
        switch (a1) {
            case 11:
                a1 = 10;
                break;
            case 12:
                a1 = 10;
                break;
            case 13:
                a1 = 10;
                break;
            default:
                a1 = a1;
                break;
        }
        switch (a2) {
            case 11:
                a2 = 10;
                break;
            case 12:
                a2 = 10;
                break;
            case 13:
                a2 = 10;
                break;
            default:
                a2 = a2;
                break;
        }
        switch (a3) {
            case 11:
                a3 = 10;
                break;
            case 12:
                a3 = 10;
                break;
            case 13:
                a3 = 10;
                break;
            default:
                a3 = a3;
                break;
        }
        switch (a4) {
            case 11:
                a4 = 10;
                break;
            case 12:
                a4 = 10;
                break;
            case 13:
                a4 = 10;
                break;
            default:
                a4 = a4;
                break;
        }
        System.out.println("\nYour Cards Are: " + a11 + " & " + a22);
        if (a1 == 1) {
            System.out.println("\nIs Your Ace 1 Or 11?:");
            input2 = user.next();
            while (!(input2.equals("1"))) {
                if (input2.equals("11")) {
                    break;
                }
                System.out.println("\nPlease Type \"1\" Or \"11\": ");
                input2 = user.next();
            }
            if (input2.equals("1")) {
                a1 = 1;
            } else if (input2.equals("11")) {
                a1 = 11;
            }
        }
        if (a2 == 1) {
            System.out.println("\nIs Your Ace 1 Or 11?:");
            input2 = user.next();
            while (!(input2.equals("1"))) {
                if (input2.equals("11")) {
                    break;
                }
                System.out.println("\nPlease Type \"1\" Or \"11\": ");
                input2 = user.next();
            }
            if (input2.equals("1")) {
                a2 = 1;
            } else if (input2.equals("11")) {
                a2 = 11;
            }
        }
        player = a1 + a2;
        System.out.println("They Add Up To: " + player);
        if (player > 21) {
            System.out.println("You Loose! You Went Over 21!");
            System.exit(0);
        }
        System.out.println("The Dealer Is Showing: " + a33);
        System.out.println("\nWould You Like Another Card?:");
        input2 = user.next();
        while (!input2.equalsIgnoreCase(n)) {
            if (input2.equalsIgnoreCase(no)) {
                break;
            } else if (input2.equalsIgnoreCase(y)) {
                break;
            } else if (input2.equalsIgnoreCase(yes)) {
                break;
            } else {
                System.out.println("\nPlease Type yes/no Or y/n");
                input2 = user.next();
            }
        }
    }
}