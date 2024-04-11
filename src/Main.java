public class Main {
    public static void main(String[] args) {
        int DogsMaxRunningDistance = 500;
        int DogsMaxSwimmingDistance = 10;
        int CatsMaxRunningDistance = 200;

         class Animal {
            void run(int runningDistance) {

            }

            void swim(int swimmingDistance) {

            }

            static int animalCount = 0;

            Animal() {
                animalCount++;
            }
        }

        class Dog extends Animal {
            static int dogCount = 0;

            Dog(){
                dogCount++;
            }
            @Override
            void run(int runningDistance) {
                if (runningDistance <= DogsMaxRunningDistance) {
                    System.out.println("Dog is running " + runningDistance + " meters");
                } else {
                    System.out.println("Dog can not run " + runningDistance + " meters, max running distance is " + DogsMaxRunningDistance + " meters");
                }
            }
            @Override
            void swim(int swimmingDistance) {
                if (swimmingDistance < DogsMaxSwimmingDistance) {
                    System.out.println("Dog is swimming " + swimmingDistance + " meters");
                } else {
                    System.out.println("Dog can not swim " + swimmingDistance + " meters, max swimming distance is " + DogsMaxSwimmingDistance + " meters");
                }
            }
        }

        class Cat extends Animal {
            static int catCount = 0;

            Cat(){
                catCount++;
            }
            @Override
            void run(int runningDistance) {
                if (runningDistance < CatsMaxRunningDistance) {
                    System.out.println("Cat is running " + runningDistance + " meters");
                } else {
                    System.out.println("Cat can not run " + runningDistance + " meters, max running distance is " + CatsMaxRunningDistance + " meters");
                }
            }
            @Override
            void swim(int swimmingDistance) {
                System.out.println("Cat can not swim");
            }
        }

        Dog dog = new Dog();
        Dog dog2 = new Dog();
        dog.run(100);
        dog.swim(100);

        Cat cat = new Cat();
        cat.run(100);
        cat.swim(100);






        System.out.println("Total animals: " + Animal.animalCount);
        System.out.println("Total dogs: " + Dog.dogCount);
        System.out.println("Total cats: " + Cat.catCount);
    }
}
