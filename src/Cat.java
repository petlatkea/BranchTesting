public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Miav");
    }

    @Override
    public boolean eat(String foodType) {
        return true;
    }

    public void showMood(boolean mood) {
        if(mood) {
            System.out.println("spinder");
        } else {
            System.out.println("hvæser");
        }
    }
}
