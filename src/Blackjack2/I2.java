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
public class I2 {
    public static void I2() {
        if (i2 == 1) {
            count1++;
        }
        if (i2 == 2) {
            count2++;
        }
        if (i2 == 3) {
            count3++;
        }
        if (i2 == 4) {
            count4++;
        }
        if (i2 == 5) {
            count5++;
        }
        if (i2 == 6) {
            count6++;
        }
        if (i2 == 7) {
            count7++;
        }
        if (i2 == 8) {
            count8++;
        }
        if (i2 == 9) {
            count9++;
        }
        if (i2 == 10) {
            count10++;
        }
        if (i2 == 11) {
            count11++;
        }
        if (i2 == 12) {
            count12++;
        }
        if (i2 == 13) {
            count13++;
        }
        if (count1 >= 4) {
            double ex = 1;
            if (i2 == ex) {
                while (i2 == ex) {
                    ii2 = Math.random();
                    ii2 = ((int) (i2 * 13) + 1);
                    i2 = (int) ii2;
                }
            }
        }
        if (count2 >= 4) {
            double ex = 2;
            if (i2 == ex) {
                while (i2 == ex) {
                    ii2 = Math.random();
                    ii2 = ((int) (i2 * 13) + 1);
                    i2 = (int) ii2;
                }
            }
        }
        if (count3 >= 4) {
            double ex = 3;
            if (i2 == ex) {
                while (i2 == ex) {
                    ii2 = Math.random();
                    ii2 = ((int) (i2 * 13) + 1);
                    i2 = (int) ii2;
                }
            }
        }
        if (count4 >= 4) {
            double ex = 4;
            if (i2 == ex) {
                while (i2 == ex) {
                    ii2 = Math.random();
                    ii2 = ((int) (i2 * 13) + 1);
                    i2 = (int) ii2;
                }
            }
        }
        if (count5 >= 4) {
            double ex = 5;
            if (i2 == ex) {
                while (i2 == ex) {
                    ii2 = Math.random();
                    ii2 = ((int) (i2 * 13) + 1);
                    i2 = (int) ii2;
                }
            }
        }
        if (count6 >= 4) {
            double ex = 6;
            if (i2 == ex) {
                while (i2 == ex) {
                    ii2 = Math.random();
                    ii2 = ((int) (i2 * 13) + 1);
                    i2 = (int) ii2;
                }
            }
        }
        if (count7 >= 4) {
            double ex = 7;
            if (i2 == ex) {
                while (i2 == ex) {
                    ii2 = Math.random();
                    ii2 = ((int) (i2 * 13) + 1);
                    i2 = (int) ii2;
                }
            }
        }
        if (count8 >= 4) {
            double ex = 8;
            if (i2 == ex) {
                while (i2 == ex) {
                    ii2 = Math.random();
                    ii2 = ((int) (i2 * 13) + 1);
                    i2 = (int) ii2;
                }
            }
        }
        if (count9 >= 4) {
            double ex = 9;
            if (i2 == ex) {
                while (i2 == ex) {
                    ii2 = Math.random();
                    ii2 = ((int) (i2 * 13) + 1);
                    i2 = (int) ii2;
                }
            }
        }
        if (count10 >= 4) {
            double ex = 10;
            if (i2 == ex) {
                while (i2 == ex) {
                    ii2 = Math.random();
                    ii2 = ((int) (i2 * 13) + 1);
                    i2 = (int) ii2;
                }
            }
        }
        if (count11 >= 4) {
            double ex = 11;
            if (i2 == ex) {
                while (i2 == ex) {
                    ii2 = Math.random();
                    ii2 = ((int) (i2 * 13) + 1);
                    i2 = (int) ii2;
                }
            }
        }
        if (count12 >= 4) {
            double ex = 12;
            if (i2 == ex) {
                while (i2 == ex) {
                    ii2 = Math.random();
                    ii2 = ((int) (i2 * 13) + 1);
                    i2 = (int) ii2;
                }
            }
        }
        if (count13 >= 4) {
            double ex = 13;
            if (i2 == ex) {
                while (i2 == ex) {
                    ii2 = Math.random();
                    ii2 = ((int) (i2 * 13) + 1);
                    i2 = (int) ii2;
                }
            }
        }
        switch (i2) {
            case 1:
                i22 = "A";
                break;
            case 11:
                i22 = "J";
                break;
            case 12:
                i22 = "Q";
                break;
            case 13:
                i22 = "K";
                break;
            default:
                i22 = Integer.toString(i2);
                break;
        }
        switch (i2) {
            case 11:
                i2 = 10;
                break;
            case 12:
                i2 = 10;
                break;
            case 13:
                i2 = 10;
                break;
            default:
                i2 = i2;
                break;
        }
        dealer = a3 + a4 + b2 + c2 + d2 + e2 + f2 + g2 + h2 + i2;
        if (dealer < 17) {
            Blackjack2.J2.J2();
        } else if (dealer >= 17) {
            if (player > 21) {
                System.out.println("\nYou Loose! You Went Over 21!");
            } else if (dealer > 21) {
                System.out.println("\nThe Dealer Drew 8 Cards\nYou Win! The Dealer Went Over 21!\nHis Hand Is: " + a33 + ", " + a44 + ", " + b22 + ", " + c22 + ", " + d22 + ", " + e22 + ", " + f22 + ", " + g22 + ", " + h22 + ", & " + i22);
                System.out.println("They Add Up To: " + noDec.format(dealer));
            } else if (player > dealer) {
                System.out.println("\nThe Dealer Drew 8 Cards\nYou Win!You Beat The Dealer!\nHis Hand Is: " + a33 + ", " + a44 + ", " + b22 + ", " + c22 + ", " + d22 + ", " + e22 + ", " + f22 + ", " + g22 + ", " + h22 + ", & " + i22);
                System.out.println("They Add Up To: " + noDec.format(dealer));
            } else if (dealer > player) {
                System.out.println("\nThe Dealer Drew 8 Cards\nYou Lose! The Dealer Beat You!\nHis Hand Is: " + a33 + ", " + a44 + ", " + b22 + ", " + c22 + ", " + d22 + ", " + e22 + ", " + f22 + ", " + g22 + ", " + h22 + ", & " + i22);
                System.out.println("They Add Up To: " + noDec.format(dealer));
            } else if (dealer == player) {
                System.out.println("\nThe Dealer Drew 8 Cards\nHis Hand Is: " + a33 + ", " + a44 + ", " + b22 + ", " + c22 + ", " + d22 + ", " + e22 + ", " + f22 + ", " + g22 + ", " + h22 + ", & " + i22);
                System.out.println("It's A Draw! You Both Have: " + noDec.format(dealer));
            }
        }
    }
}