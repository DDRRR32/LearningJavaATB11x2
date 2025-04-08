package Tasks_Java.OopsConcept;

public class Task_4_1_Overriding {
    public static void main(String[] args) {

        car c = new car();
        System.out.println("*************");
        bmw b = new bmw();
        System.out.println("*************");
        c.frame();
        System.out.println("*************");
        b.frame();

        System.out.println("*************");
        bmw b1 = new bmw();
        b1.frame();
    }

}

class car{

    car(){
        System.out.println("I am Primary car");
    }

    void frame(){
        System.out.println("base frame");
    }

}

class bmw extends car{

    bmw(){
        System.out.println("I am BMW");
    }
    @Override
    void frame(){
        System.out.println("bmw frame");
    }
}
