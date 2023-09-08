package c07.polymorphism.overriding_vs_hiding;

/**
 * @author muhammed-topgul
 * @since 08/09/2023 12:37
 */
class Parent {
    protected int age = 2;

    public static boolean isBiped() {
        return false;
    }
}

public class Child extends Parent {
    protected int age = 6;

    public static boolean isBiped() {
        return true;
    }

    public static void main(String[] args) {
        Child child = new Child();
        Parent parent = child;
        System.out.println(child.isBiped());
        System.out.println(parent.isBiped());
        System.out.println(child.age);
        System.out.println(parent.age);
    }
}
