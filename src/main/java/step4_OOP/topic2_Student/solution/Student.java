package step4_OOP.topic2_Student.solution;

public class Student extends Person{
    private String studentID;

    public Student(String name, int age, String studentID) {
        super(name, age);
        this.studentID = studentID;
    }

    @Override
    public void displayInfo() {
        System.out.println("Name: "+this.getName()+", Age: "+this.getAge()+", Student ID: "+ this.studentID);
    }

    public String getStudentID() {
        return this.studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }
}
