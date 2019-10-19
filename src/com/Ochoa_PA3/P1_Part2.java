package com.Ochoa_PA3;
import java.security.SecureRandom;
import java.util.Scanner;
public class P1_Part2 {

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
                randnum = rand.nextInt(4) + 1;
                switch(randnum){
                    case 1:
                        System.out.println("Very Good!");
                        break;
                    case 2:
                        System.out.println("Excellent!");
                        break;
                    case 3:
                        System.out.println("Nice Work!");
                        break;
                    case 4:
                        System.out.println("Keep up the good work!");
                        break;
                }

                num = Question();
            }else{
                randnum = rand.nextInt(4) + 1;
                switch(randnum) {
                    case 1:
                        System.out.println("No. Please try again.");
                        break;
                    case 2:
                        System.out.println("Wrong. Try once more.");
                        break;
                    case 3:
                        System.out.println("Don't give up!");
                        break;
                    case 4:
                        System.out.println("No. Keep Trying.");
                        break;
                }
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

