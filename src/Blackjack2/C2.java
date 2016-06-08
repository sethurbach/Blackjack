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
public class C2 {
    public static void C2() {
        if (c2 == 1) {
            count1++;
        }
        if (c2 == 2) {
            count2++;
        }
        if (c2 == 3) {
            count3++;
        }
        if (c2 == 4) {
            count4++;
        }
        if (c2 == 5) {
            count5++;
        }
        if (c2 == 6) {
            count6++;
        }
        if (c2 == 7) {
            count7++;
        }
        if (c2 == 8) {
            count8++;
        }
        if (c2 == 9) {
            count9++;
        }
        if (c2 == 10) {
            count10++;
        }
        if (c2 == 11) {
            count11++;
        }
        if (c2 == 12) {
            count12++;
        }
        if (c2 == 13) {
            count13++;
        }
        if (count1 >= 4) {
            double ex = 1;
            if (c2 == ex) {
                while (c2 == ex) {
                    cc2 = Math.random();
                    cc2 = ((int) (c2 * 13) + 1);
                    c2 = (int) cc2;
                }
            }
        }
        if (count2 >= 4) {
            double ex = 2;
            if (c2 == ex) {
                while (c2 == ex) {
                    cc2 = Math.random();
                    cc2 = ((int) (c2 * 13) + 1);
                    c2 = (int) cc2;
                }
            }
        }
        if (count3 >= 4) {
            double ex = 3;
            if (c2 == ex) {
                while (c2 == ex) {
                    cc2 = Math.random();
                    cc2 = ((int) (c2 * 13) + 1);
                    c2 = (int) cc2;
                }
            }
        }
        if (count4 >= 4) {
            double ex = 4;
            if (c2 == ex) {
                while (c2 == ex) {
                    cc2 = Math.random();
                    cc2 = ((int) (c2 * 13) + 1);
                    c2 = (int) cc2;
                }
            }
        }
        if (count5 >= 4) {
            double ex = 5;
            if (c2 == ex) {
                while (c2 == ex) {
                    cc2 = Math.random();
                    cc2 = ((int) (c2 * 13) + 1);
                    c2 = (int) cc2;
                }
            }
        }
        if (count6 >= 4) {
            double ex = 6;
            if (c2 == ex) {
                while (c2 == ex) {
                    cc2 = Math.random();
                    cc2 = ((int) (c2 * 13) + 1);
                    c2 = (int) cc2;
                }
            }
        }
        if (count7 >= 4) {
            double ex = 7;
            if (c2 == ex) {
                while (c2 == ex) {
                    cc2 = Math.random();
                    cc2 = ((int) (c2 * 13) + 1);
                    c2 = (int) cc2;
                }
            }
        }
        if (count8 >= 4) {
            double ex = 8;
            if (c2 == ex) {
                while (c2 == ex) {
                    cc2 = Math.random();
                    cc2 = ((int) (c2 * 13) + 1);
                    c2 = (int) cc2;
                }
            }
        }
        if (count9 >= 4) {
            double ex = 9;
            if (c2 == ex) {
                while (c2 == ex) {
                    cc2 = Math.random();
                    cc2 = ((int) (c2 * 13) + 1);
                    c2 = (int) cc2;
                }
            }
        }
        if (count10 >= 4) {
            double ex = 10;
            if (c2 == ex) {
                while (c2 == ex) {
                    cc2 = Math.random();
                    cc2 = ((int) (c2 * 13) + 1);
                    c2 = (int) cc2;
                }
            }
        }
        if (count11 >= 4) {
            double ex = 11;
            if (c2 == ex) {
                while (c2 == ex) {
                    cc2 = Math.random();
                    cc2 = ((int) (c2 * 13) + 1);
                    c2 = (int) cc2;
                }
            }
        }
        if (count12 >= 4) {
            double ex = 12;
            if (c2 == ex) {
                while (c2 == ex) {
                    cc2 = Math.random();
                    cc2 = ((int) (c2 * 13) + 1);
                    c2 = (int) cc2;
                }
            }
        }
        if (count13 >= 4) {
            double ex = 13;
            if (c2 == ex) {
                while (c2 == ex) {
                    cc2 = Math.random();
                    cc2 = ((int) (c2 * 13) + 1);
                    c2 = (int) cc2;
                }
            }
        }
        switch (c2) {
            case 1:
                c22 = "A";
                break;
            case 11:
                c22 = "J";
                break;
            case 12:
                c22 = "Q";
                break;
            case 13:
                c22 = "K";
                break;
            default:
                c22 = Integer.toString(c2);
                break;
        }
        switch (c2) {
            case 11:
                c2 = 10;
                break;
            case 12:
                c2 = 10;
                break;
            case 13:
                c2 = 10;
                break;
            default:
                c2 = c2;
                break;
        }
        dealer = a3 + a4 + b2 + c2;
        if (dealer < 17) {
            Blackjack2.D2.D2();
        } else if (dealer >= 17) {
            if (player > 21) {
                System.out.println("\nYou Loose! You Went Over 21!");
            } else if (dealer > 21) {
                System.out.println("\nThe Dealer Drew 2 Cards\nYou Win! The Dealer Went Over 21!\nHis Hand Is: " + a33 + ", " + a44 + ", " + b22 + ", & " + c22);
                System.out.println("They Add Up To: " + noDec.format(dealer));
            } else if (player > dealer) {
                System.out.println("\nThe Dealer Drew 2 Cards\nYou Win!You Beat The Dealer!\nHis Hand Is: " + a33 + ", " + a44 + ", " + b22 + ", & " + c22);
                System.out.println("They Add Up To: " + noDec.format(dealer));
            } else if (dealer > player) {
                System.out.println("\nThe Dealer Drew 2 Cards\nYou Lose! The Dealer Beat You!\nHis Hand Is: " + a33 + ", " + a44 + ", " + b22 + ", & " + c22);
                System.out.println("They Add Up To: " + noDec.format(dealer));
            } else if (dealer == player) {
                System.out.println("\nThe Dealer Drew 2 Cards\nHis Hand Is: " + a33 + ", " + a44 + ", " + b22 + ", & " + c22);
                System.out.println("It's A Draw! You Both Have: " + noDec.format(dealer));
            }
        }
    }
}