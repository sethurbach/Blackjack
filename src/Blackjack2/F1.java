/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Blackjack2;
import static Blackjack2.Data.*;
/**
 *
 * @author seth_urbac910
 */
public class F1 {
    public static void F1(){
         if (f1 == 1) {
            count1++;
        }
        if (f1 == 2) {
            count2++;
        }
        if (f1 == 3) {
            count3++;
        }
        if (f1 == 4) {
            count4++;
        }
        if (f1 == 5) {
            count5++;
        }
        if (f1 == 6) {
            count6++;
        }
        if (f1 == 7) {
            count7++;
        }
        if (f1 == 8) {
            count8++;
        }
        if (f1 == 9) {
            count9++;
        }
        if (f1 == 10) {
            count10++;
        }
        if (f1 == 11) {
            count11++;
        }
        if (f1 == 12) {
            count12++;
        }
        if (f1 == 13) {
            count13++;
        }
        if (count1 >= 4) {
            double ex = 1;
            if (f1 == ex) {
                while (f1 == ex) {
                    gg1 = Math.random();
                    gg1 = ((int) (f1 * 13) + 1);
                    f1 = (int) gg1;
                }
            }
        }
        if (count2 >= 4) {
            double ex = 2;
            if (f1 == ex) {
                while (f1 == ex) {
                    gg1 = Math.random();
                    gg1 = ((int) (f1 * 13) + 1);
                    f1 = (int) gg1;
                }
            }
        }
        if (count3 >= 4) {
            double ex = 3;
            if (f1 == ex) {
                while (f1 == ex) {
                    gg1 = Math.random();
                    gg1 = ((int) (f1 * 13) + 1);
                    f1 = (int) gg1;
                }
            }
        }
        if (count4 >= 4) {
            double ex = 4;
            if (f1 == ex) {
                while (f1 == ex) {
                    gg1 = Math.random();
                    gg1 = ((int) (f1 * 13) + 1);
                    f1 = (int) gg1;
                }
            }
        }
        if (count5 >= 4) {
            double ex = 5;
            if (f1 == ex) {
                while (f1 == ex) {
                    gg1 = Math.random();
                    gg1 = ((int) (f1 * 13) + 1);
                    f1 = (int) gg1;
                }
            }
        }
        if (count6 >= 4) {
            double ex = 6;
            if (f1 == ex) {
                while (f1 == ex) {
                    gg1 = Math.random();
                    gg1 = ((int) (f1 * 13) + 1);
                    f1 = (int) gg1;
                }
            }
        }
        if (count7 >= 4) {
            double ex = 7;
            if (f1 == ex) {
                while (f1 == ex) {
                    gg1 = Math.random();
                    gg1 = ((int) (f1 * 13) + 1);
                    f1 = (int) gg1;
                }
            }
        }
        if (count8 >= 4) {
            double ex = 8;
            if (f1 == ex) {
                while (f1 == ex) {
                    gg1 = Math.random();
                    gg1 = ((int) (f1 * 13) + 1);
                    f1 = (int) gg1;
                }
            }
        }
        if (count9 >= 4) {
            double ex = 9;
            if (f1 == ex) {
                while (f1 == ex) {
                    gg1 = Math.random();
                    gg1 = ((int) (f1 * 13) + 1);
                    f1 = (int) gg1;
                }
            }
        }
        if (count10 >= 4) {
            double ex = 10;
            if (f1 == ex) {
                while (f1 == ex) {
                    gg1 = Math.random();
                    gg1 = ((int) (f1 * 13) + 1);
                    f1 = (int) gg1;
                }
            }
        }
        if (count11 >= 4) {
            double ex = 11;
            if (f1 == ex) {
                while (f1 == ex) {
                    gg1 = Math.random();
                    gg1 = ((int) (f1 * 13) + 1);
                    f1 = (int) gg1;
                }
            }
        }
        if (count12 >= 4) {
            double ex = 12;
            if (f1 == ex) {
                while (f1 == ex) {
                    gg1 = Math.random();
                    gg1 = ((int) (f1 * 13) + 1);
                    f1 = (int) gg1;
                }
            }
        }
        if (count13 >= 4) {
            double ex = 13;
            if (f1 == ex) {
                while (f1 == ex) {
                    gg1 = Math.random();
                    gg1 = ((int) (f1 * 13) + 1);
                    f1 = (int) gg1;
                }
            }
        }
        switch (f1) {
            case 1:
                f11 = "A";
                break;
            case 11:
                f11 = "J";
                break;
            case 12:
                f11 = "Q";
                break;
            case 13:
                f11 = "K";
                break;
            default:
                f11 = Integer.toString(f1);
                break;
        }
        switch (f1) {
            case 11:
                f1 = 10;
                break;
            case 12:
                f1 = 10;
                break;
            case 13:
                f1 = 10;
                break;
            default:
                f1 = f1;
                break;
        }
        System.out.println("\nYour Cards Are: " + a11 + ", " + a22 + ", " + b11 + ", " + c11 + ", " + d11 + ", " + e11 + ", & " + f11);
        if (a1 == 1 || a1 == 11) {
            System.out.println("\nIs Your First Card The Same Or Different? (1/11):");
            input7 = user.next();
            while (!(input7.equals("1"))) {
                if (input7.equals("11")) {
                    break;
                }
                System.out.println("\nPlease Type \"1\" Or \"11\": ");
                input7 = user.next();
            }
            if (input7.equals("1")) {
                a1 = 1;
            } else if (input7.equals("11")) {
                a1 = 11;
            }
        }
        if (a2 == 1 || a2 == 11) {
            System.out.println("\nIs Your Second Card The Same Or Different? (1/11):");
            input7 = user.next();
            while (!(input7.equals("1"))) {
                if (input7.equals("11")) {
                    break;
                }
                System.out.println("\nPlease Type \"1\" Or \"11\": ");
                input7 = user.next();
            }
            if (input7.equals("1")) {
                a2 = 1;
            } else if (input7.equals("11")) {
                a2 = 11;
            }
        }
        if (b1 == 1) {
            System.out.println("\nIs Your Third Card The Same Or Different? (1/11):");
            input7 = user.next();
            while (!(input7.equals("1"))) {
                if (input7.equals("11")) {
                    break;
                }
                System.out.println("\nPlease Type \"1\" Or \"11\": ");
                input7 = user.next();
            }
            if (input7.equals("1")) {
                b1 = 1;
            } else if (input7.equals("11")) {
                b1 = 11;
            }
        }
        if (c1 == 1) {
            System.out.println("\nIs Your Fourth Card The Same Or Different? (1/11):");
            input7 = user.next();
            while (!(input7.equals("1"))) {
                if (input7.equals("11")) {
                    break;
                }
                System.out.println("\nPlease Type \"1\" Or \"11\": ");
                input7 = user.next();
            }
            if (input7.equals("1")) {
                c1 = 1;
            } else if (input7.equals("11")) {
                c1 = 11;
            }
        }
        if (d1 == 1) {
            System.out.println("\nIs Your Fifth Card The Same Or Different? (1/11):");
            input7 = user.next();
            while (!(input7.equals("1"))) {
                if (input7.equals("11")) {
                    break;
                }
                System.out.println("\nPlease Type \"1\" Or \"11\": ");
                input7 = user.next();
            }
            if (input7.equals("1")) {
                d1 = 1;
            } else if (input7.equals("11")) {
                d1 = 11;
            }
        }
        if (e1 == 1) {
            System.out.println("\nIs Your Sixth Card The Same Or Different? (1/11):");
            input7 = user.next();
            while (!(input7.equals("1"))) {
                if (input7.equals("11")) {
                    break;
                }
                System.out.println("\nPlease Type \"1\" Or \"11\": ");
                input7 = user.next();
            }
            if (input7.equals("1")) {
                e1 = 1;
            } else if (input7.equals("11")) {
                e1 = 11;
            }
        }
        if (f1 == 1) {
            System.out.println("\nIs Your New Ace 1 Or 11?:");
            input7 = user.next();
            while (!(input7.equals("1"))) {
                if (input7.equals("11")) {
                    break;
                }
                System.out.println("\nPlease Type \"1\" Or \"11\": ");
                input7 = user.next();
            }
            if (input7.equals("1")) {
                f1 = 1;
            } else if (input7.equals("11")) {
                f1 = 11;
            }
        }
        player = a1 + a2 + b1 + c1 + d1 + e1 + f1;
        System.out.println("They Add Up To: " + noDec.format(player));
        if (player > 21) {
            System.out.println("You Lose! You Went Over 21!");
            System.exit(0);
        }
        System.out.println("The Dealer Is Showing: " + a33);
        System.out.println("\nWould You Like Another Card?:");
        input7 = user.next();
        while (!input7.equalsIgnoreCase(n)) {
            if (input7.equalsIgnoreCase(no)) {
                break;
            } else if (input7.equalsIgnoreCase(y)) {
                break;
            } else if (input7.equalsIgnoreCase(yes)) {
                break;
            } else {
                System.out.println("\nPlease Type yes/no Or y/n");
                input7 = user.next();
            }
        }
    }
}
