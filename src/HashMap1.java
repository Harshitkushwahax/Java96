import java.util.*;


public class HashMap1 {
    public static void main(String[] args) {

//        for(int i=0;i<n ;i++){
//            String key = sc.next();
//            int val= sc.nextInt();
//            hs.put(key,val);
//        }
//        for(String key:hs.keySet()){
//            System.out.println(key+":"+hs.get(key));
//        }



                Scanner sc = new Scanner(System.in);
                HashMap<String,Integer> hs = new HashMap<>();
                int n = sc.nextInt();
                sc.nextLine(); // <-- consume the leftover newline

                for (int i = 0; i < n; i++) {
                    String[] word = sc.nextLine().split(" ");
                    String query = word[0];
                    String key = word[1];

                    if (query.equals("add")) {
                        hs.put(key, hs.getOrDefault(key, 0) + 1);
                    }
                    else if (query.equals("count")) {
                        System.out.println(hs.getOrDefault(key, 0));
                    }
                    else if (query.equals("remove")) {
                        if (hs.containsKey(key)) {
                            if (hs.get(key) > 1)
                                hs.put(key, hs.get(key) - 1);
                            else
                                hs.remove(key);
                        }
                    }
                }
            }
        }

