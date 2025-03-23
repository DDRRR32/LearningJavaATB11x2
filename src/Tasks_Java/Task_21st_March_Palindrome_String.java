package Tasks_Java;

public class Task_21st_March_Palindrome_String {
    public static void main(String[] args) {
        String real= "madam";
        String reverse ="";
        for(int i = real.length()-1; i >=0 ; i--) {

            reverse += real.charAt(i);
        }

        if (real.equals(reverse)) {
            System.out.println("The string is palindrome in nature!");
        }
        else {
            System.out.println("string is not palindrome in nature!");
        }
    }



}
