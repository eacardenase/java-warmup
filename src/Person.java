public class Person {
    private String middleName = "Alexander";
    public static double PI = 3.14; // shared between all the instances
    public static int[] nums = initNums();

    public static int[] initNums() {
        int[] nums = new int[5];

        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 3;
        nums[3] = 4;
        nums[4] = 5;

        return  nums;
    }

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

    public void test(int number1, int number2, String[] words) {
        // do something with words
    }

    // varargs
    public void test2(int number1, int number2, String... words) {
        // do something with words
        System.out.println(words.length);
    }

    public static void main(String[] args) {
        Person person = new Person();

        person.sayHello();
        person.saySomething("You are fully capable of deciding your own destiny.");
        person.saySomething("The question you face is:");
        person.saySomething("Which path will you choose?");

        System.out.println(person.getMiddleInitial());
        System.out.println(person.add(2, 5));

        String[] words = new String[] {"one", "two", "three"};
        person.test(3, 5, words);

        person.test2(3, 5, "one", "two", "three");

        System.out.println(Person.PI);
        System.out.println(PI);
    }
}
