package Unit1;

public class MyPerson {
    public static void main(String[] args) {
        Person p=new Person("Ghaziabad");
        p.getAddress();
    }

    public static class SchoolStudent extends Person {
        public String course;

        public SchoolStudent(String address, String course) {
            super(address);
            this.course = course;
        }
        public void getCourse(){
            System.out.println("Course is "+course);
        }
    } }


