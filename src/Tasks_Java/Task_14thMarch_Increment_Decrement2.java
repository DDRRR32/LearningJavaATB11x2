package Tasks_Java;

public class Task_14thMarch_Increment_Decrement2 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(++a + a++ + a++);
        //11
        //+
        //11
        //+
        //12
        //=34

        System.out.println(a); //13

    }
}
