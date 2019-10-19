package com.Ochoa_PA3;
import java.security.SecureRandom;
import java.util.Scanner;
public class Main {

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

        int z = x + y;

        System.out.println("How much is " + x + " plus " + y + "?");
        return z;
    }
    public static int Question1(){
        SecureRandom rand = new SecureRandom();
        int x = rand.nextInt(90) + 10;
        int y = rand.nextInt(90) + 10;

        int z = x + y;

        System.out.println("How much is " + x + " plus " + y + "?");
        return z;
    }
    public static int Question2(){
        SecureRandom rand = new SecureRandom();
        int x = rand.nextInt(900)+100;
        int y = rand.nextInt(900)+100;

        int z = x + y;

        System.out.println("How much is " + x + " plus " + y + "?");
        return z;
    }
    public static int Question3(){
        SecureRandom rand = new SecureRandom();
        int x = rand.nextInt(9000)+1000;
        int y = rand.nextInt(9000) + 1000;

        int z = x + y;

        System.out.println("How much is " + x + " plus " + y + "?");
        return z;
    }
    public static int Question4(){
        SecureRandom rand = new SecureRandom();
        int x = rand.nextInt(10);
        int y = rand.nextInt(10);

        int z = x * y;

        System.out.println("How much is " + x + " times " + y + "?");
        return z;
    }
    public static int Question5(){
        SecureRandom rand = new SecureRandom();
        int x = rand.nextInt(90) + 10;
        int y = rand.nextInt(90) + 10;

        int z = x * y;

        System.out.println("How much is " + x + " times " + y + "?");
        return z;
    }
    public static int Question6(){
        SecureRandom rand = new SecureRandom();
        int x = rand.nextInt(900)+100;
        int y = rand.nextInt(900)+100;

        int z = x * y;

        System.out.println("How much is " + x + " times " + y + "?");
        return z;
    }
    public static int Question7(){
        SecureRandom rand = new SecureRandom();
        int x = rand.nextInt(9000)+1000;
        int y = rand.nextInt(9000) + 1000;

        int z = x * y;

        System.out.println("How much is " + x + " times " + y + "?");
        return z;
    }
    public static int Question8(){
        SecureRandom rand = new SecureRandom();
        int x = rand.nextInt(10);
        int y = rand.nextInt(10);

        int z = x - y;

        System.out.println("How much is " + x + " minus " + y + "?");
        return z;
    }
    public static int Question9(){
        SecureRandom rand = new SecureRandom();
        int x = rand.nextInt(90) + 10;
        int y = rand.nextInt(90) + 10;

        int z = x - y;

        System.out.println("How much is " + x + " minus " + y + "?");
        return z;
    }
    public static int Question10(){
        SecureRandom rand = new SecureRandom();
        int x = rand.nextInt(900)+100;
        int y = rand.nextInt(900)+100;

        int z = x - y;

        System.out.println("How much is " + x + " minus " + y + "?");
        return z;
    }
    public static int Question11(){
        SecureRandom rand = new SecureRandom();
        int x = rand.nextInt(9000)+1000;
        int y = rand.nextInt(9000) + 1000;

        int z = x - y;

        System.out.println("How much is " + x + " minus " + y + "?");
        return z;
    }
    public static int Question12(){
        SecureRandom rand = new SecureRandom();

        int x = rand.nextInt(10);
        int y = rand.nextInt(10);
        int z = 0;
        if(x % y !=0) {
            z = Question12();
        }
        if(x % y == 0) {
            z = x/y;
            System.out.println("How much is " + x + " divided by " + y + "?");
        }
        return z;
    }
    public static int Question13(){
        SecureRandom rand = new SecureRandom();
        int x = rand.nextInt(90) + 10;
        int y = rand.nextInt(90) + 10;
        int z = 0;
        if(x % y !=0) {
            z = Question13();
        }

        if(x % y == 0) {
            z = x/y;
            System.out.println("How much is " + x + " divided by " + y + "?");
        }
        return z;
    }
    public static int Question14(){
        SecureRandom rand = new SecureRandom();
        int x = rand.nextInt(900)+100;
        int y = rand.nextInt(900)+100;
        int z = 0;
        if(x % y !=0) {
            z = Question14();
        }
        if(x % y == 0) {
            z = x/y;
            System.out.println("How much is " + x + " divided by " + y + "?");
        }
        return z;
    }
    public static double Question15(){
        SecureRandom rand = new SecureRandom();
        double x = rand.nextInt(9000)+1000;
        double y = rand.nextInt(9000) + 1000;
        double z =0;
        z = x/y;
        System.out.println("How much is " + x + " divided by " + y + "?");
        return z;
    }
    static void Test(){
        Scanner input = new Scanner(System.in);
        System.out.println("Pick an Arithmetic Type: \n1-Addition\n2-Multiplication\n3-Subtraction\n4-Division\n5-Random mix");
        int type = input.nextInt();
        System.out.println("Pick a difficulty: \n1-single digits\n2-two digits\n3-three digits\n4-four digits");

        int pick = input.nextInt();
        int correct = 0;
        int wrong = 0;
        if(pick == 1 && type == 1){
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
        if(pick == 2 && type ==1){
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
        if(pick == 3 && type == 1){
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
        if(pick == 4 && type == 1){
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
        if(pick == 1 && type == 2){
            for (int i = 0; i < 10; i++) {
                int num = Question4();
                int num2 = input.nextInt();
                if (num2 == num) {

                    correct += 1;
                } else {
                    wrong += 1;
                }
            }
        }
        if(pick == 2 && type ==2){
            for (int i = 0; i < 10; i++) {
                int num = Question5();
                int num2 = input.nextInt();
                if (num2 == num) {

                    correct += 1;
                } else {
                    wrong += 1;
                }
            }
        }
        if(pick == 3 && type == 2){
            for (int i = 0; i < 10; i++) {
                int num = Question6();
                int num2 = input.nextInt();
                if (num2 == num) {

                    correct += 1;
                } else {
                    wrong += 1;
                }
            }
        }
        if(pick == 4 && type == 2){
            for (int i = 0; i < 10; i++) {
                int num = Question7();
                int num2 = input.nextInt();
                if (num2 == num) {

                    correct += 1;
                } else {
                    wrong += 1;
                }
            }
        }
        if(pick == 1 && type == 3){
            for (int i = 0; i < 10; i++) {
                int num = Question8();
                int num2 = input.nextInt();
                if (num2 == num) {

                    correct += 1;
                } else {
                    wrong += 1;
                }
            }
        }
        if(pick == 2 && type ==3){
            for (int i = 0; i < 10; i++) {
                int num = Question9();
                int num2 = input.nextInt();
                if (num2 == num) {

                    correct += 1;
                } else {
                    wrong += 1;
                }
            }
        }
        if(pick == 3 && type == 3){
            for (int i = 0; i < 10; i++) {
                int num = Question10();
                int num2 = input.nextInt();
                if (num2 == num) {

                    correct += 1;
                } else {
                    wrong += 1;
                }
            }
        }
        if(pick == 4 && type == 3){
            for (int i = 0; i < 10; i++) {
                int num = Question11();
                int num2 = input.nextInt();
                if (num2 == num) {

                    correct += 1;
                } else {
                    wrong += 1;
                }
            }
        }
        if(pick == 1 && type == 4){
            for (int i = 0; i < 10; i++) {
                int num = Question12();
                int num2 = input.nextInt();
                if (num2 == num) {

                    correct += 1;
                } else {
                    wrong += 1;
                }
            }
        }
        if(pick == 2 && type ==4){
            for (int i = 0; i < 10; i++) {
                int num = Question13();
                int num2 = input.nextInt();
                if (num2 == num) {

                    correct += 1;
                } else {
                    wrong += 1;
                }
            }
        }
        if(pick == 3 && type == 4){
            for (int i = 0; i < 10; i++) {
                int num = Question14();
                int num2 = input.nextInt();
                if (num2 == num) {

                    correct += 1;
                } else {
                    wrong += 1;
                }
            }
        }
        if(pick == 4 && type == 4){
            for (int i = 0; i < 10; i++) {
                double num = Question15();
                double num2 = input.nextDouble();
                if (num2 == num) {

                    correct += 1;
                } else {
                    wrong += 1;
                }
            }
        }
        if(pick == 1 && type == 5){
            int num = 0;
            for (int i = 0; i < 10; i++) {
                SecureRandom rand = new SecureRandom();
                int y = rand.nextInt(4);
                if(y == 0) {
                    num = Question();
                }
                if(y == 1) {
                    num = Question4();
                }
                if(y == 2) {
                    num = Question8();
                }
                if(y == 3) {
                    num = Question12();
                }
                int num2 = input.nextInt();
                if (num2 == num) {

                    correct += 1;
                } else {
                    wrong += 1;
                }
            }
        }
        if(pick == 2 && type ==5){
            int num = 0;
            for (int i = 0; i < 10; i++) {
                SecureRandom rand = new SecureRandom();
                int y = rand.nextInt(4);
                if(y == 0) {
                    num = Question1();
                }
                if(y == 1) {
                    num = Question5();
                }
                if(y == 2) {
                    num = Question9();
                }
                if(y == 3) {
                    num = Question13();
                }
                int num2 = input.nextInt();
                if (num2 == num) {

                    correct += 1;
                } else {
                    wrong += 1;
                }
            }
        }
        if(pick == 3 && type == 5){
            int num = 0;
            for (int i = 0; i < 10; i++) {
                SecureRandom rand = new SecureRandom();
                int y = rand.nextInt(4);
                if(y == 0) {
                    num = Question2();
                }
                if(y == 1) {
                    num = Question6();
                }
                if(y == 2) {
                     num = Question10();
                }
                if(y == 3) {
                    num = Question14();
                }
                int num2 = input.nextInt();
                if (num2 == num) {

                    correct += 1;
                } else {
                    wrong += 1;
                }
            }
        }
        if(pick == 4 && type == 5){
            double num = 0;
            for (int i = 0; i < 10; i++) {
                SecureRandom rand = new SecureRandom();
                int y = rand.nextInt(4);
                if(y == 0) {
                     num = Question3();
                }
                if(y == 1) {
                    num = Question7();
                }
                if(y == 2) {
                     num = Question11();
                }
                if(y == 3) {
                    num = Question15();
                }

                double num2 = input.nextDouble();
                if (num2 == num) {

                    correct += 1;
                } else {
                    wrong += 1;
                }
            }
        }

        double percent = correct / 10.0 * 100;
        System.out.println("You got " + correct + " correct and " + wrong + " wrong.");
        if(percent > 75){
            System.out.println("Congratulations, you are ready to go to the next level!");
        }else {
            System.out.println("Please ask you teacher for extra help.");
        }
    }
}
