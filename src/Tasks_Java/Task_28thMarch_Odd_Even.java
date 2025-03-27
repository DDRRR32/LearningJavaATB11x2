package Tasks_Java;

public class Task_28thMarch_Odd_Even {
    public static void main(String[] args) {
        int [] arr ={1,2,45,44,78,87,88};

        for (int i = 0; i < arr.length; i++) {

            if (arr[i]%2==0) {
                System.out.println("even nos are ="+arr[i]);
            } else if (arr[i]%2 !=0) {
                System.out.println("odd nos are ="+arr[i]);

            }

        }
    }
}
