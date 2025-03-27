package Tasks_Java;

public class Task_28th_March_2nd_highest_no_in_array {
    public static void main(String[] args) {
        int[] arr = {1,22,5,77,45,678,87,232,32};

        int highest = Integer.MIN_VALUE;
        int Second_highest =Integer.MIN_VALUE;

        for (int i =0 ; i <arr.length; i++) {

            if (arr[i] > highest) {

                Second_highest= highest;
                highest =arr[i];
            } else if (arr[i]> Second_highest && arr[i] !=highest) {
                arr[i]= Second_highest;
            }
        }
        System.out.println(highest);
        System.out.println(Second_highest);
    }
}
