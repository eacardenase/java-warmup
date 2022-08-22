import java.time.LocalDate;

public class HelloWorld {
    public static void main(String[] args) {
        Person edwin = new Person("edwin", "alexander", "cardenas", LocalDate.of(1996, 3, 20));
        System.out.format("The person's first name is: %s.", edwin.getFirstName());
        edwin.setLastName("cardenas");
        System.out.format("The person's last name is: %s.", edwin.getLastName());
        System.out.format("The person's middle name is %s.", edwin.getMiddleName());
    }
}
