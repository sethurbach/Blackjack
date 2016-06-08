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
public class I1 {
    public static void I1() {
        if (i1 == 1) {
            count1++;
        }
        if (i1 == 2) {
            count2++;
        }
        if (i1 == 3) {
            count3++;
        }
        if (i1 == 4) {
            count4++;
        }
        if (i1 == 5) {
            count5++;
        }
        if (i1 == 6) {
            count6++;
        }
        if (i1 == 7) {
            count7++;
        }
        if (i1 == 8) {
            count8++;
        }
        if (i1 == 9) {
            count9++;
        }
        if (i1 == 10) {
            count10++;
        }
        if (i1 == 11) {
            count11++;
        }
        if (i1 == 12) {
            count12++;
        }
        if (i1 == 13) {
            count13++;
        }
        if (count1 >= 4) {
            double ex = 1;
            if (i1 == ex) {
                while (i1 == ex) {
                    ii1 = Math.random();
                    ii1 = ((int) (i1 * 13) + 1);
                    i1 = (int) ii1;
                }
            }
        }
        if (count2 >= 4) {
            double ex = 2;
            if (i1 == ex) {
                while (i1 == ex) {
                    ii1 = Math.random();
                    ii1 = ((int) (i1 * 13) + 1);
                    i1 = (int) ii1;
                }
            }
        }
        if (count3 >= 4) {
            double ex = 3;
            if (i1 == ex) {
                while (i1 == ex) {
                    ii1 = Math.random();
                    ii1 = ((int) (i1 * 13) + 1);
                    i1 = (int) ii1;
                }
            }
        }
        if (count4 >= 4) {
            double ex = 4;
            if (i1 == ex) {
                while (i1 == ex) {
                    ii1 = Math.random();
                    ii1 = ((int) (i1 * 13) + 1);
                    i1 = (int) ii1;
                }
            }
        }
        if (count5 >= 4) {
            double ex = 5;
            if (i1 == ex) {
                while (i1 == ex) {
                    ii1 = Math.random();
                    ii1 = ((int) (i1 * 13) + 1);
                    i1 = (int) ii1;
                }
            }
        }
        if (count6 >= 4) {
            double ex = 6;
            if (i1 == ex) {
                while (i1 == ex) {
                    ii1 = Math.random();
                    ii1 = ((int) (i1 * 13) + 1);
                    i1 = (int) ii1;
                }
            }
        }
        if (count7 >= 4) {
            double ex = 7;
            if (i1 == ex) {
                while (i1 == ex) {
                    ii1 = Math.random();
                    ii1 = ((int) (i1 * 13) + 1);
                    i1 = (int) ii1;
                }
            }
        }
        if (count8 >= 4) {
            double ex = 8;
            if (i1 == ex) {
                while (i1 == ex) {
                    ii1 = Math.random();
                    ii1 = ((int) (i1 * 13) + 1);
                    i1 = (int) ii1;
                }
            }
        }
        if (count9 >= 4) {
            double ex = 9;
            if (i1 == ex) {
                while (i1 == ex) {
                    ii1 = Math.random();
                    ii1 = ((int) (i1 * 13) + 1);
                    i1 = (int) ii1;
                }
            }
        }
        if (count10 >= 4) {
            double ex = 10;
            if (i1 == ex) {
                while (i1 == ex) {
                    ii1 = Math.random();
                    ii1 = ((int) (i1 * 13) + 1);
                    i1 = (int) ii1;
                }
            }
        }
        if (count11 >= 4) {
            double ex = 11;
            if (i1 == ex) {
                while (i1 == ex) {
                    ii1 = Math.random();
                    ii1 = ((int) (i1 * 13) + 1);
                    i1 = (int) ii1;
                }
            }
        }
        if (count12 >= 4) {
            double ex = 12;
            if (i1 == ex) {
                while (i1 == ex) {
                    ii1 = Math.random();
                    ii1 = ((int) (i1 * 13) + 1);
                    i1 = (int) ii1;
                }
            }
        }
        if (count13 >= 4) {
            double ex = 13;
            if (i1 == ex) {
                while (i1 == ex) {
                    ii1 = Math.random();
                    ii1 = ((int) (i1 * 13) + 1);
                    i1 = (int) ii1;
                }
            }
        }
        switch (i1) {
            case 1:
                i11 = "A";
                break;
            case 11:
                i11 = "J";
                break;
            case 12:
                i11 = "Q";
                break;
            case 13:
                i11 = "K";
                break;
            default:
                i11 = Integer.toString(i1);
                break;
        }
        switch (i1) {
            case 11:
                i1 = 10;
                break;
            case 12:
                i1 = 10;
                break;
            case 13:
                i1 = 10;
                break;
            default:
                i1 = i1;
                break;
        }
        System.out.println("\nYour Cards Are: " + a11 + ", " + a22 + ", " + b11 + ", " + c11 + ", " + d11 + ", " + e11 + ", " + f11 + ", " + g11 + ", " + h11 + ", & " + i11);
        if (a1 == 1 || a1 == 11) {
            System.out.println("\nIs Your First Card The Same Or Different? (1/11):");
            input10 = user.next();
            while (!(input10.equals("1"))) {
                if (input10.equals("11")) {
                    break;
                }
                System.out.println("\nPlease Type \"1\" Or \"11\": ");
                input10 = user.next();
            }
            if (input10.equals("1")) {
                a1 = 1;
            } else if (input10.equals("11")) {
                a1 = 11;
            }
        }
        if (a2 == 1 || a2 == 11) {
            System.out.println("\nIs Your Second Card The Same Or Different? (1/11):");
            input10 = user.next();
            while (!(input10.equals("1"))) {
                if (input10.equals("11")) {
                    break;
                }
                System.out.println("\nPlease Type \"1\" Or \"11\": ");
                input10 = user.next();
            }
            if (input10.equals("1")) {
                a2 = 1;
            } else if (input10.equals("11")) {
                a2 = 11;
            }
        }
        if (b1 == 1) {
            System.out.println("\nIs Your Third Card The Same Or Different? (1/11):");
            input10 = user.next();
            while (!(input10.equals("1"))) {
                if (input10.equals("11")) {
                    break;
                }
                System.out.println("\nPlease Type \"1\" Or \"11\": ");
                input10 = user.next();
            }
            if (input10.equals("1")) {
                b1 = 1;
            } else if (input10.equals("11")) {
                b1 = 11;
            }
        }
        if (c1 == 1) {
            System.out.println("\nIs Your Fourth Card The Same Or Different? (1/11):");
            input10 = user.next();
            while (!(input10.equals("1"))) {
                if (input10.equals("11")) {
                    break;
                }
                System.out.println("\nPlease Type \"1\" Or \"11\": ");
                input10 = user.next();
            }
            if (input10.equals("1")) {
                c1 = 1;
            } else if (input10.equals("11")) {
                c1 = 11;
            }
        }
        if (d1 == 1) {
            System.out.println("\nIs Your Fifth Card The Same Or Different? (1/11):");
            input10 = user.next();
            while (!(input10.equals("1"))) {
                if (input10.equals("11")) {
                    break;
                }
                System.out.println("\nPlease Type \"1\" Or \"11\": ");
                input10 = user.next();
            }
            if (input10.equals("1")) {
                d1 = 1;
            } else if (input10.equals("11")) {
                d1 = 11;
            }
        }
        if (e1 == 1) {
            System.out.println("\nIs Your Sixth Card The Same Or Different? (1/11):");
            input10 = user.next();
            while (!(input10.equals("1"))) {
                if (input10.equals("11")) {
                    break;
                }
                System.out.println("\nPlease Type \"1\" Or \"11\": ");
                input10 = user.next();
            }
            if (input10.equals("1")) {
                e1 = 1;
            } else if (input10.equals("11")) {
                e1 = 11;
            }
        }
        if (f1 == 1) {
            System.out.println("\nIs Your Seventh Card The Same Or Different? (1/11):");
            input10 = user.next();
            while (!(input10.equals("1"))) {
                if (input10.equals("11")) {
                    break;
                }
                System.out.println("\nPlease Type \"1\" Or \"11\": ");
                input10 = user.next();
            }
            if (input10.equals("1")) {
                f1 = 1;
            } else if (input10.equals("11")) {
                f1 = 11;
            }
        }
        if (g1 == 1) {
            System.out.println("\nIs Your Eigth Card The Same Or Different? (1/11):");
            input10 = user.next();
            while (!(input10.equals("1"))) {
                if (input10.equals("11")) {
                    break;
                }
                System.out.println("\nPlease Type \"1\" Or \"11\": ");
                input10 = user.next();
            }
            if (input10.equals("1")) {
                g1 = 1;
            } else if (input10.equals("11")) {
                g1 = 11;
            }
        }
        if (h1 == 1) {
            System.out.println("\nIs Your Ninth Card The Same Or Different? (1/11):");
            input10 = user.next();
            while (!(input10.equals("1"))) {
                if (input10.equals("11")) {
                    break;
                }
                System.out.println("\nPlease Type \"1\" Or \"11\": ");
                input10 = user.next();
            }
            if (input10.equals("1")) {
                h1 = 1;
            } else if (input10.equals("11")) {
                h1 = 11;
            }
        }
        if (i1 == 1) {
            System.out.println("\nIs Your New Ace 1 Or 11?:");
            input10 = user.next();
            while (!(input10.equals("1"))) {
                if (input10.equals("11")) {
                    break;
                }
                System.out.println("\nPlease Type \"1\" Or \"11\": ");
                input10 = user.next();
            }
            if (input10.equals("1")) {
                i1 = 1;
            } else if (input10.equals("11")) {
                i1 = 11;
            }
        }
        player = a1 + a2 + b1 + c1 + d1 + e1 + f1 + g1 + h1 + i1;
        System.out.println("They Add Up To: " + noDec.format(player));
        if (player > 21) {
            System.out.println("You Lose! You Went Over 21!");
            System.exit(0);
        }
        System.out.println("The Dealer Is Showing: " + a33);
        System.out.println("\nWould You Like Another Card?:");
        input10 = user.next();
        while (!input10.equalsIgnoreCase(n)) {
            if (input10.equalsIgnoreCase(no)) {
                break;
            } else if (input10.equalsIgnoreCase(y)) {
                break;
            } else if (input10.equalsIgnoreCase(yes)) {
                break;
            } else {
                System.out.println("\nPlease Type yes/no Or y/n");
                input10 = user.next();
            }
        }
    }
}