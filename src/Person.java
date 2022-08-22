import java.time.LocalDate;

public class Person {
    private String firstName;
    private String middleName = "Alexander";
    public String lastName;
    protected LocalDate dob;

    public void  sayHello() {
        System.out.println("Hello");
    }

    public void saySomething(String message) {
        System.out.println(message);
    }

    public char getMiddleInitial() { return middleName.charAt(0); }

    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public static String[] usersList() {
        String[] users = new String[] {"user1", "user2"};
        return users;
    }

    public static void main(String[] args) {
        Person person = new Person();

        person.firstName = "Jake"; // main() method is member of the class
        person.lastName = "Smith";

        person.sayHello();
        System.out.println(person.getMiddleInitial());
        person.saySomething("I'm happy learning Java!");
    }
}
