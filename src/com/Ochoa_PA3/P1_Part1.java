package com.Ochoa_PA3;

import java.security.SecureRandom;
import java.util.Scanner;
public class P1_Part1 {
    public static void main(String[] args) {
        SecureRandom rand = new SecureRandom();
        int correct = 0;
        double percent;
        int randnum;
        int num = 0;
        int num2;
        num = Question();
        Scanner input = new Scanner(System.in);
        while(true) {
            num2 = input.nextInt();
            if(num2 == num){
                System.out.println("Very Good!");
                num = Question();
            }else{
                System.out.println("No. Please try again.");
            }
        }
    }



    public static int Question(){
        SecureRandom rand = new SecureRandom();
        int x = rand.nextInt(10);
        int y = rand.nextInt(10);

        int z = x * y;

        System.out.println("How much is " + x + " times " + y + "?");
        return z;
    }
}

