package ex_02_Java_Basics;

public class Lab0024_Printf {

    public static void tableFor9(){

        int num = 9;
        int t1 = num * 1;
        int t2 = num * 2;
        int t3 = num * 3;
        int t4 = num * 4;
        int t5 = num * 5;
        int t6 = num * 6;
        int t7 = num * 7;
        int t8 = num * 8;
        int t9 = num * 9;
        int t10 = num * 10;

        System.out.printf("%d x 1 = %d%n", num, t1);
        System.out.printf("%d x 2 = %d%n", num, t2);
        System.out.printf("%d x 3 = %d%n", num, t3);
        System.out.printf("%d x 4 = %d%n", num, t4);
        System.out.printf("%d x 5 = %d%n", num, t5);
        System.out.printf("%d x 6 = %d%n", num, t6);
        System.out.printf("%d x 7 = %d%n", num, t7);
        System.out.printf("%d x 8 = %d%n", num, t8);
        System.out.printf("%d x 9 = %d%n", num, t9);
        System.out.printf("%d x 10 = %d%n", num, t10);
    }
    public static void main(String[] args) {

        int a = 10;
        System.out.printf("You variable is %d",a);
        // %d -> int, byte, long, short, - data type
        // %s -> String
        // %f -> float, double,
        // %b ->boolean
        int b = 20;
        System.out.println( " --- ");
        System.out.printf("%d + %d",a,b);

        tableFor9();

    }
}
