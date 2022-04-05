public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Mr. Miav");
        Dog dog = new Dog("Vuffer");

        cat.makeSound();
        dog.makeSound();

        cat.eat("fish");
        dog.eat("dogfood");

        cat.showMood(true);
        dog.showMood(false);

    }
}
