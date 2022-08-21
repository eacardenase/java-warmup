import java.time.LocalDate;

public class Person {
    public void  sayHello() {
        System.out.println("Hello");
    }

    public void saySomething(String message) {
        System.out.println(message);
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.sayHello();
        person.saySomething("I'm happy learning Java!");
    }
}
