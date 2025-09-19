package Unit3;


import java.util.ArrayList;
import java.util.Collections;
public class Sorting1 {
    public Sorting1() {
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(0);
        list.add(-12);
        list.add(5);

        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);

    }
}
