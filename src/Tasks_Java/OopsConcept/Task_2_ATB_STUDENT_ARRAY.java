package Tasks_Java.OopsConcept;

public class Task_2_ATB_STUDENT_ARRAY {
    public static void main(String[] args) {
        atbStudent[] student = new atbStudent[3];

        student[0] = new atbStudent("Deba", 17, "Java");
        student[1] = new atbStudent("Shreya", 18, "Python");
        student[2] = new atbStudent("dreya", 19, "Rubi");

        System.out.println(student[0]);
        System.out.println("**********");
        System.out.println(student[1]);
        System.out.println("**********");
        System.out.println(student[2]);


    }
}

class atbStudent {

    String name;
    int rollNo;
    String subject;


    atbStudent(String name, int rollNo, String subject) {

        this.name = name;
        this.rollNo = rollNo;
        this.subject = subject;
    }

    public String toString() {

        return "Student name is: " + name + "\n" + "Student roll ni is: " + rollNo + "\n" + "Student subject is: " + subject;
    }

}

