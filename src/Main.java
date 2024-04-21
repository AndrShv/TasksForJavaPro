public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.run(400);
        dog.swim(5);

        cat.run(150);
        cat.swim(3);

        System.out.println("Total number of animals: " + Animal.animalCount);
        System.out.println("Total number of dogs: " + Dog.dogCount);
        System.out.println("Total number of cats: " + Cat.catCount);
    }
}
