package Tasks_Java;

import java.util.Scanner;

public class Task_14_March_Even0dd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please Enter the number to check odd or even: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {

            System.out.println("Number is Even");
        }
        else {
            System.out.println("Number is Odd");
        }

    }
}
