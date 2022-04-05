public class Dog extends Animal {

    @Override
    void makeSound() {
        System.out.println("Woof");
    }

    @Override
    public boolean eat(String foodType) {
        return true;
    }
}
