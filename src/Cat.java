public class Cat extends Animal{

    @Override
    void makeSound() {
        System.out.println("Miav");
    }

    @Override
    public boolean eat(String foodType) {
        return true;
    }

    @Override
    public void showMood(Boolean mood) {
        if (mood == true)
            System.out.println(name + " is content and purring");
        else
            System.out.println(name + " hisses at you");
    }
}
