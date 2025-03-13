package Tasks_Java;

public class Task_12th_March_MathFunc {
    public static void main(String[] args) {

        int X = 10, Y = 10, Z = 10;

//        Method	Description	Example	Output
//        Math.abs(x)	Absolute value	Math.abs(-10)	10
//        Math.sqrt(x)	Square root	Math.sqrt(25)	5.0
//        Math.pow(x, y)	Power (x^y)	Math.pow(2, 3)	8.0
//        Math.max(x, y)	Maximum of two numbers	Math.max(5, 10)	10
//        Math.min(x, y)	Minimum of two numbers	Math.min(5, 10)	5
//        Math.round(x)	Rounds to nearest integer	Math.round(4.6)	5
//        Math.ceil(x)	Rounds up	Math.ceil(4.2)	5.0
//        Math.floor(x)	Rounds down	Math.floor(4.9)	4.0
//        Math.random()	Generates a random number (0.0 - 1.0)	Math.random()	0.XX

       double result = Math.cbrt((Math.pow(X,2))+(Math.pow(Y,2))-(Math.abs(Z)));

        System.out.println("The Value of this problem is = "+ result);
    }
}
