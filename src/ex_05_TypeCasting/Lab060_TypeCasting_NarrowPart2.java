package ex_05_TypeCasting;

public class Lab060_TypeCasting_NarrowPart2 {
    public static void main(String[] args) {
        long phone_no = 9876543210l;
        //short s = phone_no; // implicit ?
        short s = (short) phone_no; // Explicit Casting - Narrowing
        System.out.println(s);
    }
}
