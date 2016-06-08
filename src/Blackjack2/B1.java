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
public class B1 {

    public static void B1() {

        if (b1 == 1) {
            count1++;
        }
        if (b1 == 2) {
            count2++;
        }
        if (b1 == 3) {
            count3++;
        }
        if (b1 == 4) {
            count4++;
        }
        if (b1 == 5) {
            count5++;
        }
        if (b1 == 6) {
            count6++;
        }
        if (b1 == 7) {
            count7++;
        }
        if (b1 == 8) {
            count8++;
        }
        if (b1 == 9) {
            count9++;
        }
        if (b1 == 10) {
            count10++;
        }
        if (b1 == 11) {
            count11++;
        }
        if (b1 == 12) {
            count12++;
        }
        if (b1 == 13) {
            count13++;
        }
        if (count1 >= 4) {
            double ex = 1;
            if (b1 == ex) {
                while (b1 == ex) {
                    bb1 = Math.random();
                    bb1 = ((int) (b1 * 13) + 1);
                    b1 = (int) bb1;
                }
            }
        }
        if (count2 >= 4) {
            double ex = 2;
            if (b1 == ex) {
                while (b1 == ex) {
                    bb1 = Math.random();
                    bb1 = ((int) (b1 * 13) + 1);
                    b1 = (int) bb1;
                }
            }
        }
        if (count3 >= 4) {
            double ex = 3;
            if (b1 == ex) {
                while (b1 == ex) {
                    bb1 = Math.random();
                    bb1 = ((int) (b1 * 13) + 1);
                    b1 = (int) bb1;
                }
            }
        }
        if (count4 >= 4) {
            double ex = 4;
            if (b1 == ex) {
                while (b1 == ex) {
                    bb1 = Math.random();
                    bb1 = ((int) (b1 * 13) + 1);
                    b1 = (int) bb1;
                }
            }
        }
        if (count5 >= 4) {
            double ex = 5;
            if (b1 == ex) {
                while (b1 == ex) {
                    bb1 = Math.random();
                    bb1 = ((int) (b1 * 13) + 1);
                    b1 = (int) bb1;
                }
            }
        }
        if (count6 >= 4) {
            double ex = 6;
            if (b1 == ex) {
                while (b1 == ex) {
                    bb1 = Math.random();
                    bb1 = ((int) (b1 * 13) + 1);
                    b1 = (int) bb1;
                }
            }
        }
        if (count7 >= 4) {
            double ex = 7;
            if (b1 == ex) {
                while (b1 == ex) {
                    bb1 = Math.random();
                    bb1 = ((int) (b1 * 13) + 1);
                    b1 = (int) bb1;
                }
            }
        }
        if (count8 >= 4) {
            double ex = 8;
            if (b1 == ex) {
                while (b1 == ex) {
                    bb1 = Math.random();
                    bb1 = ((int) (b1 * 13) + 1);
                    b1 = (int) bb1;
                }
            }
        }
        if (count9 >= 4) {
            double ex = 9;
            if (b1 == ex) {
                while (b1 == ex) {
                    bb1 = Math.random();
                    bb1 = ((int) (b1 * 13) + 1);
                    b1 = (int) bb1;
                }
            }
        }
        if (count10 >= 4) {
            double ex = 10;
            if (b1 == ex) {
                while (b1 == ex) {
                    bb1 = Math.random();
                    bb1 = ((int) (b1 * 13) + 1);
                    b1 = (int) bb1;
                }
            }
        }
        if (count11 >= 4) {
            double ex = 11;
            if (b1 == ex) {
                while (b1 == ex) {
                    bb1 = Math.random();
                    bb1 = ((int) (b1 * 13) + 1);
                    b1 = (int) bb1;
                }
            }
        }
        if (count12 >= 4) {
            double ex = 12;
            if (b1 == ex) {
                while (b1 == ex) {
                    bb1 = Math.random();
                    bb1 = ((int) (b1 * 13) + 1);
                    b1 = (int) bb1;
                }
            }
        }
        if (count13 >= 4) {
            double ex = 13;
            if (b1 == ex) {
                while (b1 == ex) {
                    bb1 = Math.random();
                    bb1 = ((int) (b1 * 13) + 1);
                    b1 = (int) bb1;
                }
            }
        }
        switch (b1) {
            case 1:
                b11 = "A";
                break;
            case 11:
                b11 = "J";
                break;
            case 12:
                b11 = "Q";
                break;
            case 13:
                b11 = "K";
                break;
            default:
                b11 = Integer.toString(b1);
                break;
        }
        switch (b1) {
            case 11:
                b1 = 10;
                break;
            case 12:
                b1 = 10;
                break;
            case 13:
                b1 = 10;
                break;
            default:
                b1 = b1;
                break;
        }
        System.out.println("\nYour Cards Are: " + a11 + ", " + a22 + ", & " + b11);
        if (a1 == 1 || a1 == 11) {
            System.out.println("\nIs Your First Card The Same Or Different? (1/11):");
            input3 = user.next();
            while (!(input3.equals("1"))) {
                if (input3.equals("11")) {
                    break;
                }
                System.out.println("\nPlease Type \"1\" Or \"11\": ");
                input3 = user.next();
            }
            if (input3.equals("1")) {
                a1 = 1;
            } else if (input3.equals("11")) {
                a1 = 11;
            }
        }
        if (a2 == 1 || a2 == 11) {
            System.out.println("\nIs Your Second Card The Same Or Different? (1/11):");
            input3 = user.next();
            while (!(input3.equals("1"))) {
                if (input3.equals("11")) {
                    break;
                }
                System.out.println("\nPlease Type \"1\" Or \"11\": ");
                input3 = user.next();
            }
            if (input3.equals("1")) {
                a2 = 1;
            } else if (input3.equals("11")) {
                a2 = 11;
            }
        }
        if (b1 == 1) {
            System.out.println("\nIs Your New Ace 1 Or 11?:");
            input3 = user.next();
            while (!(input3.equals("1"))) {
                if (input3.equals("11")) {
                    break;
                }
                System.out.println("\nPlease Type \"1\" Or \"11\": ");
                input3 = user.next();
            }
            if (input3.equals("1")) {
                b1 = 1;
            } else if (input3.equals("11")) {
                b1 = 11;
            }
        }
        player = a1 + a2 + b1;
        System.out.println("They Add Up To: " + noDec.format(player));
        if (player > 21) {
            System.out.println("You Lose! You Went Over 21!");
            System.exit(0);
        }
        System.out.println("The Dealer Is Showing: " + a33);
        System.out.println("\nWould You Like Another Card?:");
        input3 = user.next();
        while (!input3.equalsIgnoreCase(n)) {
            if (input3.equalsIgnoreCase(no)) {
                break;
            } else if (input3.equalsIgnoreCase(y)) {
                break;
            } else if (input3.equalsIgnoreCase(yes)) {
                break;
            } else {
                System.out.println("\nPlease Type yes/no Or y/n");
                input3 = user.next();
            }
        }
    }
}
