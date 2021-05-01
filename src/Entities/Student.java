package Entities;

public class Student extends User{



    private int studentNumber;
    private int age;

    public Student() {

    }

    public Student(int id, String firstName, String lastName, String email, int studentNumber, int age) {
        super(id, firstName, lastName, email);
        this.studentNumber = studentNumber;
        this.age = age;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
