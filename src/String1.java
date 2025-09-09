import java.util.Scanner;

public class String1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
//        System.out.println(str1.substring(0, 4));
//        System.out.println(str1.length());
//        System.out.println(str1.toUpperCase());
        if (str1.compareTo(str2)>0) {
            System.out.println(str1.compareTo(str2)+"if");

        } else {
            System.out.println(str2.compareTo(str1)+"else");
        }
    }
}