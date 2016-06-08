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
public class D1 {
    public static void D1() {
        if (d1 == 1) {
            count1++;
        }
        if (d1 == 2) {
            count2++;
        }
        if (d1 == 3) {
            count3++;
        }
        if (d1 == 4) {
            count4++;
        }
        if (d1 == 5) {
            count5++;
        }
        if (d1 == 6) {
            count6++;
        }
        if (d1 == 7) {
            count7++;
        }
        if (d1 == 8) {
            count8++;
        }
        if (d1 == 9) {
            count9++;
        }
        if (d1 == 10) {
            count10++;
        }
        if (d1 == 11) {
            count11++;
        }
        if (d1 == 12) {
            count12++;
        }
        if (d1 == 13) {
            count13++;
        }
        if (count1 >= 4) {
            double ex = 1;
            if (d1 == ex) {
                while (d1 == ex) {
                    dd1 = Math.random();
                    dd1 = ((int) (d1 * 13) + 1);
                    d1 = (int) dd1;
                }
            }
        }
        if (count2 >= 4) {
            double ex = 2;
            if (d1 == ex) {
                while (d1 == ex) {
                    dd1 = Math.random();
                    dd1 = ((int) (d1 * 13) + 1);
                    d1 = (int) dd1;
                }
            }
        }
        if (count3 >= 4) {
            double ex = 3;
            if (d1 == ex) {
                while (d1 == ex) {
                    dd1 = Math.random();
                    dd1 = ((int) (d1 * 13) + 1);
                    d1 = (int) dd1;
                }
            }
        }
        if (count4 >= 4) {
            double ex = 4;
            if (d1 == ex) {
                while (d1 == ex) {
                    dd1 = Math.random();
                    dd1 = ((int) (d1 * 13) + 1);
                    d1 = (int) dd1;
                }
            }
        }
        if (count5 >= 4) {
            double ex = 5;
            if (d1 == ex) {
                while (d1 == ex) {
                    dd1 = Math.random();
                    dd1 = ((int) (d1 * 13) + 1);
                    d1 = (int) dd1;
                }
            }
        }
        if (count6 >= 4) {
            double ex = 6;
            if (d1 == ex) {
                while (d1 == ex) {
                    dd1 = Math.random();
                    dd1 = ((int) (d1 * 13) + 1);
                    d1 = (int) dd1;
                }
            }
        }
        if (count7 >= 4) {
            double ex = 7;
            if (d1 == ex) {
                while (d1 == ex) {
                    dd1 = Math.random();
                    dd1 = ((int) (d1 * 13) + 1);
                    d1 = (int) dd1;
                }
            }
        }
        if (count8 >= 4) {
            double ex = 8;
            if (d1 == ex) {
                while (d1 == ex) {
                    dd1 = Math.random();
                    dd1 = ((int) (d1 * 13) + 1);
                    d1 = (int) dd1;
                }
            }
        }
        if (count9 >= 4) {
            double ex = 9;
            if (d1 == ex) {
                while (d1 == ex) {
                    dd1 = Math.random();
                    dd1 = ((int) (d1 * 13) + 1);
                    d1 = (int) dd1;
                }
            }
        }
        if (count10 >= 4) {
            double ex = 10;
            if (d1 == ex) {
                while (d1 == ex) {
                    dd1 = Math.random();
                    dd1 = ((int) (d1 * 13) + 1);
                    d1 = (int) dd1;
                }
            }
        }
        if (count11 >= 4) {
            double ex = 11;
            if (d1 == ex) {
                while (d1 == ex) {
                    dd1 = Math.random();
                    dd1 = ((int) (d1 * 13) + 1);
                    d1 = (int) dd1;
                }
            }
        }
        if (count12 >= 4) {
            double ex = 12;
            if (d1 == ex) {
                while (d1 == ex) {
                    dd1 = Math.random();
                    dd1 = ((int) (d1 * 13) + 1);
                    d1 = (int) dd1;
                }
            }
        }
        if (count13 >= 4) {
            double ex = 13;
            if (d1 == ex) {
                while (d1 == ex) {
                    dd1 = Math.random();
                    dd1 = ((int) (d1 * 13) + 1);
                    d1 = (int) dd1;
                }
            }
        }
        switch (d1) {
            case 1:
                d11 = "A";
                break;
            case 11:
                d11 = "J";
                break;
            case 12:
                d11 = "Q";
                break;
            case 13:
                d11 = "K";
                break;
            default:
                d11 = Integer.toString(d1);
                break;
        }
        switch (d1) {
            case 11:
                d1 = 10;
                break;
            case 12:
                d1 = 10;
                break;
            case 13:
                d1 = 10;
                break;
            default:
                d1 = d1;
                break;
        }
        System.out.println("\nYour Cards Are: " + a11 + ", " + a22 + ", " + b11 + ", " + c11 + ", & " + d11);
        if (a1 == 1 || a1 == 11) {
            System.out.println("\nIs Your First Card The Same Or Different? (1/11):");
            input5 = user.next();
            while (!(input5.equals("1"))) {
                if (input5.equals("11")) {
                    break;
                }
                System.out.println("\nPlease Type \"1\" Or \"11\": ");
                input5 = user.next();
            }
            if (input5.equals("1")) {
                a1 = 1;
            } else if (input5.equals("11")) {
                a1 = 11;
            }
        }
        if (a2 == 1 || a2 == 11) {
            System.out.println("\nIs Your Second Card The Same Or Different? (1/11):");
            input5 = user.next();
            while (!(input5.equals("1"))) {
                if (input5.equals("11")) {
                    break;
                }
                System.out.println("\nPlease Type \"1\" Or \"11\": ");
                input5 = user.next();
            }
            if (input5.equals("1")) {
                a2 = 1;
            } else if (input5.equals("11")) {
                a2 = 11;
            }
        }
        if (b1 == 1) {
            System.out.println("\nIs Your Third Card The Same Or Different? (1/11):");
            input5 = user.next();
            while (!(input5.equals("1"))) {
                if (input5.equals("11")) {
                    break;
                }
                System.out.println("\nPlease Type \"1\" Or \"11\": ");
                input5 = user.next();
            }
            if (input5.equals("1")) {
                b1 = 1;
            } else if (input5.equals("11")) {
                b1 = 11;
            }
        }
        if (c1 == 1) {
            System.out.println("\nIs Your Fourth Card The Same Or Different? (1/11):");
            input5 = user.next();
            while (!(input5.equals("1"))) {
                if (input5.equals("11")) {
                    break;
                }
                System.out.println("\nPlease Type \"1\" Or \"11\": ");
                input5 = user.next();
            }
            if (input5.equals("1")) {
                c1 = 1;
            } else if (input5.equals("11")) {
                c1 = 11;
            }
        }
        if (d1 == 1) {
            System.out.println("\nIs Your New Ace 1 Or 11?:");
            input5 = user.next();
            while (!(input5.equals("1"))) {
                if (input5.equals("11")) {
                    break;
                }
                System.out.println("\nPlease Type \"1\" Or \"11\": ");
                input5 = user.next();
            }
            if (input5.equals("1")) {
                d1 = 1;
            } else if (input5.equals("11")) {
                d1 = 11;
            }
        }
        player = a1 + a2 + b1 + c1 + d1;
        System.out.println("They Add Up To: " + noDec.format(player));
        if (player > 21) {
            System.out.println("You Lose! You Went Over 21!");
            System.exit(0);
        }
        System.out.println("The Dealer Is Showing: " + a33);
        System.out.println("\nWould You Like Another Card?:");
        input5 = user.next();
        while (!input5.equalsIgnoreCase(n)) {
            if (input5.equalsIgnoreCase(no)) {
                break;
            } else if (input5.equalsIgnoreCase(y)) {
                break;
            } else if (input5.equalsIgnoreCase(yes)) {
                break;
            } else {
                System.out.println("\nPlease Type yes/no Or y/n");
                input5 = user.next();
            }
        }
    }
}