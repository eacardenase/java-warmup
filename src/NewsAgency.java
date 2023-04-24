import business.Company;

import java.time.LocalDate;

class NewsAgency {
    Company company;
    String name;

    public void accessMethod() {
        Person person = new Person();

        person.lastName = "Cardenas";
        // it's available because both NewsAgency and
        // Person classes ar both in the same package (default)
        person.dob = LocalDate.now();
    }
}
