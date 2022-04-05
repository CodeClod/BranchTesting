public class Main {
    public static void main(String[] args) {
        Dog lassie = new Dog();
        Cat kuro = new Cat();

        kuro.name = "Kuro";
        lassie.name = "Lassie";
        kuro.makeSound();
        lassie.makeSound();

        kuro.eat("Fish");
        lassie.eat("Steak");

        kuro.showMood(true);
        lassie.showMood(false);
    }
}
