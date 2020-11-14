package cn.offcn.test;

public class duotaiTest {
    public static void main(String[] args) {

        A a1 = new A();
        A a2 = new B();
        B b = new B();
        C c = new C();
        D d = new D();

        System.out.println("1:" + a1.show(b));//bb
        System.out.println("2:" + a1.show(c));//aa
        System.out.println("3:" + a1.show(d));
        System.out.println("4:" + a2.show(b));
        System.out.println("5:" + a2.show(c));
        System.out.println("6:" + a2.show(d));
        System.out.println("7:" + b.show(b));
        System.out.println("8:" + b.show(c));
        System.out.println("9:" + b.show(d));

    }
}
class A {
    public String show(D obj) {
        return ("A 方法中的 D");
    }

    public String show(A obj) {
        return ("A 方法中的 A");
    }
}

class B extends A {
    // B可以重写A
    public String show(B obj) {
        return ("B 方法中的 B");
    }

    // 重写A方法了吗？
    public String show(A obj) {
        return ("B 方法中的 A");
    }
}

class C extends B {
}

class D extends B {
}
