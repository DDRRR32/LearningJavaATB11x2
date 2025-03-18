package Tasks_Java;

public class Task_14th_March_Tarnery_OP {
    public static void main(String[] args) {

        int n1 = Integer.parseInt(args[0]);
        int n2 = Integer.parseInt(args[1]);

        int max = (n1 > n2) ? n1 : n2;

        System.out.println("Maximum number is = "+max);
    }
}
