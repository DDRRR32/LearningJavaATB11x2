package Tasks_Java;

import java.util.Scanner;

public class Task_20th_March_Fibonacci {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of terms: ");

        int terms = scanner.nextInt();

        int a =0;
        int b=1;

        System.out.print("Fibonacci series is :"+a+","+b);
//
//        for (int i = 2; i < terms; i++) {
//            int next = a+b;
//            System.out.println(","+next);
//            a=b;
//            b=next;
//
//        }
        //with while loop

        int count = 2; // Because two terms (0 and 1) are already printed
        while (count < terms) {
            int next = a + b;
            System.out.print(", " + next);

            a = b;
            b = next;
            count++;
        }
    }
}
