package package2;

public class OtherClass {
    public void method1() {
        ClassB classB = new ClassB();
//        classB.privateMethod(); privateMethod() has private access in package2.ClassB
        classB.protectedMethod(); // it's visible because OtherClass is in the same package as Class B
        classB.packageProtected();

    }
}
