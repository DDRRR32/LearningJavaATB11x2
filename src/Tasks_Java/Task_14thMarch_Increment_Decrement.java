package Tasks_Java;

public class Task_14thMarch_Increment_Decrement {
    public static void main(String[] args) {

        int a = 20;
        System.out.println(--a + a++ + a--);

        //19
        //+
        //19
        //+
        //20
        //=58

        System.out.println(a);
    }
}
