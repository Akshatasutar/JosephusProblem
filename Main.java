package com.task2a;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
/*
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Number of players: ");
            int n = input.nextInt();
            if(n == 0)
                break;
            play(n, n/2);
        }*/


        getRuntimes();
    }

    private static void play(int n, int m) {
        ArrayList<Integer> players = new ArrayList<>(n);
        for(int i=1; i <= n; i++) {
            players.add(i);
        }
        //System.out.println(Arrays.toString(players.toArray()));
        int start = m;
        while (players.size() > 1) {
            while(start > players.size() - 1){
                start -= players.size();
            }
            players.remove(players.get(start));
            start += m;
        }
        //System.out.println("Winner is " + players.get(0));
        //System.out.println("---------------------------------");
    }

    public static void getRuntimes () {
        int[] inputs = {10, 100, 1000};
        long startTime;
        long estimatedTime;
        for (int n : inputs) {
            System.out.println("How many: " + n);
            for(int m = 1; m <= 3; m++) {
                startTime = System.nanoTime();
                play(n,n/2);
                estimatedTime = System.nanoTime() - startTime;
                System.out.println("m = " + m);
                System.out.println(estimatedTime);
            }
            System.out.println("------------------------------");
        }
    }
}
