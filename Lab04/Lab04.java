import com.sun.deploy.security.WSecureRandom;

import java.util.Random;
import java.util.Scanner;

public class Lab04 {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("=====MENU======");
            System.out.println("Pres 1 to Print all numbers");
            System.out.println("Pres 2 to Print maximum value");
            System.out.println("Pres 3 to Print minimum value");
            System.out.println("Pres 4 to Search number");
            int userInput = scanner.nextInt();
            int arrayLength = 5;
            int min = 0;
            int max = 0;


            Random randomNum = new Random();
            int[] myIntArray = new int[5];

            for (int i = 0; i < arrayLength; i++) {
                myIntArray[i] = randomNum.nextInt(1000);
            }

            if (userInput == 1) {
                for (int elementValue : myIntArray) {
                    System.out.println(elementValue);
                }
            } else if (userInput == 2) {
                for (int i = 1; i < arrayLength; i++) {
                    if (min > myIntArray[i]) {
                        min = myIntArray[i];
                    }
                }
                System.out.println(" Min is :" + min);
            } else if (userInput == 3) {
                for (int i = 1; i < arrayLength; i++) {
                    if (max < myIntArray[i]) {
                        max = myIntArray[i];
                    }
                }
                System.out.println(" Max is :" + max);

            } else if (userInput == 4) {
                System.out.println(" Please input your number");
                int input = scanner.nextInt();
                int RandomNumber = input;
                for (int i = 0; i < arrayLength; i++) {
                    if (RandomNumber == myIntArray[i]) {
                        System.out.println("Search found");
                        break;
                    } else System.out.println("search not found");
                    break;
                }
            }
        }
    }
}
//        System.out.println(" Please input your number");
//                int input=scanner.nextInt();
//                int key=input;
//                int flag=0;
//                for(int i=0;i<arrayLength; i++){
//        if(myIntArray[i]==key){
//        flag=1;
//        break;
//        }
//        if(flag==1)
//        System.out.println("Search found");
//        else
//        System.out.println("search not found");


