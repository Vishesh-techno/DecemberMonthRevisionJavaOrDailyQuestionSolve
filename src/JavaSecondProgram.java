class A{
    private static int y;
    void f1(){
        y = 100;
    }
    void f2(){
        System.out.println("y: " + y);
    }
}
public class JavaSecondProgram {
    public static void main(String[] args) {
        A newA = new A();
        newA.f1();
        newA.f2();
    }
}
