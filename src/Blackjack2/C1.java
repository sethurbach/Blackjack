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
public class C1 {

    public static void C1() {
        if (c1 == 1) {
            count1++;
        }
        if (c1 == 2) {
            count2++;
        }
        if (c1 == 3) {
            count3++;
        }
        if (c1 == 4) {
            count4++;
        }
        if (c1 == 5) {
            count5++;
        }
        if (c1 == 6) {
            count6++;
        }
        if (c1 == 7) {
            count7++;
        }
        if (c1 == 8) {
            count8++;
        }
        if (c1 == 9) {
            count9++;
        }
        if (c1 == 10) {
            count10++;
        }
        if (c1 == 11) {
            count11++;
        }
        if (c1 == 12) {
            count12++;
        }
        if (c1 == 13) {
            count13++;
        }
        if (count1 >= 4) {
            double ex = 1;
            if (c1 == ex) {
                while (c1 == ex) {
                    cc1 = Math.random();
                    cc1 = ((int) (c1 * 13) + 1);
                    c1 = (int) cc1;
                }
            }
        }
        if (count2 >= 4) {
            double ex = 2;
            if (c1 == ex) {
                while (c1 == ex) {
                    cc1 = Math.random();
                    cc1 = ((int) (c1 * 13) + 1);
                    c1 = (int) cc1;
                }
            }
        }
        if (count3 >= 4) {
            double ex = 3;
            if (c1 == ex) {
                while (c1 == ex) {
                    cc1 = Math.random();
                    cc1 = ((int) (c1 * 13) + 1);
                    c1 = (int) cc1;
                }
            }
        }
        if (count4 >= 4) {
            double ex = 4;
            if (c1 == ex) {
                while (c1 == ex) {
                    cc1 = Math.random();
                    cc1 = ((int) (c1 * 13) + 1);
                    c1 = (int) cc1;
                }
            }
        }
        if (count5 >= 4) {
            double ex = 5;
            if (c1 == ex) {
                while (c1 == ex) {
                    cc1 = Math.random();
                    cc1 = ((int) (c1 * 13) + 1);
                    c1 = (int) cc1;
                }
            }
        }
        if (count6 >= 4) {
            double ex = 6;
            if (c1 == ex) {
                while (c1 == ex) {
                    cc1 = Math.random();
                    cc1 = ((int) (c1 * 13) + 1);
                    c1 = (int) cc1;
                }
            }
        }
        if (count7 >= 4) {
            double ex = 7;
            if (c1 == ex) {
                while (c1 == ex) {
                    cc1 = Math.random();
                    cc1 = ((int) (c1 * 13) + 1);
                    c1 = (int) cc1;
                }
            }
        }
        if (count8 >= 4) {
            double ex = 8;
            if (c1 == ex) {
                while (c1 == ex) {
                    cc1 = Math.random();
                    cc1 = ((int) (c1 * 13) + 1);
                    c1 = (int) cc1;
                }
            }
        }
        if (count9 >= 4) {
            double ex = 9;
            if (c1 == ex) {
                while (c1 == ex) {
                    cc1 = Math.random();
                    cc1 = ((int) (c1 * 13) + 1);
                    c1 = (int) cc1;
                }
            }
        }
        if (count10 >= 4) {
            double ex = 10;
            if (c1 == ex) {
                while (c1 == ex) {
                    cc1 = Math.random();
                    cc1 = ((int) (c1 * 13) + 1);
                    c1 = (int) cc1;
                }
            }
        }
        if (count11 >= 4) {
            double ex = 11;
            if (c1 == ex) {
                while (c1 == ex) {
                    cc1 = Math.random();
                    cc1 = ((int) (c1 * 13) + 1);
                    c1 = (int) cc1;
                }
            }
        }
        if (count2 >= 4) {
            double ex = 12;
            if (c1 == ex) {
                while (c1 == ex) {
                    cc1 = Math.random();
                    cc1 = ((int) (c1 * 13) + 1);
                    c1 = (int) cc1;
                }
            }
        }
        if (count13 >= 4) {
            double ex = 13;
            if (c1 == ex) {
                while (c1 == ex) {
                    cc1 = Math.random();
                    cc1 = ((int) (c1 * 13) + 1);
                    c1 = (int) cc1;
                }
            }
        }
        switch (c1) {
            case 1:
                c11 = "A";
                break;
            case 11:
                c11 = "J";
                break;
            case 12:
                c11 = "Q";
                break;
            case 13:
                c11 = "K";
                break;
            default:
                c11 = Integer.toString(c1);
                break;
        }
        switch (c1) {
            case 11:
                c1 = 10;
                break;
            case 12:
                c1 = 10;
                break;
            case 13:
                c1 = 10;
                break;
            default:
                c1 = c1;
                break;
        }
        System.out.println("\nYour Cards Are: " + a11 + ", " + a22 + ", " + b11 + ", & " + c11);
        if (a1 == 1 || a1 == 11) {
            System.out.println("\nIs Your First Card The Same Or Different? (1/11):");
            input4 = user.next();
            while (!(input4.equals("1"))) {
                if (input4.equals("11")) {
                    break;
                }
                System.out.println("\nPlease Type \"1\" Or \"11\": ");
                input4 = user.next();
            }
            if (input4.equals("1")) {
                a1 = 1;
            } else if (input4.equals("11")) {
                a1 = 11;
            }
        }
        if (a2 == 1 || a2 == 11) {
            System.out.println("\nIs Your Second Card The Same Or Different? (1/11):");
            input4 = user.next();
            while (!(input4.equals("1"))) {
                if (input4.equals("11")) {
                    break;
                }
                System.out.println("\nPlease Type \"1\" Or \"11\": ");
                input4 = user.next();
            }
            if (input4.equals("1")) {
                a2 = 1;
            } else if (input4.equals("11")) {
                a2 = 11;
            }
        }
        if (b1 == 1) {
            System.out.println("\nIs Your Third Card The Same Or Different? (1/11):");
            input4 = user.next();
            while (!(input4.equals("1"))) {
                if (input4.equals("11")) {
                    break;
                }
                System.out.println("\nPlease Type \"1\" Or \"11\": ");
                input4 = user.next();
            }
            if (input4.equals("1")) {
                b1 = 1;
            } else if (input4.equals("11")) {
                b1 = 11;
            }
        }
        if (c1 == 1) {
            System.out.println("\nIs Your New Ace 1 Or 11?:");
            input4 = user.next();
            while (!(input4.equals("1"))) {
                if (input4.equals("11")) {
                    break;
                }
                System.out.println("\nPlease Type \"1\" Or \"11\": ");
                input4 = user.next();
            }
            if (input4.equals("1")) {
                c1 = 1;
            } else if (input4.equals("11")) {
                c1 = 11;
            }
        }
        player = a1 + a2 + b1 + c1;
        System.out.println("They Add Up To: " + noDec.format(player));
        if (player > 21) {
            System.out.println("You Lose! You Went Over 21!");
            System.exit(0);
        }
        System.out.println("The Dealer Is Showing: " + a33);
        System.out.println("\nWould You Like Another Card?:");
        input4 = user.next();
        while (!input4.equalsIgnoreCase(n)) {
            if (input4.equalsIgnoreCase(no)) {
                break;
            } else if (input4.equalsIgnoreCase(y)) {
                break;
            } else if (input4.equalsIgnoreCase(yes)) {
                break;
            } else {
                System.out.println("\nPlease Type yes/no Or y/n");
                input4 = user.next();
            }
        }
    }
}