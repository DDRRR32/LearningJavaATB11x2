package Tasks_Java;

import java.util.Scanner;

public class Task_14thMarch_CLI_1 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Please Enter The Name: ");
        String name = scanner.nextLine();

        System.out.println("Please Enter the age:");
        String age = scanner.nextLine();

        System.out.println("Please Enter the Salary:");
        String salary = scanner.nextLine();

        System.out.println("name is: "+ name);
        System.out.println("age is:"+age);
        System.out.println("Salary is:"+salary);

        scanner.close();
    }
}
