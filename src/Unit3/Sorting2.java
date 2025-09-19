package Unit3;

import java.util.ArrayList;
import java.util.Collections;

public class Sorting2 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student(20,"Abhi",100));
        list.add(new Student(21,"Harsh",101));
        list.add(new Student(22,"Barho",102));
        list.add(new Student(23,"Ram",103));
        list.add(new Student(24,"Kunal",104));
        list.add(new Student(25,"Rahul",105));
        Collections.sort(list);
        for(Student s:list){
            System.out.println(s.name+" "+s.age+" "+s.roll_no);

        }
    }

}
