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
public class J2 {
    public static void J2() {
        if (j2 == 1) {
            count1++;
        }
        if (j2 == 2) {
            count2++;
        }
        if (j2 == 3) {
            count3++;
        }
        if (j2 == 4) {
            count4++;
        }
        if (j2 == 5) {
            count5++;
        }
        if (j2 == 6) {
            count6++;
        }
        if (j2 == 7) {
            count7++;
        }
        if (j2 == 8) {
            count8++;
        }
        if (j2 == 9) {
            count9++;
        }
        if (j2 == 10) {
            count10++;
        }
        if (j2 == 11) {
            count11++;
        }
        if (j2 == 12) {
            count12++;
        }
        if (j2 == 13) {
            count13++;
        }
        if (count1 >= 4) {
            double ex = 1;
            if (j2 == ex) {
                while (j2 == ex) {
                    jj2 = Math.random();
                    jj2 = ((int) (j2 * 13) + 1);
                    j2 = (int) jj2;
                }
            }
        }
        if (count2 >= 4) {
            double ex = 2;
            if (j2 == ex) {
                while (j2 == ex) {
                    jj2 = Math.random();
                    jj2 = ((int) (j2 * 13) + 1);
                    j2 = (int) jj2;
                }
            }
        }
        if (count3 >= 4) {
            double ex = 3;
            if (j2 == ex) {
                while (j2 == ex) {
                    jj2 = Math.random();
                    jj2 = ((int) (j2 * 13) + 1);
                    j2 = (int) jj2;
                }
            }
        }
        if (count4 >= 4) {
            double ex = 4;
            if (j2 == ex) {
                while (j2 == ex) {
                    jj2 = Math.random();
                    jj2 = ((int) (j2 * 13) + 1);
                    j2 = (int) jj2;
                }
            }
        }
        if (count5 >= 4) {
            double ex = 5;
            if (j2 == ex) {
                while (j2 == ex) {
                    jj2 = Math.random();
                    jj2 = ((int) (j2 * 13) + 1);
                    j2 = (int) jj2;
                }
            }
        }
        if (count6 >= 4) {
            double ex = 6;
            if (j2 == ex) {
                while (j2 == ex) {
                    jj2 = Math.random();
                    jj2 = ((int) (j2 * 13) + 1);
                    j2 = (int) jj2;
                }
            }
        }
        if (count7 >= 4) {
            double ex = 7;
            if (j2 == ex) {
                while (j2 == ex) {
                    jj2 = Math.random();
                    jj2 = ((int) (j2 * 13) + 1);
                    j2 = (int) jj2;
                }
            }
        }
        if (count8 >= 8) {
            double ex = 1;
            if (j2 == ex) {
                while (j2 == ex) {
                    jj2 = Math.random();
                    jj2 = ((int) (j2 * 13) + 1);
                    j2 = (int) jj2;
                }
            }
        }
        if (count9 >= 4) {
            double ex = 9;
            if (j2 == ex) {
                while (j2 == ex) {
                    jj2 = Math.random();
                    jj2 = ((int) (j2 * 13) + 1);
                    j2 = (int) jj2;
                }
            }
        }
        if (count10 >= 4) {
            double ex = 10;
            if (j2 == ex) {
                while (j2 == ex) {
                    jj2 = Math.random();
                    jj2 = ((int) (j2 * 13) + 1);
                    j2 = (int) jj2;
                }
            }
        }
        if (count11 >= 4) {
            double ex = 11;
            if (j2 == ex) {
                while (j2 == ex) {
                    jj2 = Math.random();
                    jj2 = ((int) (j2 * 13) + 1);
                    j2 = (int) jj2;
                }
            }
        }
        if (count12 >= 4) {
            double ex = 12;
            if (j2 == ex) {
                while (j2 == ex) {
                    jj2 = Math.random();
                    jj2 = ((int) (j2 * 13) + 1);
                    j2 = (int) jj2;
                }
            }
        }
        if (count13 >= 4) {
            double ex = 13;
            if (j2 == ex) {
                while (j2 == ex) {
                    jj2 = Math.random();
                    jj2 = ((int) (j2 * 13) + 1);
                    j2 = (int) jj2;
                }
            }
        }
        switch (j2) {
            case 1:
                j22 = "A";
                break;
            case 11:
                j22 = "J";
                break;
            case 12:
                j22 = "Q";
                break;
            case 13:
                j22 = "K";
                break;
            default:
                j22 = Integer.toString(j2);
                break;
        }
        switch (j2) {
            case 11:
                j2 = 10;
                break;
            case 12:
                j2 = 10;
                break;
            case 13:
                j2 = 10;
                break;
            default:
                j2 = j2;
                break;
        }
        dealer = a3 + a4 + b2 + c2 + d2 + e2 + f2 + g2 + h2 + i2 + j2;
        if (player > 21) {
            System.out.println("\nYou Loose! You Went Over 21!");
        } else if (dealer > 21) {
            System.out.println("\nThe Dealer Drew 9 Cards\nYou Win! The Dealer Went Over 21!\nHis Hand Is: " + a33 + ", " + a44 + ", " + b22 + ", " + c22 + ", " + d22 + ", " + e22 + ", " + f22 + ", " + g22 + ", " + h22 + ", " + i22 + ", & " + j22);
            System.out.println("They Add Up To: " + noDec.format(dealer));
        } else if (player > dealer) {
            System.out.println("\nThe Dealer Drew 9 Cards\nYou Win!You Beat The Dealer!\nHis Hand Is: " + a33 + ", " + a44 + ", " + b22 + ", " + c22 + ", " + d22 + ", " + e22 + ", " + f22 + ", " + g22 + ", " + h22 + ", " + i22 + ", & " + j22);
            System.out.println("They Add Up To: " + noDec.format(dealer));
        } else if (dealer > player) {
            System.out.println("\nThe Dealer Drew 9 Cards\nYou Lose! The Dealer Beat You!\nHis Hand Is: " + a33 + ", " + a44 + ", " + b22 + ", " + c22 + ", " + d22 + ", " + e22 + ", " + f22 + ", " + g22 + ", " + h22 + ", " + i22 + ", & " + j22);
            System.out.println("They Add Up To: " + noDec.format(dealer));
        } else if (dealer == player) {
            System.out.println("\nThe Dealer Drew 9 Cards\nHis Hand Is: " + a33 + ", " + a44 + ", " + b22 + ", " + c22 + ", " + d22 + ", " + e22 + ", " + f22 + ", " + g22 + ", " + h22 + ", " + i22 + ", & " + j22);
            System.out.println("It's A Draw! You Both Have: " + noDec.format(dealer));
        }
    }
}