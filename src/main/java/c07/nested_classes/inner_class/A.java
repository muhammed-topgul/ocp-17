package c07.nested_classes.inner_class;

/**
 * @author muhammed-topgul
 * @since 07/09/2023 20:56
 */
public class A {
    private int x = 10;

    class B {
        private int x = 20;

        class C {
            private int x = 30;

            public void allTheX() {
                System.out.println(x);        // 30
                System.out.println(this.x);   // 30
                System.out.println(B.this.x); // 20
                System.out.println(A.this.x); // 10
            }
        }
    }

    public static void main(String[] args) {
        A.B.C c = new A().new B().new C();
        c.allTheX();
    }
}
