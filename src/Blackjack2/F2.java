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
public class F2 {
    public static void F2() {
        if (f2 == 1) {
            count1++;
        }
        if (f2 == 2) {
            count2++;
        }
        if (f2 == 3) {
            count3++;
        }
        if (f2 == 4) {
            count4++;
        }
        if (f2 == 5) {
            count5++;
        }
        if (f2 == 6) {
            count6++;
        }
        if (f2 == 7) {
            count7++;
        }
        if (f2 == 8) {
            count8++;
        }
        if (f2 == 9) {
            count9++;
        }
        if (f2 == 10) {
            count10++;
        }
        if (f2 == 11) {
            count11++;
        }
        if (f2 == 12) {
            count12++;
        }
        if (f2 == 13) {
            count13++;
        }
        if (count1 >= 4) {
            double ex = 1;
            if (f2 == ex) {
                while (f2 == ex) {
                    ff2 = Math.random();
                    ff2 = ((int) (f2 * 13) + 1);
                    f2 = (int) ff2;
                }
            }
        }
        if (count2 >= 4) {
            double ex = 2;
            if (f2 == ex) {
                while (f2 == ex) {
                    ff2 = Math.random();
                    ff2 = ((int) (f2 * 13) + 1);
                    f2 = (int) ff2;
                }
            }
        }
        if (count3 >= 4) {
            double ex = 3;
            if (f2 == ex) {
                while (f2 == ex) {
                    ff2 = Math.random();
                    ff2 = ((int) (f2 * 13) + 1);
                    f2 = (int) ff2;
                }
            }
        }
        if (count4 >= 4) {
            double ex = 4;
            if (f2 == ex) {
                while (f2 == ex) {
                    ff2 = Math.random();
                    ff2 = ((int) (f2 * 13) + 1);
                    f2 = (int) ff2;
                }
            }
        }
        if (count5 >= 4) {
            double ex = 5;
            if (f2 == ex) {
                while (f2 == ex) {
                    ff2 = Math.random();
                    ff2 = ((int) (f2 * 13) + 1);
                    f2 = (int) ff2;
                }
            }
        }
        if (count6 >= 4) {
            double ex = 6;
            if (f2 == ex) {
                while (f2 == ex) {
                    ff2 = Math.random();
                    ff2 = ((int) (f2 * 13) + 1);
                    f2 = (int) ff2;
                }
            }
        }
        if (count7 >= 4) {
            double ex = 7;
            if (f2 == ex) {
                while (f2 == ex) {
                    ff2 = Math.random();
                    ff2 = ((int) (f2 * 13) + 1);
                    f2 = (int) ff2;
                }
            }
        }
        if (count8 >= 4) {
            double ex = 8;
            if (f2 == ex) {
                while (f2 == ex) {
                    ff2 = Math.random();
                    ff2 = ((int) (f2 * 13) + 1);
                    f2 = (int) ff2;
                }
            }
        }
        if (count9 >= 4) {
            double ex = 9;
            if (f2 == ex) {
                while (f2 == ex) {
                    ff2 = Math.random();
                    ff2 = ((int) (f2 * 13) + 1);
                    f2 = (int) ff2;
                }
            }
        }
        if (count10 >= 4) {
            double ex = 10;
            if (f2 == ex) {
                while (f2 == ex) {
                    ff2 = Math.random();
                    ff2 = ((int) (f2 * 13) + 1);
                    f2 = (int) ff2;
                }
            }
        }
        if (count11 >= 4) {
            double ex = 11;
            if (f2 == ex) {
                while (f2 == ex) {
                    ff2 = Math.random();
                    ff2 = ((int) (f2 * 13) + 1);
                    f2 = (int) ff2;
                }
            }
        }
        if (count12 >= 4) {
            double ex = 12;
            if (f2 == ex) {
                while (f2 == ex) {
                    ff2 = Math.random();
                    ff2 = ((int) (f2 * 13) + 1);
                    f2 = (int) ff2;
                }
            }
        }
        if (count13 >= 4) {
            double ex = 13;
            if (f2 == ex) {
                while (f2 == ex) {
                    ff2 = Math.random();
                    ff2 = ((int) (f2 * 13) + 1);
                    f2 = (int) ff2;
                }
            }
        }
        switch (f2) {
            case 1:
                f22 = "A";
                break;
            case 11:
                f22 = "J";
                break;
            case 12:
                f22 = "Q";
                break;
            case 13:
                f22 = "K";
                break;
            default:
                f22 = Integer.toString(f2);
                break;
        }
        switch (f2) {
            case 11:
                f2 = 10;
                break;
            case 12:
                f2 = 10;
                break;
            case 13:
                f2 = 10;
                break;
            default:
                f2 = f2;
                break;
        }
        dealer = a3 + a4 + b2 + c2 + d2 + e2 + f2;
        if (dealer < 17) {
            Blackjack2.G2.G2();
        } else if (dealer >= 17) {
            if (player > 21) {
                System.out.println("\nYou Loose! You Went Over 21!");
            } else if (dealer > 21) {
                System.out.println("\nThe Dealer Drew 6 Cards\nYou Win! The Dealer Went Over 21!\nHis Hand Is: " + a33 + ", " + a44 + ", " + b22 + ", " + c22 + ", " + d22 + ", " + e22 + ", & " + f22);
                System.out.println("They Add Up To: " + noDec.format(dealer));
            } else if (player > dealer) {
                System.out.println("\nThe Dealer Drew 6 Cards\nYou Win!You Beat The Dealer!\nHis Hand Is: " + a33 + ", " + a44 + ", " + b22 + ", " + c22 + ", " + d22 + ", " + e22 + ", & " + f22);
                System.out.println("They Add Up To: " + noDec.format(dealer));
            } else if (dealer > player) {
                System.out.println("\nThe Dealer Drew 6 Cards\nYou Lose! The Dealer Beat You!\nHis Hand Is: " + a33 + ", " + a44 + ", " + b22 + ", " + c22 + ", " + d22 + ", " + e22 + ", & " + f22);
                System.out.println("They Add Up To: " + noDec.format(dealer));
            } else if (dealer == player) {
                System.out.println("\nThe Dealer Drew 6 Cards\nHis Hand Is: " + a33 + ", " + a44 + ", " + b22 + ", " + c22 + ", " + d22 + ", " + e22 + ", & " + f22);
                System.out.println("It's A Draw! You Both Have: " + noDec.format(dealer));
            }
        }
    }
}
