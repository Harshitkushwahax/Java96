public class MynewException {
    public static void main(String[] args) {
        UserDefineException udf = new UserDefineException();
        try{
            udf.validate(12);
        }
        catch ( InvalidAgeException e ){
            System.out.println(e.getMessage());
        }
    }
}
