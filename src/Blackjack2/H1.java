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
public class H1 {
    public static void H1() {
        if (h1 == 1) {
            count1++;
        }
        if (h1 == 2) {
            count2++;
        }
        if (h1 == 3) {
            count3++;
        }
        if (h1 == 4) {
            count4++;
        }
        if (h1 == 5) {
            count5++;
        }
        if (h1 == 6) {
            count6++;
        }
        if (h1 == 7) {
            count7++;
        }
        if (h1 == 8) {
            count8++;
        }
        if (h1 == 9) {
            count9++;
        }
        if (h1 == 10) {
            count10++;
        }
        if (h1 == 11) {
            count11++;
        }
        if (h1 == 12) {
            count12++;
        }
        if (h1 == 13) {
            count13++;
        }
        if (count1 >= 4) {
            double ex = 1;
            if (h1 == ex) {
                while (h1 == ex) {
                    hh1 = Math.random();
                    hh1 = ((int) (h1 * 13) + 1);
                    h1 = (int) hh1;
                }
            }
        }
        if (count2 >= 4) {
            double ex = 2;
            if (h1 == ex) {
                while (h1 == ex) {
                    hh1 = Math.random();
                    hh1 = ((int) (h1 * 13) + 1);
                    h1 = (int) hh1;
                }
            }
        }
        if (count3 >= 4) {
            double ex = 3;
            if (h1 == ex) {
                while (h1 == ex) {
                    hh1 = Math.random();
                    hh1 = ((int) (h1 * 13) + 1);
                    h1 = (int) hh1;
                }
            }
        }
        if (count4 >= 4) {
            double ex = 4;
            if (h1 == ex) {
                while (h1 == ex) {
                    hh1 = Math.random();
                    hh1 = ((int) (h1 * 13) + 1);
                    h1 = (int) hh1;
                }
            }
        }
        if (count5 >= 4) {
            double ex = 5;
            if (h1 == ex) {
                while (h1 == ex) {
                    hh1 = Math.random();
                    hh1 = ((int) (h1 * 13) + 1);
                    h1 = (int) hh1;
                }
            }
        }
        if (count6 >= 4) {
            double ex = 6;
            if (h1 == ex) {
                while (h1 == ex) {
                    hh1 = Math.random();
                    hh1 = ((int) (h1 * 13) + 1);
                    h1 = (int) hh1;
                }
            }
        }
        if (count7 >= 4) {
            double ex = 7;
            if (h1 == ex) {
                while (h1 == ex) {
                    hh1 = Math.random();
                    hh1 = ((int) (h1 * 13) + 1);
                    h1 = (int) hh1;
                }
            }
        }
        if (count8 >= 4) {
            double ex = 8;
            if (h1 == ex) {
                while (h1 == ex) {
                    hh1 = Math.random();
                    hh1 = ((int) (h1 * 13) + 1);
                    h1 = (int) hh1;
                }
            }
        }
        if (count9 >= 4) {
            double ex = 9;
            if (h1 == ex) {
                while (h1 == ex) {
                    hh1 = Math.random();
                    hh1 = ((int) (h1 * 13) + 1);
                    h1 = (int) hh1;
                }
            }
        }
        if (count10 >= 4) {
            double ex = 10;
            if (h1 == ex) {
                while (h1 == ex) {
                    hh1 = Math.random();
                    hh1 = ((int) (h1 * 13) + 1);
                    h1 = (int) hh1;
                }
            }
        }
        if (count11 >= 4) {
            double ex = 11;
            if (h1 == ex) {
                while (h1 == ex) {
                    hh1 = Math.random();
                    hh1 = ((int) (h1 * 13) + 1);
                    h1 = (int) hh1;
                }
            }
        }
        if (count12 >= 4) {
            double ex = 12;
            if (h1 == ex) {
                while (h1 == ex) {
                    hh1 = Math.random();
                    hh1 = ((int) (h1 * 13) + 1);
                    h1 = (int) hh1;
                }
            }
        }
        if (count13 >= 4) {
            double ex = 13;
            if (h1 == ex) {
                while (h1 == ex) {
                    hh1 = Math.random();
                    hh1 = ((int) (h1 * 13) + 1);
                    h1 = (int) hh1;
                }
            }
        }
        switch (h1) {
            case 1:
                h11 = "A";
                break;
            case 11:
                h11 = "J";
                break;
            case 12:
                h11 = "Q";
                break;
            case 13:
                h11 = "K";
                break;
            default:
                h11 = Integer.toString(h1);
                break;
        }
        switch (h1) {
            case 11:
                h1 = 10;
                break;
            case 12:
                h1 = 10;
                break;
            case 13:
                h1 = 10;
                break;
            default:
                h1 = h1;
                break;
        }
        System.out.println("\nYour Cards Are: " + a11 + ", " + a22 + ", " + b11 + ", " + c11 + ", " + d11 + ", " + e11 + ", " + f11 + ", " + g11 + ", & " + h11);
        if (a1 == 1 || a1 == 11) {
            System.out.println("\nIs Your First Card The Same Or Different? (1/11):");
            input9 = user.next();
            while (!(input9.equals("1"))) {
                if (input9.equals("11")) {
                    break;
                }
                System.out.println("\nPlease Type \"1\" Or \"11\": ");
                input9 = user.next();
            }
            if (input9.equals("1")) {
                a1 = 1;
            } else if (input9.equals("11")) {
                a1 = 11;
            }
        }
        if (a2 == 1 || a2 == 11) {
            System.out.println("\nIs Your Second Card The Same Or Different? (1/11):");
            input9 = user.next();
            while (!(input9.equals("1"))) {
                if (input9.equals("11")) {
                    break;
                }
                System.out.println("\nPlease Type \"1\" Or \"11\": ");
                input9 = user.next();
            }
            if (input9.equals("1")) {
                a2 = 1;
            } else if (input9.equals("11")) {
                a2 = 11;
            }
        }
        if (b1 == 1) {
            System.out.println("\nIs Your Third Card The Same Or Different? (1/11):");
            input9 = user.next();
            while (!(input9.equals("1"))) {
                if (input9.equals("11")) {
                    break;
                }
                System.out.println("\nPlease Type \"1\" Or \"11\": ");
                input9 = user.next();
            }
            if (input9.equals("1")) {
                b1 = 1;
            } else if (input9.equals("11")) {
                b1 = 11;
            }
        }
        if (c1 == 1) {
            System.out.println("\nIs Your Fourth Card The Same Or Different? (1/11):");
            input9 = user.next();
            while (!(input9.equals("1"))) {
                if (input9.equals("11")) {
                    break;
                }
                System.out.println("\nPlease Type \"1\" Or \"11\": ");
                input9 = user.next();
            }
            if (input9.equals("1")) {
                c1 = 1;
            } else if (input9.equals("11")) {
                c1 = 11;
            }
        }
        if (d1 == 1) {
            System.out.println("\nIs Your Fifth Card The Same Or Different? (1/11):");
            input9 = user.next();
            while (!(input9.equals("1"))) {
                if (input9.equals("11")) {
                    break;
                }
                System.out.println("\nPlease Type \"1\" Or \"11\": ");
                input9 = user.next();
            }
            if (input9.equals("1")) {
                d1 = 1;
            } else if (input9.equals("11")) {
                d1 = 11;
            }
        }
        if (e1 == 1) {
            System.out.println("\nIs Your Sixth Card The Same Or Different? (1/11):");
            input9 = user.next();
            while (!(input9.equals("1"))) {
                if (input9.equals("11")) {
                    break;
                }
                System.out.println("\nPlease Type \"1\" Or \"11\": ");
                input9 = user.next();
            }
            if (input9.equals("1")) {
                e1 = 1;
            } else if (input9.equals("11")) {
                e1 = 11;
            }
        }
        if (f1 == 1) {
            System.out.println("\nIs Your Seventh Card The Same Or Different? (1/11):");
            input9 = user.next();
            while (!(input9.equals("1"))) {
                if (input9.equals("11")) {
                    break;
                }
                System.out.println("\nPlease Type \"1\" Or \"11\": ");
                input9 = user.next();
            }
            if (input9.equals("1")) {
                f1 = 1;
            } else if (input9.equals("11")) {
                f1 = 11;
            }
        }
        if (g1 == 1) {
            System.out.println("\nIs Your Eigth Card The Same Or Different? (1/11):");
            input9 = user.next();
            while (!(input9.equals("1"))) {
                if (input9.equals("11")) {
                    break;
                }
                System.out.println("\nPlease Type \"1\" Or \"11\": ");
                input9 = user.next();
            }
            if (input9.equals("1")) {
                g1 = 1;
            } else if (input9.equals("11")) {
                g1 = 11;
            }
        }
        if (h1 == 1) {
            System.out.println("\nIs Your New Ace 1 Or 11?:");
            input9 = user.next();
            while (!(input9.equals("1"))) {
                if (input9.equals("11")) {
                    break;
                }
                System.out.println("\nPlease Type \"1\" Or \"11\": ");
                input9 = user.next();
            }
            if (input9.equals("1")) {
                h1 = 1;
            } else if (input9.equals("11")) {
                h1 = 11;
            }
        }
        player = a1 + a2 + b1 + c1 + d1 + e1 + f1 + g1 + h1;
        System.out.println("They Add Up To: " + noDec.format(player));
        if (player > 21) {
            System.out.println("You Lose! You Went Over 21!");
            System.exit(0);
        }
        System.out.println("The Dealer Is Showing: " + a33);
        System.out.println("\nWould You Like Another Card?:");
        input9 = user.next();
        while (!input9.equalsIgnoreCase(n)) {
            if (input9.equalsIgnoreCase(no)) {
                break;
            } else if (input9.equalsIgnoreCase(y)) {
                break;
            } else if (input9.equalsIgnoreCase(yes)) {
                break;
            } else {
                System.out.println("\nPlease Type yes/no Or y/n");
                input9 = user.next();
            }
        }
    }
}