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
public class E2 {
    public static void E2() {
        if (e2 == 1) {
            count1++;
        }
        if (e2 == 2) {
            count2++;
        }
        if (e2 == 3) {
            count3++;
        }
        if (e2 == 4) {
            count4++;
        }
        if (e2 == 5) {
            count5++;
        }
        if (e2 == 6) {
            count6++;
        }
        if (e2 == 7) {
            count7++;
        }
        if (e2 == 8) {
            count8++;
        }
        if (e2 == 9) {
            count9++;
        }
        if (e2 == 10) {
            count10++;
        }
        if (e2 == 11) {
            count11++;
        }
        if (e2 == 12) {
            count12++;
        }
        if (e2 == 13) {
            count13++;
        }
        if (count1 >= 4) {
            double ex = 1;
            if (e2 == ex) {
                while (e2 == ex) {
                    ee2 = Math.random();
                    ee2 = ((int) (e2 * 13) + 1);
                    e2 = (int) ee2;
                }
            }
        }
        if (count2 >= 4) {
            double ex = 2;
            if (e2 == ex) {
                while (e2 == ex) {
                    ee2 = Math.random();
                    ee2 = ((int) (e2 * 13) + 1);
                    e2 = (int) ee2;
                }
            }
        }
        if (count3 >= 4) {
            double ex = 3;
            if (e2 == ex) {
                while (e2 == ex) {
                    ee2 = Math.random();
                    ee2 = ((int) (e2 * 13) + 1);
                    e2 = (int) ee2;
                }
            }
        }
        if (count4 >= 4) {
            double ex = 4;
            if (e2 == ex) {
                while (e2 == ex) {
                    ee2 = Math.random();
                    ee2 = ((int) (e2 * 13) + 1);
                    e2 = (int) ee2;
                }
            }
        }
        if (count5 >= 4) {
            double ex = 5;
            if (e2 == ex) {
                while (e2 == ex) {
                    ee2 = Math.random();
                    ee2 = ((int) (e2 * 13) + 1);
                    e2 = (int) ee2;
                }
            }
        }
        if (count6 >= 4) {
            double ex = 6;
            if (e2 == ex) {
                while (e2 == ex) {
                    ee2 = Math.random();
                    ee2 = ((int) (e2 * 13) + 1);
                    e2 = (int) ee2;
                }
            }
        }
        if (count7 >= 4) {
            double ex = 7;
            if (e2 == ex) {
                while (e2 == ex) {
                    ee2 = Math.random();
                    ee2 = ((int) (e2 * 13) + 1);
                    e2 = (int) ee2;
                }
            }
        }
        if (count8 >= 4) {
            double ex = 8;
            if (e2 == ex) {
                while (e2 == ex) {
                    ee2 = Math.random();
                    ee2 = ((int) (e2 * 13) + 1);
                    e2 = (int) ee2;
                }
            }
        }
        if (count9 >= 4) {
            double ex = 9;
            if (e2 == ex) {
                while (e2 == ex) {
                    ee2 = Math.random();
                    ee2 = ((int) (e2 * 13) + 1);
                    e2 = (int) ee2;
                }
            }
        }
        if (count10 >= 4) {
            double ex = 10;
            if (e2 == ex) {
                while (e2 == ex) {
                    ee2 = Math.random();
                    ee2 = ((int) (e2 * 13) + 1);
                    e2 = (int) ee2;
                }
            }
        }
        if (count11 >= 4) {
            double ex = 11;
            if (e2 == ex) {
                while (e2 == ex) {
                    ee2 = Math.random();
                    ee2 = ((int) (e2 * 13) + 1);
                    e2 = (int) ee2;
                }
            }
        }
        if (count12 >= 4) {
            double ex = 12;
            if (e2 == ex) {
                while (e2 == ex) {
                    ee2 = Math.random();
                    ee2 = ((int) (e2 * 13) + 1);
                    e2 = (int) ee2;
                }
            }
        }
        if (count13 >= 4) {
            double ex = 13;
            if (e2 == ex) {
                while (e2 == ex) {
                    ee2 = Math.random();
                    ee2 = ((int) (e2 * 13) + 1);
                    e2 = (int) ee2;
                }
            }
        }
        switch (e2) {
            case 1:
                e22 = "A";
                break;
            case 11:
                e22 = "J";
                break;
            case 12:
                e22 = "Q";
                break;
            case 13:
                e22 = "K";
                break;
            default:
                e22 = Integer.toString(e2);
                break;
        }
        switch (e2) {
            case 11:
                e2 = 10;
                break;
            case 12:
                e2 = 10;
                break;
            case 13:
                e2 = 10;
                break;
            default:
                e2 = e2;
                break;
        }
        dealer = a3 + a4 + b2 + c2 + d2 + e2;
        if (dealer < 17) {
            Blackjack2.F2.F2();
        } else if (dealer >= 17) {
            if (player > 21) {
                System.out.println("\nYou Loose! You Went Over 21!");
            } else if (dealer > 21) {
                System.out.println("\nThe Dealer Drew 4 Cards\nYou Win! The Dealer Went Over 21!\nHis Hand Is: " + a33 + ", " + a44 + ", " + b22 + ", " + c22 + ", " + d22 + ", & " + e22);
                System.out.println("They Add Up To: " + noDec.format(dealer));
            } else if (player > dealer) {
                System.out.println("\nThe Dealer Drew 4 Cards\nYou Win!You Beat The Dealer!\nHis Hand Is: " + a33 + ", " + a44 + ", " + b22 + ", " + c22 + ", " + d22 + ", & " + e22);
                System.out.println("They Add Up To: " + noDec.format(dealer));
            } else if (dealer > player) {
                System.out.println("\nThe Dealer Drew 4 Cards\nYou Lose! The Dealer Beat You!\nHis Hand Is: " + a33 + ", " + a44 + ", " + b22 + ", " + c22 + ", " + d22 + ", & " + e22);
                System.out.println("They Add Up To: " + noDec.format(dealer));
            } else if (dealer == player) {
                System.out.println("\nThe Dealer Drew 4 Cards\nHis Hand Is: " + a33 + ", " + a44 + ", " + b22 + ", " + c22 + ", " + d22 + ", & " + e22);
                System.out.println("It's A Draw! You Both Have: " + noDec.format(dealer));
            }
        }
    }
}