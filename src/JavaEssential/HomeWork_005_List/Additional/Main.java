package JavaEssential.HomeWork_005_List.Additional;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        String prototypeTeacher = "Teacher # ";

        int badTeacherIndex = new Random().nextInt(10);
        int goodTeacherIndex = new Random().nextInt(10);

        ArrayList<String> teachersList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            teachersList.add(prototypeTeacher + i);
            if (i == badTeacherIndex){
                System.out.println("Bad teacher got index: " + badTeacherIndex + " - "+ teachersList.get(i));
            }
            if (i == goodTeacherIndex){
                System.out.println("Good teacher got index: " + goodTeacherIndex + " - "+ teachersList.get(i));
            }

        }
    }
}
