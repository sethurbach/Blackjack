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
public class B2 {
    public static void B2() {
        if (b2 == 1) {
            count1++;
        }
        if (b2 == 2) {
            count2++;
        }
        if (b2 == 3) {
            count3++;
        }
        if (b2 == 4) {
            count4++;
        }
        if (b2 == 5) {
            count5++;
        }
        if (b2 == 6) {
            count6++;
        }
        if (b2 == 7) {
            count7++;
        }
        if (b2 == 8) {
            count8++;
        }
        if (b2 == 9) {
            count9++;
        }
        if (b2 == 10) {
            count10++;
        }
        if (b2 == 11) {
            count11++;
        }
        if (b2 == 12) {
            count12++;
        }
        if (b2 == 13) {
            count13++;
        }
        if (count1 >= 4) {
            double ex = 1;
            if (b2 == ex) {
                while (b2 == ex) {
                    bb2 = Math.random();
                    bb2 = ((int) (b2 * 13) + 1);
                    b2 = (int) bb2;
                }
            }
        }
        if (count2 >= 4) {
            double ex = 2;
            if (b2 == ex) {
                while (b2 == ex) {
                    bb2 = Math.random();
                    bb2 = ((int) (b2 * 13) + 1);
                    b2 = (int) bb2;
                }
            }
        }
        if (count3 >= 4) {
            double ex = 3;
            if (b2 == ex) {
                while (b2 == ex) {
                    bb2 = Math.random();
                    bb2 = ((int) (b2 * 13) + 1);
                    b2 = (int) bb2;
                }
            }
        }
        if (count4 >= 4) {
            double ex = 4;
            if (b2 == ex) {
                while (b2 == ex) {
                    bb2 = Math.random();
                    bb2 = ((int) (b2 * 13) + 1);
                    b2 = (int) bb2;
                }
            }
        }
        if (count5 >= 4) {
            double ex = 5;
            if (b2 == ex) {
                while (b2 == ex) {
                    bb2 = Math.random();
                    bb2 = ((int) (b2 * 13) + 1);
                    b2 = (int) bb2;
                }
            }
        }
        if (count6 >= 4) {
            double ex = 6;
            if (b2 == ex) {
                while (b2 == ex) {
                    bb2 = Math.random();
                    bb2 = ((int) (b2 * 13) + 1);
                    b2 = (int) bb2;
                }
            }
        }
        if (count7 >= 4) {
            double ex = 7;
            if (b2 == ex) {
                while (b2 == ex) {
                    bb2 = Math.random();
                    bb2 = ((int) (b2 * 13) + 1);
                    b2 = (int) bb2;
                }
            }
        }
        if (count8 >= 4) {
            double ex = 8;
            if (b2 == ex) {
                while (b2 == ex) {
                    bb2 = Math.random();
                    bb2 = ((int) (b2 * 13) + 1);
                    b2 = (int) bb2;
                }
            }
        }
        if (count9 >= 4) {
            double ex = 9;
            if (b2 == ex) {
                while (b2 == ex) {
                    bb2 = Math.random();
                    bb2 = ((int) (b2 * 13) + 1);
                    b2 = (int) bb2;
                }
            }
        }
        if (count10 >= 4) {
            double ex = 10;
            if (b2 == ex) {
                while (b2 == ex) {
                    bb2 = Math.random();
                    bb2 = ((int) (b2 * 13) + 1);
                    b2 = (int) bb2;
                }
            }
        }
        if (count11 >= 4) {
            double ex = 11;
            if (b2 == ex) {
                while (b2 == ex) {
                    bb2 = Math.random();
                    bb2 = ((int) (b2 * 13) + 1);
                    b2 = (int) bb2;
                }
            }
        }
        if (count12 >= 4) {
            double ex = 12;
            if (b2 == ex) {
                while (b2 == ex) {
                    bb2 = Math.random();
                    bb2 = ((int) (b2 * 13) + 1);
                    b2 = (int) bb2;
                }
            }
        }
        if (count13 >= 4) {
            double ex = 13;
            if (b2 == ex) {
                while (b2 == ex) {
                    bb2 = Math.random();
                    bb2 = ((int) (b2 * 13) + 1);
                    b2 = (int) bb2;
                }
            }
        }
        switch (b2) {
            case 1:
                b22 = "A";
                break;
            case 11:
                b22 = "J";
                break;
            case 12:
                b22 = "Q";
                break;
            case 13:
                b22 = "K";
                break;
            default:
                b22 = Integer.toString(b2);
                break;
        }
        switch (b2) {
            case 11:
                b2 = 10;
                break;
            case 12:
                b2 = 10;
                break;
            case 13:
                b2 = 10;
                break;
            default:
                b2 = b2;
                break;
        }
        dealer = a3 + a4 + b2;
        if (dealer < 17) {
            Blackjack2.C2.C2();
        } else if (dealer >= 17) {
            if (player > 21) {
                System.out.println("\nYou Loose! You Went Over 21!");
            } else if (dealer > 21) {
                System.out.println("\nThe Dealer Drew 1 Card\nYou Win! The Dealer Went Over 21!\nHis Hand Is: " + a33 + ", " + a44 + ", & " + b22);
                System.out.println("They Add Up To: " + noDec.format(dealer));
            } else if (player > dealer) {
                System.out.println("\nThe Dealer Drew 1 Card\nYou Win!You Beat The Dealer!\nHis Hand Is: " + a33 + ", " + a44 + ", & " + b22);
                System.out.println("They Add Up To: " + noDec.format(dealer));
            } else if (dealer > player) {
                System.out.println("\nThe Dealer Drew 1 Card\nYou Lose! The Dealer Beat You!\nHis Hand Is: " + a33 + ", " + a44 + ", & " + b22);
                System.out.println("They Add Up To: " + noDec.format(dealer));
            } else if (dealer == player) {
                System.out.println("\nThe Dealer Drew 1 Card\nHis Hand Is: " + a33 + ", " + a44 + ", & " + b22);
                System.out.println("It's A Draw! You Both Have: " + noDec.format(dealer));
            }
        }
    }
}