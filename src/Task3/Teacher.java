package Task3;

import java.util.ArrayList;

public class Teacher extends Person {

    ArrayList <String> canTeach;
    ArrayList<String> currentCourse = new ArrayList<>();


    public Teacher(String name, ArrayList<String> canTeach) {
        super(name);
        this.canTeach = canTeach;

    }

    @Override
    public boolean addCourse(String course) {
        if (canTeach.contains(course)) {
            currentCourse.add(course);
            return true;
        } else
            System.out.println(name + " can't teach this course");
            return false;
    }
}
