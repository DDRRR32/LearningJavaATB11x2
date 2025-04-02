package Tasks_Java;

public class Task_1stApril_Constructor {


    public static void main(String[] args) {

        //This line will call default value (DC)
        Person1 p = new Person1();


        System.out.println("-----------------");
        //PC

        Person1 p1 = new Person1("Shreya", (byte) 23, false);
        System.out.println("-----------------");
        p1.eat();
        System.out.println("-----------------");
        p1.sleep();
        System.out.println("-----------------");
        p1.walk();


    }
}

class Person1 {

    //Instances ,Fields ,Attributes
    String name;
    byte age;
    String address;
    long phNo;
    boolean isMale;

    //DEFAULT-CONSTRUCTOR
    Person1() {
        name = "Deba";
        age = 27;
        address = "Bangalore";
        phNo = 1233456789L;
        isMale = true;
        System.out.println("Default values are = " + name + "," + age + "," + isMale);
    }

    //PARAM-CONSTRUCTOR
    Person1(String name, byte age, boolean isMale) {

        this.name = name;
        this.age = age;
        this.isMale = isMale;
        System.out.println("After getting input , new values are = " + name + "," + age + "," + isMale);
    }

    //Behaviour
    void eat() {
        System.out.println(this.name + " is eating !!");
    }

    void sleep() {
        System.out.println(this.name + " is sleeping !!");
    }

    void walk() {
        System.out.println(this.name + " is walking !!");
    }


}
