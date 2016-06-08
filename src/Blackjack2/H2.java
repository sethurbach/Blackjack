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
public class H2 {
    public static void H2() {
        if (h2 == 1) {
            count1++;
        }
        if (h2 == 2) {
            count2++;
        }
        if (h2 == 3) {
            count3++;
        }
        if (h2 == 4) {
            count4++;
        }
        if (h2 == 5) {
            count5++;
        }
        if (h2 == 6) {
            count6++;
        }
        if (h2 == 7) {
            count7++;
        }
        if (h2 == 8) {
            count8++;
        }
        if (h2 == 9) {
            count9++;
        }
        if (h2 == 10) {
            count10++;
        }
        if (h2 == 11) {
            count11++;
        }
        if (h2 == 12) {
            count12++;
        }
        if (h2 == 13) {
            count13++;
        }
        if (count1 >= 4) {
            double ex = 1;
            if (h2 == ex) {
                while (h2 == ex) {
                    hh2 = Math.random();
                    hh2 = ((int) (h2 * 13) + 1);
                    h2 = (int) hh2;
                }
            }
        }
        if (count2 >= 4) {
            double ex = 2;
            if (h2 == ex) {
                while (h2 == ex) {
                    hh2 = Math.random();
                    hh2 = ((int) (h2 * 13) + 1);
                    h2 = (int) hh2;
                }
            }
        }
        if (count3 >= 4) {
            double ex = 3;
            if (h2 == ex) {
                while (h2 == ex) {
                    hh2 = Math.random();
                    hh2 = ((int) (h2 * 13) + 1);
                    h2 = (int) hh2;
                }
            }
        }
        if (count4 >= 4) {
            double ex = 4;
            if (h2 == ex) {
                while (h2 == ex) {
                    hh2 = Math.random();
                    hh2 = ((int) (h2 * 13) + 1);
                    h2 = (int) hh2;
                }
            }
        }
        if (count5 >= 4) {
            double ex = 5;
            if (h2 == ex) {
                while (h2 == ex) {
                    hh2 = Math.random();
                    hh2 = ((int) (h2 * 13) + 1);
                    h2 = (int) hh2;
                }
            }
        }
        if (count6 >= 4) {
            double ex = 6;
            if (h2 == ex) {
                while (h2 == ex) {
                    hh2 = Math.random();
                    hh2 = ((int) (h2 * 13) + 1);
                    h2 = (int) hh2;
                }
            }
        }
        if (count7 >= 4) {
            double ex = 7;
            if (h2 == ex) {
                while (h2 == ex) {
                    hh2 = Math.random();
                    hh2 = ((int) (h2 * 13) + 1);
                    h2 = (int) hh2;
                }
            }
        }
        if (count8 >= 4) {
            double ex = 8;
            if (h2 == ex) {
                while (h2 == ex) {
                    hh2 = Math.random();
                    hh2 = ((int) (h2 * 13) + 1);
                    h2 = (int) hh2;
                }
            }
        }
        if (count9 >= 4) {
            double ex = 9;
            if (h2 == ex) {
                while (h2 == ex) {
                    hh2 = Math.random();
                    hh2 = ((int) (h2 * 13) + 1);
                    h2 = (int) hh2;
                }
            }
        }
        if (count10 >= 4) {
            double ex = 10;
            if (h2 == ex) {
                while (h2 == ex) {
                    hh2 = Math.random();
                    hh2 = ((int) (h2 * 13) + 1);
                    h2 = (int) hh2;
                }
            }
        }
        if (count11 >= 4) {
            double ex = 11;
            if (h2 == ex) {
                while (h2 == ex) {
                    hh2 = Math.random();
                    hh2 = ((int) (h2 * 13) + 1);
                    h2 = (int) hh2;
                }
            }
        }
        if (count12 >= 4) {
            double ex = 12;
            if (h2 == ex) {
                while (h2 == ex) {
                    hh2 = Math.random();
                    hh2 = ((int) (h2 * 13) + 1);
                    h2 = (int) hh2;
                }
            }
        }
        if (count13 >= 4) {
            double ex = 13;
            if (h2 == ex) {
                while (h2 == ex) {
                    hh2 = Math.random();
                    hh2 = ((int) (h2 * 13) + 1);
                    h2 = (int) hh2;
                }
            }
        }
        switch (h2) {
            case 1:
                h22 = "A";
                break;
            case 11:
                h22 = "J";
                break;
            case 12:
                h22 = "Q";
                break;
            case 13:
                h22 = "K";
                break;
            default:
                h22 = Integer.toString(h2);
                break;
        }
        switch (h2) {
            case 11:
                h2 = 10;
                break;
            case 12:
                h2 = 10;
                break;
            case 13:
                h2 = 10;
                break;
            default:
                h2 = h2;
                break;
        }
        dealer = a3 + a4 + b2 + c2 + d2 + e2 + f2 + g2 + h2;
        if (dealer < 17) {
            Blackjack2.I2.I2();
        } else if (dealer >= 17) {
            if (player > 21) {
                System.out.println("\nYou Loose! You Went Over 21!");
            } else if (dealer > 21) {
                System.out.println("\nThe Dealer Drew 7 Cards\nYou Win! The Dealer Went Over 21!\nHis Hand Is: " + a33 + ", " + a44 + ", " + b22 + ", " + c22 + ", " + d22 + ", " + e22 + ", " + f22 + ", " + g22 + ", & " + h22);
                System.out.println("They Add Up To: " + noDec.format(dealer));
            } else if (player > dealer) {
                System.out.println("\nThe Dealer Drew 7 Cards\nYou Win!You Beat The Dealer!\nHis Hand Is: " + a33 + ", " + a44 + ", " + b22 + ", " + c22 + ", " + d22 + ", " + e22 + ", " + f22 + ", " + g22 + ", & " + h22);
                System.out.println("They Add Up To: " + noDec.format(dealer));
            } else if (dealer > player) {
                System.out.println("\nThe Dealer Drew 7 Cards\nYou Lose! The Dealer Beat You!\nHis Hand Is: " + a33 + ", " + a44 + ", " + b22 + ", " + c22 + ", " + d22 + ", " + e22 + ", " + f22 + ", " + g22 + ", & " + h22);
                System.out.println("They Add Up To: " + noDec.format(dealer));
            } else if (dealer == player) {
                System.out.println("\nThe Dealer Drew 7 Cards\nHis Hand Is: " + a33 + ", " + a44 + ", " + b22 + ", " + c22 + ", " + d22 + ", " + e22 + ", " + f22 + ", " + g22 + ", & " + h22);
                System.out.println("It's A Draw! You Both Have: " + noDec.format(dealer));
            }
        }
    }
}