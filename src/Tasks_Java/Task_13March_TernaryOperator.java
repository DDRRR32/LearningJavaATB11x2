package Tasks_Java;


public class Task_13March_TernaryOperator {

//    Write a program that calculates and displays the letter grade for a given numerical score (e.g., A, B, C, D, or F) based on the following grading scale:
//    A: 90-100
//    B: 80-89
//    C: 70-79
//    D: 60-69
//    F: 0-59
public static void main(String[] args) {
    int  marks = Integer.parseInt(args[0]);

    char grade= (marks >=90 && marks <=100) ? 'A' : (marks >= 80) ? 'B' : (marks >=70) ? 'C' :(marks >=60)? 'D' :'F';
    System.out.println(grade);
}

}
