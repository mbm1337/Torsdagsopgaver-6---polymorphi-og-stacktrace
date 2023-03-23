package Task3;

import java.util.ArrayList;

public class Student extends Person {

    ArrayList<String> passedCourse;
    ArrayList<String> currentCourse = new ArrayList<>();

    public Student(String name, ArrayList<String> passedCourse) {
        super(name);
        this.passedCourse = passedCourse;

    }

    @Override
    public boolean addCourse(String course) {
        if (passedCourse.contains(course)) {
            System.out.println(name + " already passed course");
            return false;
        } else
            currentCourse.add(course);
            return true;
    }
}
