package Tasks_Java;

import java.util.Scanner;

public class Task_14thMarch_Triangle_Classifier {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter side no 1= ");
        int side1 = scanner.nextInt();

        System.out.println("Enter side no 2= ");
        int side2 = scanner.nextInt();

        System.out.println("Enter side no 3= ");
        int side3 = scanner.nextInt();


        if (side1 == side2 && side3==side1){
            System.out.println("triangle is equilateral");

        } else if (side1 == side2 || side3==side1||side3==side2) {
            System.out.println("triangle is isosceles");

        } else {
            System.out.println("triangle is scalene");
        }

    }
}
