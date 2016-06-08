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
public class Blackjack {

    public static void main(String[] args) {
        Blackjack2.Welcome.Welcome();
        Blackjack2.Cards.Cards();
        Blackjack2.CardCalc.CardCalc();
        Blackjack2.A1234.A1234();
        if (input2.equalsIgnoreCase(y) || input2.equalsIgnoreCase(yes)) {
            Blackjack2.B1.B1();
            if (input3.equalsIgnoreCase(y) || input3.equalsIgnoreCase(yes)) {
                Blackjack2.C1.C1();
                if (input4.equalsIgnoreCase(y) || input4.equalsIgnoreCase(yes)) {
                    Blackjack2.D1.D1();
                    if (input5.equalsIgnoreCase(y) || input5.equalsIgnoreCase(yes)) {
                        Blackjack2.E1.E1();
                        if (input6.equalsIgnoreCase(y) || input6.equalsIgnoreCase(yes)) {
                            Blackjack2.F1.F1();
                            if (input7.equalsIgnoreCase(y) || input7.equalsIgnoreCase(yes)) {
                                Blackjack2.G1.G1();
                                if (input8.equalsIgnoreCase(y) || input8.equalsIgnoreCase(yes)) {
                                    Blackjack2.H1.H1();
                                    if (input9.equalsIgnoreCase(y) || input9.equalsIgnoreCase(yes)) {
                                        Blackjack2.I1.I1();
                                        if (input10.equalsIgnoreCase(y) || input10.equalsIgnoreCase(yes)) {
                                            Blackjack2.J1.J1();
                                            Blackjack2.A34.A34();
                                        }
                                    } else if (input9.equalsIgnoreCase(n) || input9.equalsIgnoreCase(no)) {
                                        Blackjack2.A34.A34();
                                    }
                                } else if (input8.equalsIgnoreCase(n) || input8.equalsIgnoreCase(no)) {
                                    Blackjack2.A34.A34();
                                }
                            } else if (input7.equalsIgnoreCase(n) || input7.equalsIgnoreCase(no)) {
                                Blackjack2.A34.A34();
                            }
                        } else if (input6.equalsIgnoreCase(n) || input6.equalsIgnoreCase(no)) {
                            Blackjack2.A34.A34();
                        }
                    } else if (input5.equalsIgnoreCase(n) || input5.equalsIgnoreCase(no)) {
                        Blackjack2.A34.A34();
                    }
                } else if (input4.equalsIgnoreCase(n) || input4.equalsIgnoreCase(no)) {
                    Blackjack2.A34.A34();
                }
            } else if (input3.equalsIgnoreCase(n) || input3.equalsIgnoreCase(no)) {
                Blackjack2.A34.A34();
            }
        } else if (input2.equalsIgnoreCase(n) || input2.equalsIgnoreCase(no)) {
            Blackjack2.A34.A34();
        }

    }
}
