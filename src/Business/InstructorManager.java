package Business;

import Entities.Instructor;
import Entities.User;

public class InstructorManager extends UserManager{

    public void insLessonsGiven(Instructor instructor){
        System.out.println("Verdiği ders : " +instructor.getLessonsGiven());
    }

    @Override
    public void add(User user) {
        System.out.print("Eğitmen ");
        super.add(user);

    }

}
