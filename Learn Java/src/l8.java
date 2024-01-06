class A{
    public int harish(){
        return 4;
    }
    public void meth2(){
        System.out.println("i am method 2 of class A");
    }
}
class B extends A{
    @override
    public void meth2(){
        System.out.println("i am method 2 of class B");
    }
    public void meth3(){
        System.out.println("i am method 3 of class B");
    }
}
public class l8 {
    void method() {
        System.out.println("joke!");
    }
    public static void main(String[] args) {
        // method overriding
        A a = new A();
        a.meth2();

        B b = new B();
        b.meth2();
        A obj = new B();
        obj.meth2();

    }
}
