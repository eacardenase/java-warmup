import java.time.LocalDate;

public class Person {
    private final String middleName = "Alexander";

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
        person.sayHello();
        System.out.println(person.getMiddleInitial());
        person.saySomething("I'm happy learning Java!");
    }
}
