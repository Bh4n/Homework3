package Entities;

public class Instructor extends User {

    private double salary;
    private String lessonsGiven;

    public Instructor() {

    }

    public Instructor(int id, String firstName, String lastName, String email, double salary, String lessonsGiven) {
        super(id, firstName, lastName, email);
        this.salary = salary;
        this.lessonsGiven = lessonsGiven;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getLessonsGiven() {
        return lessonsGiven;
    }

    public void setLessonsGiven(String lessonsGiven) {
        this.lessonsGiven = lessonsGiven;
    }


}
