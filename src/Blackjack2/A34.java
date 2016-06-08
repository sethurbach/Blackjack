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
public class A34 {

    public static void A34() {
        dealer = a3 + a4;
        if (dealer < 17) {
            Blackjack2.B2.B2();
        } else if (dealer >= 17) {
            if (player > 21) {
                System.out.println("\nYou Loose! You Went Over 21!");
            } else if (dealer > 21) {
                System.out.println("\nThe Dealer Drew 1 Card\nYou Win! The Dealer Went Over 21!\nHis Hand Is: " + a33 + ", & " + a44);
                System.out.println("They Add Up To: " + noDec.format(dealer));
            } else if (player > dealer) {
                System.out.println("\nThe Dealer Drew 1 Card\nYou Win!You Beat The Dealer!\nHis Hand Is: " + a33 + ", & " + a44);
                System.out.println("They Add Up To: " + noDec.format(dealer));
            } else if (dealer > player) {
                System.out.println("\nThe Dealer Drew 1 Card\nYou Loose! The Dealer Beat You!\nHis Hand Is: " + a33 + ", & " + a44);
                System.out.println("They Add Up To: " + noDec.format(dealer));
            } else if (dealer == player) {
                System.out.println("\nThe Dealer Drew 1 Card\nHis Hand Is: " + a33 + ", & " + a44);
                System.out.println("It's A Draw! You Both Have: " + noDec.format(dealer));
            }
        }
    }
}
