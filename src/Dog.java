public class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Vuf!");
    }

    @Override
    public boolean eat(String foodType) {
        return true;
    }

    public void showMood(boolean mood) {
        if(mood == true) {
            System.out.println("Logrer");
        } else if(mood == false) {
            System.out.println("Knurrer");
        }
    }
}
