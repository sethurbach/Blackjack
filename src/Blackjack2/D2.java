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
public class D2 {
    public static void D2() {
        if (d2 == 1) {
            count1++;
        }
        if (d2 == 2) {
            count2++;
        }
        if (d2 == 3) {
            count3++;
        }
        if (d2 == 4) {
            count4++;
        }
        if (d2 == 5) {
            count5++;
        }
        if (d2 == 6) {
            count6++;
        }
        if (d2 == 7) {
            count7++;
        }
        if (d2 == 8) {
            count8++;
        }
        if (d2 == 9) {
            count9++;
        }
        if (d2 == 10) {
            count10++;
        }
        if (d2 == 11) {
            count11++;
        }
        if (d2 == 12) {
            count12++;
        }
        if (d2 == 13) {
            count13++;
        }
        if (count1 >= 4) {
            double ex = 1;
            if (d2 == ex) {
                while (d2 == ex) {
                    dd2 = Math.random();
                    dd2 = ((int) (d2 * 13) + 1);
                    d2 = (int) dd2;
                }
            }
        }
        if (count2 >= 4) {
            double ex = 2;
            if (d2 == ex) {
                while (d2 == ex) {
                    dd2 = Math.random();
                    dd2 = ((int) (d2 * 13) + 1);
                    d2 = (int) dd2;
                }
            }
        }
        if (count3 >= 4) {
            double ex = 3;
            if (d2 == ex) {
                while (d2 == ex) {
                    dd2 = Math.random();
                    dd2 = ((int) (d2 * 13) + 1);
                    d2 = (int) dd2;
                }
            }
        }
        if (count4 >= 4) {
            double ex = 4;
            if (d2 == ex) {
                while (d2 == ex) {
                    dd2 = Math.random();
                    dd2 = ((int) (d2 * 13) + 1);
                    d2 = (int) dd2;
                }
            }
        }
        if (count5 >= 4) {
            double ex = 5;
            if (d2 == ex) {
                while (d2 == ex) {
                    dd2 = Math.random();
                    dd2 = ((int) (d2 * 13) + 1);
                    d2 = (int) dd2;
                }
            }
        }
        if (count6 >= 4) {
            double ex = 6;
            if (d2 == ex) {
                while (d2 == ex) {
                    dd2 = Math.random();
                    dd2 = ((int) (d2 * 13) + 1);
                    d2 = (int) dd2;
                }
            }
        }
        if (count7 >= 4) {
            double ex = 7;
            if (d2 == ex) {
                while (d2 == ex) {
                    dd2 = Math.random();
                    dd2 = ((int) (d2 * 13) + 1);
                    d2 = (int) dd2;
                }
            }
        }
        if (count8 >= 4) {
            double ex = 8;
            if (d2 == ex) {
                while (d2 == ex) {
                    dd2 = Math.random();
                    dd2 = ((int) (d2 * 13) + 1);
                    d2 = (int) dd2;
                }
            }
        }
        if (count9 >= 4) {
            double ex = 9;
            if (d2 == ex) {
                while (d2 == ex) {
                    dd2 = Math.random();
                    dd2 = ((int) (d2 * 13) + 1);
                    d2 = (int) dd2;
                }
            }
        }
        if (count10 >= 4) {
            double ex = 10;
            if (d2 == ex) {
                while (d2 == ex) {
                    dd2 = Math.random();
                    dd2 = ((int) (d2 * 13) + 1);
                    d2 = (int) dd2;
                }
            }
        }
        if (count11 >= 4) {
            double ex = 11;
            if (d2 == ex) {
                while (d2 == ex) {
                    dd2 = Math.random();
                    dd2 = ((int) (d2 * 13) + 1);
                    d2 = (int) dd2;
                }
            }
        }
        if (count12 >= 4) {
            double ex = 12;
            if (d2 == ex) {
                while (d2 == ex) {
                    dd2 = Math.random();
                    dd2 = ((int) (d2 * 13) + 1);
                    d2 = (int) dd2;
                }
            }
        }
        if (count13 >= 4) {
            double ex = 13;
            if (d2 == ex) {
                while (d2 == ex) {
                    dd2 = Math.random();
                    dd2 = ((int) (d2 * 13) + 1);
                    d2 = (int) dd2;
                }
            }
        }
        switch (d2) {
            case 1:
                d22 = "A";
                break;
            case 11:
                d22 = "J";
                break;
            case 12:
                d22 = "Q";
                break;
            case 13:
                d22 = "K";
                break;
            default:
                d22 = Integer.toString(d2);
                break;
        }
        switch (d2) {
            case 11:
                d2 = 10;
                break;
            case 12:
                d2 = 10;
                break;
            case 13:
                d2 = 10;
                break;
            default:
                d2 = d2;
                break;
        }
        dealer = a3 + a4 + b2 + c2 + d2;
        if (dealer < 17) {
            Blackjack2.E2.E2();
        } else if (dealer >= 17) {
            if (player > 21) {
                System.out.println("\nYou Loose! You Went Over 21!");
            } else if (dealer > 21) {
                System.out.println("\nThe Dealer Drew 3 Cards\nYou Win! The Dealer Went Over 21!\nHis Hand Is: " + a33 + ", " + a44 + ", " + b22 + ", " + c22 + ", & " + d22);
                System.out.println("They Add Up To: " + noDec.format(dealer));
            } else if (player > dealer) {
                System.out.println("\nThe Dealer Drew 3 Cards\nYou Win!You Beat The Dealer!\nHis Hand Is: " + a33 + ", " + a44 + ", " + b22 + ", " + c22 + ", & " + d22);
                System.out.println("They Add Up To: " + noDec.format(dealer));
            } else if (dealer > player) {
                System.out.println("\nThe Dealer Drew 3 Cards\nYou Lose! The Dealer Beat You!\nHis Hand Is: " + a33 + ", " + a44 + ", " + b22 + ", " + c22 + ", & " + d22);
                System.out.println("They Add Up To: " + noDec.format(dealer));
            } else if (dealer == player) {
                System.out.println("\nThe Dealer Drew 3 Cards\nHis Hand Is: " + a33 + ", " + a44 + ", " + b22 + ", " + c22 + ", & " + d22);
                System.out.println("It's A Draw! You Both Have: " + noDec.format(dealer));
            }
        }
    }
}
