public class Cat extends Animal {
    static int catCount = 0;

    Cat(){
        catCount++;
    }
    @Override
    void run(int runningDistance) {
        int catsMaxRunningDistance = 200;
        if (runningDistance < catsMaxRunningDistance) {
            System.out.println("Cat is running " + runningDistance + " meters");
        } else {
            System.out.println("Cat can not run " + runningDistance + " meters, max running distance is " + catsMaxRunningDistance + " meters");
        }
    }
    @Override
    void swim(int swimmingDistance) {
        System.out.println("Cat can not swim");
    }
}
