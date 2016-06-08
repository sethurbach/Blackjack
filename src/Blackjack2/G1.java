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
public class G1 {
    
    public static void G1() {
        if (g1 == 1) {
            count1++;
        }
        if (g1 == 2) {
            count2++;
        }
        if (g1 == 3) {
            count3++;
        }
        if (g1 == 4) {
            count4++;
        }
        if (g1 == 5) {
            count5++;
        }
        if (g1 == 6) {
            count6++;
        }
        if (g1 == 7) {
            count7++;
        }
        if (g1 == 8) {
            count8++;
        }
        if (g1 == 9) {
            count9++;
        }
        if (g1 == 10) {
            count10++;
        }
        if (g1 == 11) {
            count11++;
        }
        if (g1 == 12) {
            count12++;
        }
        if (g1 == 13) {
            count13++;
        }
        if (count1 >= 4) {
            double ex = 1;
            if (g1 == ex) {
                while (g1 == ex) {
                    gg1 = Math.random();
                    gg1 = ((int) (g1 * 13) + 1);
                    g1 = (int) gg1;
                }
            }
        }
        if (count2 >= 4) {
            double ex = 2;
            if (g1 == ex) {
                while (g1 == ex) {
                    gg1 = Math.random();
                    gg1 = ((int) (g1 * 13) + 1);
                    g1 = (int) gg1;
                }
            }
        }
        if (count3 >= 4) {
            double ex = 3;
            if (g1 == ex) {
                while (g1 == ex) {
                    gg1 = Math.random();
                    gg1 = ((int) (g1 * 13) + 1);
                    g1 = (int) gg1;
                }
            }
        }
        if (count4 >= 4) {
            double ex = 4;
            if (g1 == ex) {
                while (g1 == ex) {
                    gg1 = Math.random();
                    gg1 = ((int) (g1 * 13) + 1);
                    g1 = (int) gg1;
                }
            }
        }
        if (count5 >= 4) {
            double ex = 5;
            if (g1 == ex) {
                while (g1 == ex) {
                    gg1 = Math.random();
                    gg1 = ((int) (g1 * 13) + 1);
                    g1 = (int) gg1;
                }
            }
        }
        if (count6 >= 4) {
            double ex = 6;
            if (g1 == ex) {
                while (g1 == ex) {
                    gg1 = Math.random();
                    gg1 = ((int) (g1 * 13) + 1);
                    g1 = (int) gg1;
                }
            }
        }
        if (count7 >= 4) {
            double ex = 7;
            if (g1 == ex) {
                while (g1 == ex) {
                    gg1 = Math.random();
                    gg1 = ((int) (g1 * 13) + 1);
                    g1 = (int) gg1;
                }
            }
        }
        if (count8 >= 4) {
            double ex = 8;
            if (g1 == ex) {
                while (g1 == ex) {
                    gg1 = Math.random();
                    gg1 = ((int) (g1 * 13) + 1);
                    g1 = (int) gg1;
                }
            }
        }
        if (count9 >= 4) {
            double ex = 9;
            if (g1 == ex) {
                while (g1 == ex) {
                    gg1 = Math.random();
                    gg1 = ((int) (g1 * 13) + 1);
                    g1 = (int) gg1;
                }
            }
        }
        if (count10 >= 4) {
            double ex = 10;
            if (g1 == ex) {
                while (g1 == ex) {
                    gg1 = Math.random();
                    gg1 = ((int) (g1 * 13) + 1);
                    g1 = (int) gg1;
                }
            }
        }
        if (count11 >= 4) {
            double ex = 11;
            if (g1 == ex) {
                while (g1 == ex) {
                    gg1 = Math.random();
                    gg1 = ((int) (g1 * 13) + 1);
                    g1 = (int) gg1;
                }
            }
        }
        if (count12 >= 4) {
            double ex = 12;
            if (g1 == ex) {
                while (g1 == ex) {
                    gg1 = Math.random();
                    gg1 = ((int) (g1 * 13) + 1);
                    g1 = (int) gg1;
                }
            }
        }
        if (count13 >= 4) {
            double ex = 13;
            if (g1 == ex) {
                while (g1 == ex) {
                    gg1 = Math.random();
                    gg1 = ((int) (g1 * 13) + 1);
                    g1 = (int) gg1;
                }
            }
        }
        switch (g1) {
            case 1:
                g11 = "A";
                break;
            case 11:
                g11 = "J";
                break;
            case 12:
                g11 = "Q";
                break;
            case 13:
                g11 = "K";
                break;
            default:
                g11 = Integer.toString(g1);
                break;
        }
        switch (g1) {
            case 11:
                g1 = 10;
                break;
            case 12:
                g1 = 10;
                break;
            case 13:
                g1 = 10;
                break;
            default:
                g1 = g1;
                break;
        }
        System.out.println("\nYour Cards Are: " + a11 + ", " + a22 + ", " + b11 + ", " + c11 + ", " + d11 + ", " + e11 + ", " + f11 + ", & " + g11);
        if (a1 == 1 || a1 == 11) {
            System.out.println("\nIs Your First Card The Same Or Different? (1/11):");
            input8 = user.next();
            while (!(input8.equals("1"))) {
                if (input8.equals("11")) {
                    break;
                }
                System.out.println("\nPlease Type \"1\" Or \"11\": ");
                input8 = user.next();
            }
            if (input8.equals("1")) {
                a1 = 1;
            } else if (input8.equals("11")) {
                a1 = 11;
            }
        }
        if (a2 == 1 || a2 == 11) {
            System.out.println("\nIs Your Second Card The Same Or Different? (1/11):");
            input8 = user.next();
            while (!(input8.equals("1"))) {
                if (input8.equals("11")) {
                    break;
                }
                System.out.println("\nPlease Type \"1\" Or \"11\": ");
                input8 = user.next();
            }
            if (input8.equals("1")) {
                a2 = 1;
            } else if (input8.equals("11")) {
                a2 = 11;
            }
        }
        if (b1 == 1) {
            System.out.println("\nIs Your Third Card The Same Or Different? (1/11):");
            input8 = user.next();
            while (!(input8.equals("1"))) {
                if (input8.equals("11")) {
                    break;
                }
                System.out.println("\nPlease Type \"1\" Or \"11\": ");
                input8 = user.next();
            }
            if (input8.equals("1")) {
                b1 = 1;
            } else if (input8.equals("11")) {
                b1 = 11;
            }
        }
        if (c1 == 1) {
            System.out.println("\nIs Your Fourth Card The Same Or Different? (1/11):");
            input8 = user.next();
            while (!(input8.equals("1"))) {
                if (input8.equals("11")) {
                    break;
                }
                System.out.println("\nPlease Type \"1\" Or \"11\": ");
                input8 = user.next();
            }
            if (input8.equals("1")) {
                c1 = 1;
            } else if (input8.equals("11")) {
                c1 = 11;
            }
        }
        if (d1 == 1) {
            System.out.println("\nIs Your Fifth Card The Same Or Different? (1/11):");
            input8 = user.next();
            while (!(input8.equals("1"))) {
                if (input8.equals("11")) {
                    break;
                }
                System.out.println("\nPlease Type \"1\" Or \"11\": ");
                input8 = user.next();
            }
            if (input8.equals("1")) {
                d1 = 1;
            } else if (input8.equals("11")) {
                d1 = 11;
            }
        }
        if (e1 == 1) {
            System.out.println("\nIs Your Sixth Card The Same Or Different? (1/11):");
            input8 = user.next();
            while (!(input8.equals("1"))) {
                if (input8.equals("11")) {
                    break;
                }
                System.out.println("\nPlease Type \"1\" Or \"11\": ");
                input8 = user.next();
            }
            if (input8.equals("1")) {
                e1 = 1;
            } else if (input8.equals("11")) {
                e1 = 11;
            }
        }
        if (f1 == 1) {
            System.out.println("\nIs Your Seventh Card The Same Or Different? (1/11):");
            input8 = user.next();
            while (!(input8.equals("1"))) {
                if (input8.equals("11")) {
                    break;
                }
                System.out.println("\nPlease Type \"1\" Or \"11\": ");
                input8 = user.next();
            }
            if (input8.equals("1")) {
                f1 = 1;
            } else if (input8.equals("11")) {
                f1 = 11;
            }
        }
        if (g1 == 1) {
            System.out.println("\nIs Your New Ace 1 Or 11?:");
            input8 = user.next();
            while (!(input8.equals("1"))) {
                if (input8.equals("11")) {
                    break;
                }
                System.out.println("\nPlease Type \"1\" Or \"11\": ");
                input8 = user.next();
            }
            if (input8.equals("1")) {
                g1 = 1;
            } else if (input8.equals("11")) {
                g1 = 11;
            }
        }
        player = a1 + a2 + b1 + c1 + d1 + e1 + f1 + g1;
        System.out.println("They Add Up To: " + noDec.format(player));
        if (player > 21) {
            System.out.println("You Lose! You Went Over 21!");
            System.exit(0);
        }
        System.out.println("The Dealer Is Showing: " + a33);
        System.out.println("\nWould You Like Another Card?:");
        input8 = user.next();
        while (!input8.equalsIgnoreCase(n)) {
            if (input8.equalsIgnoreCase(no)) {
                break;
            } else if (input8.equalsIgnoreCase(y)) {
                break;
            } else if (input8.equalsIgnoreCase(yes)) {
                break;
            } else {
                System.out.println("\nPlease Type yes/no Or y/n");
                input8 = user.next();
            }
        }
    }
}
