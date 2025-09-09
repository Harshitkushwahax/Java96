import java.util.Vector;

public class Vector1 {
    public static void main(String[] args) {
        Vector<String> vc=new Vector<>(3,5);
        vc.add("First");
        vc.add("Second");
        vc.add("Third");
        vc.add("Fourth");
        System.out.println(vc.capacity());
        System.out.println(vc.size());
    }
}
