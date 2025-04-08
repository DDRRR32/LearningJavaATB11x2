package Tasks_Java.OopsConcept;

public class Task_4_2_OverLoading {
    public static void main(String[] args) {

        advCal c = new advCal();
        System.out.println(c.sum(12,13));
        System.out.println(c.sum(12,13,14));
        System.out.println(c.sum(12,13,15));


    }
}

class calculator {

    int sum(int a, int b) {

        return a + b;
    }


    int sum (int a , int b , int c ){  // sum method overloaded

        return a+b+c;
    }

}

class advCal extends calculator{


    int sum (int a , int b , int c , int d){
        return a+b+c+d;
    }
}

