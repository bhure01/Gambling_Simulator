package com.bridgelabzs;
import java.util.*;

public class GamblingSimulator {
   public static final int PER_DAY_STACK_COST = 100;
   public static final int BET_COST = 1;
   public static final int BET_WIN = 1;

   private static final int lossStack = 0;
   private static final int winStack = 0;

   private static int[] winCountArray = new int[20];
   private static int[] lossCountArray = new int[20];

   private static Random randStatus = new Random();


    static void betWinOrLoss(int betResult){
        if(betResult == 1){
            System.out.println("Gambler Wins");
        } else {
            System.out.println("Gambler Looses");
        }
    }
    private static void playGame(int i) {
        int winStack = 0;
        int lossStack = 0;
        int winCount = 0;
        int lossCount = 0;
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
        winCountArray[i] = winCount;
        lossCountArray[i] = lossCount;
    }
    private static void showGamblerStatus() {
        System.out.println("Per Day Stack : " + PER_DAY_STACK_COST);
        System.out.println("Bet Per Game : " + BET_COST);
    }
    private static void showWinLooseCount() {
        for(int i= 0; i < 20; i++) {
            System.out.println("Day " + (i+1) + " Total Win Count : " + winCountArray[i]);
            System.out.println("Day " + (i+1) + " Total Loose Count : " + lossCountArray[i]);
        }
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Gambler simulator program");
        showGamblerStatus();
        for(int i = 0; i < 20; i++) {
            System.out.println("Day" + (i+1) + " Play Starts");
            playGame(i);
            System.out.println("Day" + (i+1) + " Play Ends");
        }
        showWinLooseCount();
    }
}