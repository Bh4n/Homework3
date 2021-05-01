package Business;

import Entities.Student;
import Entities.User;

public class StudentManager extends UserManager {

    @Override
    public void add(User user) {
        System.out.print("Öğrenci ");
        super.add(user);
    }

    public void studentNumber(Student student) {

        System.out.println("Öğrencinin numarası: " + student.getStudentNumber());

    }
}
