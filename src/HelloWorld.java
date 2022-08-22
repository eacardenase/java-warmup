import java.time.LocalDate;

public class HelloWorld {
    public static void main(String[] args) {
        Person edwin = new Person("Edwin", "Cardenas", LocalDate.of(1996, 3, 20));
//        Person ana = new Person(); error
        System.out.println(edwin.getFirstName());
    }
}
