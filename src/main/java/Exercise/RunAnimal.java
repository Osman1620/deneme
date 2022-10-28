package Exercise;

public class RunAnimal {

    public static void main(String[] args) {
        Animal a;
        a=new Dog();
        a.eat();
        a=new Cat();
        a.eat();
    }
}
