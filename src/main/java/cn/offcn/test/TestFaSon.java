package cn.offcn.test;

class Father{

    int i = 10;

    void set() {
        System.out.println("父类的方法");
    }

    void setted() {
        System.out.println("父类的方法");
    }
}

class Son extends Father{

    int i = 40;

    void set() {
        System.out.println("子类的方法");
    }

    void settedd(){
        System.out.println("子类的方法");
    }
}

public class TestFaSon {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Father f = new Father();
        Son s = new Son();
        Father ff = new Son();

        System.out.println(f.i);//10
        System.out.println(s.i);//40
        System.out.println(ff.i);//10
        System.out.println();
        //结论：子类，父类含有相同的成员变量，数值看引用型变量所属的类，即左边

        f.set();//输出：父类的方法；结论：同名方法，父类对象调用的是父类方法
        s.set();//输出：子类的方法；结论：同名方法，子类对象调用的是子类方法

        ff.set();//输出：子类的方法；结论：对于这种'父类　实例 = new 子类（）'，同名方法调用的是子类方法
        ff.setted();//输出：父类的方法；结论：可以调用父类中独有的方法
//      ff.settedd();//wrong；结论：结论：不可以调用子类中独有的方法

//      f.settedd()//wrong；结论：结论：父类对象可以调用子类中独有的方法
        s.setted();//输出：父类的方法；结论：子类对象可以调用父类中独有的方法

    }
}