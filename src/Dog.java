public class Dog extends Animal {

    @Override
    void makeSound() {
        System.out.println("Woof");
    }

    @Override
    public boolean eat(String foodType) {
        return true;
    }

    @Override
    public void showMood(Boolean mood) {
        if (mood == true)
            System.out.println(name + " wagging it's tail and is happy");
        else
            System.out.println(name + " growls at you");
    }
}
