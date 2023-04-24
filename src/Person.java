import business.Company;

import java.time.LocalDate;

public class Person {
    private String middleName = "Alexander";

    public void sayHello() {
        System.out.println("Hello");
    }

    public void saySomething(String message) {
        System.out.println(message);
    }

    public char getMiddleInitial() {
        return middleName.charAt(0);
    }

    public int add(int number1, int number2) {
        return number1 + number2;
    }

    public static void main(String[] args) {
        Person person = new Person();

        person.sayHello();
        person.saySomething("You are fully capable of deciding your own destiny.");
        person.saySomething("The question you face is:");
        person.saySomething("Which path will you choose?");

        System.out.println(person.getMiddleInitial());

        System.out.println(person.add(2, 5));
    }
}
