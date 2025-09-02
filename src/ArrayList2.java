import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayList2 {
    public static void main(String[] args) {
        ArrayList<String> products = new ArrayList<>();
        System.out.println("Enter the number of Products");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            products.add(sc.next());
        }
        Collections.sort(products);
        Iterator It = products.iterator();

        while(It.hasNext()){
            System.out.println(It.next());
        }
        products.add(1,"Apple");
        products.add(2,"Orange");
        products.add(3,"Banana");
        System.out.println(products.get(2));
    }
}
