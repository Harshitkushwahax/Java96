package Unit3;

import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class PropertyClass {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("C:\\Users\\Asus\\Desktop\\KIETOOPS\\kietoops\\src\\Unit3\\db.properties");
            Properties prop = new Properties();
            prop.load(fr);
            Set s = prop.entrySet();
            Iterator it = s.iterator();
            while(it.hasNext()){
//                System.out.println(it.next());
                Map.Entry entry = (Map.Entry) it.next();
                System.out.println(entry.getKey() + " " + entry.getValue());
            }

//            System.out.println(prop.getProperty("user"));
//            System.out.println(prop.getProperty("coupon"));
        } catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}