class Mohan{
    void fun1(){
        System.out.println("The quick brown fox jumps over the lazy dog - 6");
    }
    void fun(){
        System.out.println("the quick brown fox jumps over the lazy dog - 5");
    }
}
public class JavaFirstProgram {
    public static void main(String[] args) {
        System.out.println("The quick brown fox jumps over the lazy dog");
        System.out.println("The quick brown fox jumps over the lazy dog");
        System.out.println("The quick brown fox jumps over the lazy dog");
        System.out.println("The quick brown fox jumps over the lazy dog");

        Mohan moh = new Mohan();
        moh.fun();
        moh.fun1();
    }
}
