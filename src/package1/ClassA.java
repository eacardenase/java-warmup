package package1;

import package2.ClassB;

public class ClassA {
    public static void main(String[] args) {
        ClassB classB = new ClassB();

        classB.publicMethod();
//        classB.privateMethod(); // java: privateMethod() has private access in package2.ClassB
//        classB.protectedMethod(); // java: protectedMethod() has protected access in package2.ClassB
//        classB.packageProtected(); // java: packageProtected() is not public in package2.ClassB; cannot be accessed from outside package
    }
}
