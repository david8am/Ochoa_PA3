package com.Ochoa_PA3;
import java.security.SecureRandom;
import java.util.Scanner;
public class P1_Part3 {

    public static void main(String[] args) {
        SecureRandom rand = new SecureRandom();

        double percent;
        int randnum;
        int num;
        int num2;
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
    static void Test(){
        int correct = 0;
        int wrong = 0;
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            int num = Question();
            int num2 = input.nextInt();
            if (num2 == num) {

                correct += 1;
            }else{
                wrong +=1;
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


