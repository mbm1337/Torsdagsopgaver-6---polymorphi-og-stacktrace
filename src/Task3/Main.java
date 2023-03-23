package Task3;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> canTeachSigne = new ArrayList<>();
        ArrayList<String> canTeachTess = new ArrayList<>();

        ArrayList<String> passedCourseJens = new ArrayList<>();
        ArrayList<String> passedCourseKim = new ArrayList<>();
        ArrayList<String> passedCourseLars = new ArrayList<>();


        Teacher t1 = new Teacher("Signe",canTeachSigne);
        Teacher t2 = new Teacher("Tess",canTeachTess);

        Student s1 = new Student("Jens",passedCourseJens);
        Student s2 = new Student("Kim",passedCourseKim);
        Student s3 = new Student("Lars",passedCourseLars);


        ArrayList<Object> persons = new ArrayList<>();
        persons.add(t1);
        persons.add(t2);
        persons.add(s1);
        persons.add(s2);
        persons.add(s3);

        canTeachTess.add("Java 1.0");
        passedCourseKim.add("Java 1.0");
        passedCourseLars.add("Java 1.0");

        for(Object o  : persons ){
            if (o instanceof Person){
                ((Person) o).addCourse("Java 1.0");
            }
        }

    }
}
