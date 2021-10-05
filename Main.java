package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner scan = new Scanner(System.in);
    private static  int counter =0;

    public static void main(String[] args) {
	// write your code here
        System.out.println("Your task is to predict the number! P.S.You have only three chances!");
        Scanner scan = new Scanner(System.in);
        System.out.println("Give us the range: ");
        int range = scan.nextInt();
        int number = (int) (Math.random() * range);
        playWithNumber(range, number);


    }
    private static void playWithNumber(int range, int number){
        while(true){
            System.out.println("Predict the number: ");
            int index = scan.nextInt();
            if(index == number){
                System.out.println("Congratulations! You won!");
                break;
            }
            else if(index > number){
                System.out.println("It is big!");
            }
            else if(index < number){
                System.out.println("It is less!");
            }

            counter++;
            if(counter == 3){
                break;
            }
        }
    }

}
