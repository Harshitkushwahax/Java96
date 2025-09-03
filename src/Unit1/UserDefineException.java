package Unit1;

public class UserDefineException {
    public void validate(int age) throws InvalidAgeException {
        if (age<18) {
            throw new InvalidAgeException("Cannot caste vote,Age less than 18");
        }
        else{
            System.out.println("Eligible for Vote");
        }
    }
}
