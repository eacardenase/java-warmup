import java.time.LocalDate;

public class Person {
    private String firstName;
    private String lastName;
    private LocalDate dob;

//    public Person() {
//    }

    private Person() {
    }

    public Person(String firstName, String lastName, LocalDate dob) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public static void main(String[] args) {

    }
}
