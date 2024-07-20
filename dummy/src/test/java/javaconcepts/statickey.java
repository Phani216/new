package javaconcepts;

public class statickey {

    int i = 1;
    static int j = 2;

    void a(int x) {
        System.out.println(x);
    }

    static void b(int y) {
        System.out.println(y);
    }

    public static void main(String[] args) {
        statickey sk = new statickey();
        sk.a(2);
        statickey.b(6);
        System.out.println(sk.i);
        System.out.println(statickey.j);
        class2 c = new class2();
        System.out.println(c.i);
        class2.d(4);
        System.out.println(class2.j);

    }
}
    class class2{
        int i=1;
        static int  j=2;
        void c() {
            System.out.println("hi");
        }

            static void d(int x){
                System.out.println(x);
        }
}

