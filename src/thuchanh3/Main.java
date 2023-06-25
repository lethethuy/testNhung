package thuchanh3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Kien", 30, "HD");
        Student student1 = new Student("Thuy", 26, "HN");
        Student student2 = new Student("Tra", 27, "ND");
        Student student3 = new Student("Nhung", 28, "HN");

        List<Student> lists = new ArrayList<>();
        lists.add(student);
        lists.add(student1);
        lists.add(student2);
        lists.add(student3);
        Collections.sort(lists);
        for (Student st:lists
             ) {
            System.out.println(st.toString());
        }
        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(lists,ageComparator);
        System.out.println("So sanh theo tuoi: ");
        for (Student st :lists
             ) {
            System.out.println(st.toString());
        }

    }
}
