import java.time.LocalDate;

public class Person {
    public void  sayHello() {
        System.out.println("Hello");
    }

    public void saySomething(String message) {
        System.out.println(message);
    }

    public void test(int num1, int num2, String... words) {
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(words);
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.sayHello();
        person.saySomething("I'm happy learning Java!");
        person.test(0, 1, "two", "three", "four");
    }
}
