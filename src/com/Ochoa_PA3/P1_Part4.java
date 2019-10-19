package com.Ochoa_PA3;
import java.security.SecureRandom;
import java.util.Scanner;
public class P1_Part4 {

    public static void main(String[] args) {
        SecureRandom rand = new SecureRandom();

        int x = 0;
        Scanner input = new Scanner(System.in);

        while(x == 0) {

            Test();
            System.out.println("Do you want to run a new Session?(Y/N)");
            String ans = input.next();
            if(ans.equals("N")){
                x = 1;
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
    public static int Question1(){
        SecureRandom rand = new SecureRandom();
        int x = rand.nextInt(90) + 10;
        int y = rand.nextInt(90) + 10;

        int z = x * y;

        System.out.println("How much is " + x + " times " + y + "?");
        return z;
    }
    public static int Question2(){
        SecureRandom rand = new SecureRandom();
        int x = rand.nextInt(900)+100;
        int y = rand.nextInt(900)+100;

        int z = x * y;

        System.out.println("How much is " + x + " times " + y + "?");
        return z;
    }
    public static int Question3(){
        SecureRandom rand = new SecureRandom();
        int x = rand.nextInt(9000)+1000;
        int y = rand.nextInt(9000) + 1000;

        int z = x * y;

        System.out.println("How much is " + x + " times " + y + "?");
        return z;
    }
    static void Test(){
        System.out.println("Pick a difficulty: \n1-single digits\n2-two digits\n3-three digits\n4-four digits");
        Scanner input = new Scanner(System.in);
        int pick = input.nextInt();
        int correct = 0;
        int wrong = 0;
        if(pick == 1){
            for (int i = 0; i < 10; i++) {
                int num = Question();
                int num2 = input.nextInt();
                if (num2 == num) {

                    correct += 1;
                } else {
                    wrong += 1;
                }
            }
        }
        if(pick == 2){
            for (int i = 0; i < 10; i++) {
                int num = Question1();
                int num2 = input.nextInt();
                if (num2 == num) {

                    correct += 1;
                } else {
                    wrong += 1;
                }
            }
        }
        if(pick == 3){
            for (int i = 0; i < 10; i++) {
                int num = Question2();
                int num2 = input.nextInt();
                if (num2 == num) {

                    correct += 1;
                } else {
                    wrong += 1;
                }
            }
        }
        if(pick == 4){
            for (int i = 0; i < 10; i++) {
                int num = Question3();
                int num2 = input.nextInt();
                if (num2 == num) {

                    correct += 1;
                } else {
                    wrong += 1;
                }
            }
        }
        double percent = correct / 10.0 * 100;
        if(percent > 75){
            System.out.println("Congratulations, you are ready to go to the next level!");
        }else{
            System.out.println("Please ask you teacher for extra help.");
        }
        System.out.println("You got " + correct + " correct and " + wrong + " wrong.");

    }
}

