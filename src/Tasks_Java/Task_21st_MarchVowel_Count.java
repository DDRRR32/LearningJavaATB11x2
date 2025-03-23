package Tasks_Java;

public class Task_21st_MarchVowel_Count {
    public static void main(String[] args) {
        String name = "Pramod";
        int vowel = 0;
        int consonant = 0;

        for (int i = name.length() - 1; i >= 0; i--) {

            if (name.charAt(i) == 'a' || name.charAt(i) == 'e' || name.charAt(i) == 'i' || name.charAt(i) == 'o' || name.charAt(i) == 'u') {
                vowel++;
            } else {
                consonant++;
            }

        }
        System.out.println("vowel count ->"+ vowel + "\nconsonant count ->"+consonant);
    }


}
