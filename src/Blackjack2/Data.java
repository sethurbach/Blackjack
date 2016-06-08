/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Blackjack2;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author sethurbach
 */
public class Data {

    public static DecimalFormat noDec = new DecimalFormat("##");
    public static DecimalFormat money = new DecimalFormat("$###");
    public static Scanner user = new Scanner(System.in);
    public static Scanner user2=new Scanner(System.in);
    public static String yes = "yes", y = "y", no = "no", n = "n", exit="exit";
    public static int count1 = 0, count2 = 0, count3 = 0, count4 = 0;
    public static int count5 = 0, count6 = 0, count7 = 0, count8 = 0;
    public static int count9 = 0, count10 = 0, count11 = 0, count12 = 0;
    public static int count13 = 0;
    public static String input1, input2, input3, input4, input5, input6, input7, input8, input9, input10, input11, input12=yes;
    public static int bet;
    public static int player, dealer;
    public static double aa1, aa2, aa3, aa4;
    public static double bb1, bb2, cc1, cc2;
    public static double dd1, dd2, ee1, ee2;
    public static double ff1, ff2, gg1, gg2;
    public static double hh1, hh2, ii1, ii2;
    public static double jj1, jj2;
    public static int a1, a2, a3, a4, b1, b2, c1, c2, d1, d2, e1, e2, f1, f2, g1, g2, h1, h2, i1, i2, j1, j2;
    public static String a11, a22, a33, a44, b11, b22, c11, c22, d11, d22, e11, e22, f11, f22, g11, g22, h11, h22, i11, i22, j11, j22;
    public static int playerMoney=150;
    public static int dealerMoney=200;
    public static int winnings;
}
