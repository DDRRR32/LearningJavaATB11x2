package Tasks_Java.OopsConcept;

public class ATB_Encapsulation {
    public static void main(String[] args) {

        atbClassRoom atbclassroom = new atbClassRoom("Deba", 18);

        System.out.println(atbclassroom.getStudentName());
        System.out.println("---------------");
        System.out.println(atbclassroom.getRollNo());
        System.out.println("---------------");

        atbclassroom.setRollNo(12);
        atbclassroom.setStudentName("Turya");
        System.out.println("---------------");
        System.out.println(atbclassroom.getRollNo());
        System.out.println("---------------");
        System.out.println(atbclassroom.getStudentName());

    }
}

class atbClassRoom {

    private String studentName;
    private int rollNo;

    atbClassRoom(String studentName, int rollNo) {
        this.studentName = studentName;
        this.rollNo = rollNo;

    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
}

