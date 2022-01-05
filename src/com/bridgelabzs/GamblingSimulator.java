package com.bridgelabzs;
import java.util.*;

public class GamblingSimulator {
   public static final int PER_DAY_STACK_COST = 100;
   public static final int BET_COST = 1;

    public static void main(String[] args) {
        System.out.println("Welcome to Gambler simulator program");
        Random random = new Random();
        int betResult = random.nextInt(2);
        betWinOrLoss(betResult);
    }
    static void betWinOrLoss(int betResult){
        if(betResult == 1){
            System.out.println("Gambler Wins");
        } else {
            System.out.println("Gambler Looses");
        }
    }
}
