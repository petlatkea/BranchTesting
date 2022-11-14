public class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Miav ...");
    }

    @Override
    public boolean eat(String foodType) {
        return true;
    }

    @Override
    public void showMood(boolean mood) {
        if(mood == true) {
            System.out.println("Spinder");
        } else if(mood == false) {
            System.out.println("Hvæser");
        }
    }
}
