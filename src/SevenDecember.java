abstract class Animal{
    abstract void sound();
    void sleep(){
        System.out.println("Animal is sleeping...");
    }
}
class Dog extends Animal{
    @Override
    void sound() {
        System.out.println("Dog Barks");
    }
}
class Cat extends Animal{
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}
public class SevenDecember {
    public static void main(String[] args) {
        Animal a1 = new Dog();
        Animal a2 = new Cat();

        a1.sleep();
        a1.sound();

        a2.sleep();
        a2.sound();
    }
}
