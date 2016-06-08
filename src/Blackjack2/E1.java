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
public class E1 {
    public static void E1() {
        if (e1 == 1) {
            count1++;
        }
        if (e1 == 2) {
            count2++;
        }
        if (e1 == 3) {
            count3++;
        }
        if (e1 == 4) {
            count4++;
        }
        if (e1 == 5) {
            count5++;
        }
        if (e1 == 6) {
            count6++;
        }
        if (e1 == 7) {
            count7++;
        }
        if (e1 == 8) {
            count8++;
        }
        if (e1 == 9) {
            count9++;
        }
        if (e1 == 10) {
            count10++;
        }
        if (e1 == 11) {
            count11++;
        }
        if (e1 == 12) {
            count12++;
        }
        if (e1 == 13) {
            count13++;
        }
        if (count1 >= 4) {
            double ex = 1;
            if (e1 == ex) {
                while (e1 == ex) {
                    ee1 = Math.random();
                    ee1 = ((int) (e1 * 13) + 1);
                    e1 = (int) ee1;
                }
            }
        }
        if (count2 >= 4) {
            double ex = 2;
            if (e1 == ex) {
                while (e1 == ex) {
                    ee1 = Math.random();
                    ee1 = ((int) (e1 * 13) + 1);
                    e1 = (int) ee1;
                }
            }
        }
        if (count3 >= 4) {
            double ex = 3;
            if (e1 == ex) {
                while (e1 == ex) {
                    ee1 = Math.random();
                    ee1 = ((int) (e1 * 13) + 1);
                    e1 = (int) ee1;
                }
            }
        }
        if (count4 >= 4) {
            double ex = 4;
            if (e1 == ex) {
                while (e1 == ex) {
                    ee1 = Math.random();
                    ee1 = ((int) (e1 * 13) + 1);
                    e1 = (int) ee1;
                }
            }
        }
        if (count5 >= 4) {
            double ex = 5;
            if (e1 == ex) {
                while (e1 == ex) {
                    ee1 = Math.random();
                    ee1 = ((int) (e1 * 13) + 1);
                    e1 = (int) ee1;
                }
            }
        }
        if (count6 >= 4) {
            double ex = 6;
            if (e1 == ex) {
                while (e1 == ex) {
                    ee1 = Math.random();
                    ee1 = ((int) (e1 * 13) + 1);
                    e1 = (int) ee1;
                }
            }
        }
        if (count7 >= 4) {
            double ex = 7;
            if (e1 == ex) {
                while (e1 == ex) {
                    ee1 = Math.random();
                    ee1 = ((int) (e1 * 13) + 1);
                    e1 = (int) ee1;
                }
            }
        }
        if (count8 >= 4) {
            double ex = 8;
            if (e1 == ex) {
                while (e1 == ex) {
                    ee1 = Math.random();
                    ee1 = ((int) (e1 * 13) + 1);
                    e1 = (int) ee1;
                }
            }
        }
        if (count9 >= 4) {
            double ex = 9;
            if (e1 == ex) {
                while (e1 == ex) {
                    ee1 = Math.random();
                    ee1 = ((int) (e1 * 13) + 1);
                    e1 = (int) ee1;
                }
            }
        }
        if (count10 >= 4) {
            double ex = 10;
            if (e1 == ex) {
                while (e1 == ex) {
                    ee1 = Math.random();
                    ee1 = ((int) (e1 * 13) + 1);
                    e1 = (int) ee1;
                }
            }
        }
        if (count11 >= 4) {
            double ex = 11;
            if (e1 == ex) {
                while (e1 == ex) {
                    ee1 = Math.random();
                    ee1 = ((int) (e1 * 13) + 1);
                    e1 = (int) ee1;
                }
            }
        }
        if (count12 >= 4) {
            double ex = 12;
            if (e1 == ex) {
                while (e1 == ex) {
                    ee1 = Math.random();
                    ee1 = ((int) (e1 * 13) + 1);
                    e1 = (int) ee1;
                }
            }
        }
        if (count13 >= 4) {
            double ex = 13;
            if (e1 == ex) {
                while (e1 == ex) {
                    ee1 = Math.random();
                    ee1 = ((int) (e1 * 13) + 1);
                    e1 = (int) ee1;
                }
            }
        }
        switch (e1) {
            case 1:
                e11 = "A";
                break;
            case 11:
                e11 = "J";
                break;
            case 12:
                e11 = "Q";
                break;
            case 13:
                e11 = "K";
                break;
            default:
                e11 = Integer.toString(e1);
                break;
        }
        switch (e1) {
            case 11:
                e1 = 10;
                break;
            case 12:
                e1 = 10;
                break;
            case 13:
                e1 = 10;
                break;
            default:
                e1 = e1;
                break;
        }
        System.out.println("\nYour Cards Are: " + a11 + ", " + a22 + ", " + b11 + ", " + c11 + ", " + d11 + ", & " + e11);
        if (a1 == 1 || a1 == 11) {
            System.out.println("\nIs Your First Card The Same Or Different? (1/11):");
            input6 = user.next();
            while (!(input6.equals("1"))) {
                if (input6.equals("11")) {
                    break;
                }
                System.out.println("\nPlease Type \"1\" Or \"11\": ");
                input6 = user.next();
            }
            if (input6.equals("1")) {
                a1 = 1;
            } else if (input6.equals("11")) {
                a1 = 11;
            }
        }
        if (a2 == 1 || a2 == 11) {
            System.out.println("\nIs Your Second Card The Same Or Different? (1/11):");
            input6 = user.next();
            while (!(input6.equals("1"))) {
                if (input6.equals("11")) {
                    break;
                }
                System.out.println("\nPlease Type \"1\" Or \"11\": ");
                input6 = user.next();
            }
            if (input6.equals("1")) {
                a2 = 1;
            } else if (input6.equals("11")) {
                a2 = 11;
            }
        }
        if (b1 == 1) {
            System.out.println("\nIs Your Third Card The Same Or Different? (1/11):");
            input6 = user.next();
            while (!(input6.equals("1"))) {
                if (input6.equals("11")) {
                    break;
                }
                System.out.println("\nPlease Type \"1\" Or \"11\": ");
                input6 = user.next();
            }
            if (input6.equals("1")) {
                b1 = 1;
            } else if (input6.equals("11")) {
                b1 = 11;
            }
        }
        if (c1 == 1) {
            System.out.println("\nIs Your Fourth Card The Same Or Different? (1/11):");
            input6 = user.next();
            while (!(input6.equals("1"))) {
                if (input6.equals("11")) {
                    break;
                }
                System.out.println("\nPlease Type \"1\" Or \"11\": ");
                input6 = user.next();
            }
            if (input6.equals("1")) {
                c1 = 1;
            } else if (input6.equals("11")) {
                c1 = 11;
            }
        }
        if (d1 == 1) {
            System.out.println("\nIs Your Fifth Card The Same Or Different? (1/11):");
            input6 = user.next();
            while (!(input6.equals("1"))) {
                if (input6.equals("11")) {
                    break;
                }
                System.out.println("\nPlease Type \"1\" Or \"11\": ");
                input6 = user.next();
            }
            if (input6.equals("1")) {
                d1 = 1;
            } else if (input6.equals("11")) {
                d1 = 11;
            }
        }
        if (e1 == 1) {
            System.out.println("\nIs Your New Ace 1 Or 11?:");
            input6 = user.next();
            while (!(input6.equals("1"))) {
                if (input6.equals("11")) {
                    break;
                }
                System.out.println("\nPlease Type \"1\" Or \"11\": ");
                input6 = user.next();
            }
            if (input6.equals("1")) {
                e1 = 1;
            } else if (input6.equals("11")) {
                e1 = 11;
            }
        }
        player = a1 + a2 + b1 + c1 + d1 + e1;
        System.out.println("They Add Up To: " + noDec.format(player));
        if (player > 21) {
            System.out.println("You Lose! You Went Over 21!");
            System.exit(0);
        }
        System.out.println("The Dealer Is Showing: " + a33);
        System.out.println("\nWould You Like Another Card?:");
        input6 = user.next();
        while (!input6.equalsIgnoreCase(n)) {
            if (input6.equalsIgnoreCase(no)) {
                break;
            } else if (input6.equalsIgnoreCase(y)) {
                break;
            } else if (input6.equalsIgnoreCase(yes)) {
                break;
            } else {
                System.out.println("\nPlease Type yes/no Or y/n");
                input6 = user.next();
            }
        }
    }
}