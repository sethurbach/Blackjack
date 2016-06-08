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
public class Welcome {
    public static void Welcome() {
        System.out.println("Welcome To Blackjack!");
        System.out.println("\nDo You Know How To Play?");
        input1 = user.next();
        while (!input1.equalsIgnoreCase(n)) {
            if (input1.equalsIgnoreCase(no)) {
                break;
            } else if (input1.equalsIgnoreCase(y)) {
                break;
            } else if (input1.equalsIgnoreCase(yes)) {
                break;
            } else {
                System.out.println("\nPlease Type yes/no Or y/n");
                input1 = user.next();
            }
        }
        if (input1.equalsIgnoreCase(n) || input1.equalsIgnoreCase(no)) {
            System.out.println("\nHere Are The Rules:");
            System.out.println("1. The Goal Of The Game Is To Have A Bigger Sum Of Cards Than The Dealer, Without Going Over 21.");
            System.out.println("2. You And The Dealer Both Start With Two Cards.");
            System.out.println("3. At All Times, You Can See One And Only One Of The Dealers Cards.");
            System.out.println("4. You Can Draw Cards To Try To Beat The Dealer And/Or Get Closer To 21.");
            System.out.println("5. Kings, Queens, And Jacks Are All 10.");
            System.out.println("6. Aces Can Be Either 1 Or 11 And You Can Change What You Want Later To Fit Your Needs");
            System.out.println("7. When You're Done Drawing, The Dealer Will Draw Until He's Done (Hits 17 Or Over).");
            System.out.println("\nType Anything To Continue:");
            input1 = user.next();
        }
    }
}