package Tasks_Java;

public class Task_31stMarch_ClassPerson {

    public static void main(String[] args) {
        Person p = new Person();
        p.age = 17;
        p.isMale = true;
        p.salary = 120;
        p.name = "Deba";

        p.sleep(); // 1.Without Parameters and Without Return Type
       boolean adultStatus = p.isAdult();// 2.Without Parameters but With Return Type
        System.out.println(adultStatus);
        p.IdCardNo("Id card no is =12345");  // 3.With Parameters and Without Return Type
        String parentDetails = p.ParentDetails("Rinku","Partha");// 4. With Parameters and With Return Type
        System.out.println(parentDetails);
    }
}

class Person {

    byte age;
    boolean isMale;
    int salary;
    String name;

    // 1.Without Parameters and Without Return Type
    void sleep() {
        System.out.println("Person able to get 8 hours sleep");
    }

    // 2.Without Parameters but With Return Type
    boolean isAdult() {
        return true;

    }

    // 3.With Parameters and Without Return Type

    void IdCardNo(String idCardNo) {
        System.out.println(idCardNo);

    }

    // 4. With Parameters and With Return Type
    String ParentDetails(String motherName, String fatherName) {


        return "mother name is :" + motherName + " father name is:" + fatherName;
    }

}
