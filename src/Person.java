import business.Company;

import java.time.LocalDate;

public class Person {
    private String firstName;
    private String lastName;
    private LocalDate dob;

    public void sayHello() {
        System.out.println("Hello");
    }

    public void saySomething(String message) {
        System.out.println(message);
    }
}
