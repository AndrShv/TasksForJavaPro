public class Dog extends Animal {
    static int dogCount = 0;

    Dog(){
        dogCount++;
    }
    @Override
    void run(int runningDistance) {
        int DogsMaxRunningDistance = 500;
        if (runningDistance <= DogsMaxRunningDistance) {
            System.out.println("Dog is running " + runningDistance + " meters");
        } else {
            System.out.println("Dog can not run " + runningDistance + " meters, max running distance is " + DogsMaxRunningDistance + " meters");
        }
    }
    @Override
    void swim(int swimmingDistance) {
        int DogsMaxSwimmingDistance = 10;
        if (swimmingDistance < DogsMaxSwimmingDistance) {
            System.out.println("Dog is swimming " + swimmingDistance + " meters");
        } else {
            System.out.println("Dog can not swim " + swimmingDistance + " meters, max swimming distance is " + DogsMaxSwimmingDistance + " meters");
        }
    }
}
