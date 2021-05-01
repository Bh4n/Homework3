import Business.InstructorManager;
import Business.StudentManager;
import Business.UserManager;
import Entities.Instructor;
import Entities.Student;
import Entities.User;

public class Main {

    public static void main(String[] args) {

        Student student1 = new Student(1, "Enes Bahan", "Morova", "bh**@gmail.com", 537, 21);
        StudentManager studentManager = new StudentManager();

        studentManager.add(student1);
        studentManager.studentNumber(student1);
        System.out.println("--------------------------");
        Instructor instructor1 = new Instructor(1, "Engin", "Demiroğ", "eng**@gmail.com", 22000, "(JAVA + REACT)");
        InstructorManager instructorManager = new InstructorManager();
        instructorManager.add(instructor1);
        instructorManager.insLessonsGiven(instructor1);


    }
}
