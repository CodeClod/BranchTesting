public class Main {
    public static void main(String[] args) {
        Dog lassie = new Dog();
        Cat kuro = new Cat();

        kuro.name = "kuro";

        kuro.makeSound();
        lassie.makeSound();

        kuro.eat("Fish");
        lassie.eat("Steak");
    }
}
