package at.ac.fhcampuswien;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

    //todo Task 1
    public void largestNumber(){
        Scanner scanner = new Scanner(System.in);
        double x = 0;
        double input;
        for (int i = 1;;i++){
            System.out.print("Number " + i + ": ");
            input = scanner.nextDouble();
            if (input <= 0) break;
            if (input > x) x = input;
        }
        if (x != 0){

            System.out.print("The largest number is " + (int)x + ".");
            if ((x*100)%100 <10){
                System.out.println("0" + (int)(x*100)%100);
            } else if ((x*100)%100 == 0) {
                System.out.println("00");
            }
            else {
                System.out.println((x*100)%100);
            }
        }
        else{
            System.out.println("No number entered.");
        }

    }

    //todo Task 2
    public void stairs(){
        Scanner scanner = new Scanner(System.in);
        int x;
        int runner = 1;

        System.out.print("n: ");
        x = scanner.nextInt();

        if (x > 0) {
            for (int i = 1; i <= x; i++) {
                for (int k = 0; k < i; k++) {
                    System.out.print(runner + " ");
                    runner++;
                }
                System.out.println();
            }
        }
        else {
            System.out.println("Invalid number!");
        }
    }

    //todo Task 3
    public void printPyramid(){
        int ROWS = 6;

        for (int i = 0; i < ROWS; i++) {
            for (int space = 0; space < ROWS -1 -i; space++) {
                System.out.print(" ");
            }
            for (int stars = 0; stars < i; stars++) {
                System.out.print("*");
            }

            System.out.print("*");

            for (int stars = 0; stars < i; stars++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //todo Task 4
    public void printRhombus() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("h: ");
        int h = scanner.nextInt();
        System.out.print("c: ");
        char c = scanner.next().charAt(0);

        if (h%2 == 0) {
            System.out.println("Invalid number!");
            return;
        }

        //Erste Haelfte
        for (int i = 0; i < (h +1)/2; i++) {

            for (int space = 0; space < (h+1) /2 -1 -i; space++) {
                System.out.print(" ");
            }

            for (int chars = 0; chars < i; chars++) {
                System.out.print(c);
                c++;
            }

            System.out.print(c);
            c--;

            for (int chars = 0; chars < i; chars++) {
                System.out.print(c);
                c--;
            }
            System.out.println();
        }
        c++;

        //Zweite Haelfte
        for (int i = 1; i < (h +1)/2; i++) {
            c++;

            for (int space = 0; space <i; space++) {
                System.out.print(" ");
            }

            for (int chars = 0; chars < (h-1)/2 -i; chars++) {
                System.out.print(c);
                c++;
            }

            System.out.print(c);
            c--;

            for (int chars = 0; chars < (h-1)/2 -i; chars++) {
                System.out.print(c);
                c--;
            }

            c++;
            System.out.println();
        }
    }



    //todo Task 5
    public void marks(){
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        int input;
        int counter = 0;
        int negativMarks = 0;

        for (int i = 1;;i++) {
            System.out.print("Mark " + i + ": ");

            input = scanner.nextInt();
            if (input == 0) break;
            if (input > 0 && input <= 5) {
                sum += input;
                counter++;

                if (input == 5) negativMarks ++;
            }

            else {
                System.out.println("Invalid mark!");
                i --;
            }
        }

        //Make the average of the sum
        sum /= counter;


        //print the number
        System.out.print("Average: " + (int)sum + ".");
        if ((int)(sum*100)%100 == 0) {
            System.out.println("00");
        }
        else if ((sum*100)%100 <10){
            System.out.println("0" + (int)(sum*100)%100);
        }
        else {
            System.out.println((int)(sum*100)%100);
        }

        System.out.println("Negative marks: " + negativMarks);
    }

    //todo Task 6
    public void happyNumbers(){
        ArrayList<Integer> sumList = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("n: ");
        int sum = scanner.nextInt();
        int num;

        for (int i = 0;i < 100;i++) {
            num = sum;
            sum = 0;

            while (num > 0) {
                sum += (num%10)*(num%10);
                num /=10;
            }

            if (sum == 1) {
                System.out.println("Happy number!");
                break;
            }

            if (sumList.contains(sum)) {
                System.out.println("Sad number!");
                break;
            }

            sumList.add(sum);
        }
    }

    public static void main(String[] args){
        App exercise2 = new App();

        System.out.println("Task 1: Largest Number");
        exercise2.largestNumber();

        System.out.println("\nTask 2: Stairs");
        exercise2.stairs();

        System.out.println("\nTask 3: Pyramide");
        exercise2.printPyramid();

        System.out.println("\nTask 4: Raute");
        exercise2.printRhombus();

        System.out.println("\nTask 5: Notendurchschnitt");
        exercise2.marks();

        System.out.println("\nTask 6: Fröhliche Zahlen");
        exercise2.happyNumbers();
    }
}