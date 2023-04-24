package package2;

public class OtherClass {
    public void method1() {
        ClassB classB = new ClassB();

//        classB.privateMethod(); // java: privateMethod() has private access in package2.ClassB
        classB.protectedMethod();
        classB.packageProtected();
    }
}
