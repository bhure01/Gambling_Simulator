package com.bridgelabzs;
import java.util.*;

public class GamblingSimulator {
   public static final int PER_DAY_STACK_COST = 100;
   public static final int BET_COST = 1;
   public static final int BET_WIN = 1;

   private static int lossStack = 0;
   private static int winStack = 0;

    private static Random randStatus = new Random();

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
    private static void playGame() {
        while(true) {
            int gameStatus = randStatus.nextInt(2) + 1;
            if (gameStatus == BET_WIN) {
                winStack += BET_COST;
                System.out.println("Won the Game - WIN STACK : " + winStack);
            } else {
                lossStack += BET_COST;
                System.out.println("Lost the Game - LOOSE STACK :" + lossStack);
            }
            if(winStack == PER_DAY_STACK_COST/ 2) {
                System.out.println("Win Stack is 50% of per day stack cost and Gambler Resigning for day");
                break;
            }
            if(lossStack == PER_DAY_STACK_COST / 2) {
                System.out.println("Loss Stack is 50% of per day stack and Gambler is Resigning for the day");
                break;
            }
        }
    }
}
