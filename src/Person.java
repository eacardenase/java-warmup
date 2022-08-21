import java.time.LocalDate;

public class Person {
    private String firstName;
    private final String middleName = "Alexander";
    public String lastName;
    protected LocalDate dob;
    public static double PI = 3.14;
    public static int[] nums = initNums();

//    static {
//        nums = new int[5];
//        nums[0] = 1;
//        nums[1] = 2;
//        nums[2] = 3;
//        nums[3] = 4;
//    }

    public static int[] initNums() {
        int [] nums = new int[5];
        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 3;
        nums[3] = 4;

        return nums;
    }

    public void  sayHello() {
        System.out.println("Hello");
    }

    public void saySomething(String message) {
        System.out.println(message);
    }

    public char getMiddleInitial() { return middleName.charAt(0); }

    public void test(int num1, int num2, String... words) {
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(words);
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
        person.test(0, 1, "two", "three", "four");

        System.out.println(Person.usersList());
        System.out.println(PI);
        System.out.println(nums);
    }
}
