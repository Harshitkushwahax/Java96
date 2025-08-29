import java.io.DataInputStream;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.InputMismatchException;
public class MyException {
    public static void main(String[] args) throws IOException {
        int x, y, z = 0;
        DataInputStream dis = new DataInputStream(System.in);
        Scanner sc = new Scanner(System.in);
//        try {
            x = dis.readInt();
            y = dis.readInt();
//            x=sc.nextInt();
//            y=sc.nextInt();
            z = x / y;
            System.out.println("Exception not allowed");
//        }
//        catch(Exception e) {
//            System.out.println(e.getMessage());
//        }
//        catch(ArithmeticException e){
//           System.out.println(e.getMessage());
//
//       }
//        catch(InputMismatchException e){
//            System.out.println(e.getMessage());
//      }
//        finally{
//            System.out.println("result is "+z);
//        }
//
//    }
    }
}
