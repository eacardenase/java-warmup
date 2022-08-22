import java.time.LocalDate;

public class Person {
    private String firstName;
    private String middleName;
    private String lastName;
    private LocalDate dob;

    private Person() {
    }

    public Person(String firstName, String middleName, String lastName, LocalDate dob) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName.substring(0, 1).toUpperCase() + middleName.substring(1);
        this.dob = dob;
    }

    public String getFirstName() {
        return this.firstName.substring(0, 1).toUpperCase() + this.firstName.substring(1);
    }

    public void setFirstName(String name) {
        this.firstName = name;
    }

    public String getMiddleName() {
        return this.middleName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1);
    }

    public static void main(String[] args) {

    }
}
