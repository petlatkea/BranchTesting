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
}
