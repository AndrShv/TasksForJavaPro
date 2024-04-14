package Member;

public class Human implements Member {
    private String name;
    private int maxRunDistance;
    private int maxJumpHeight;
    private boolean disqualified;

    public Human(String name, int maxRunDistance, int maxJumpHeight) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
        this.disqualified = false;
    }

    @Override
    public void run(int distance) {
        if (!disqualified && distance <= maxRunDistance) {
            System.out.println("Participant " + name + " has run the distance of " + distance);
        } else {
            disqualified = true;
            System.out.println("Participant " + name + " is disqualified");
        }
    }

    @Override
    public void jump(int height) {
        if (!disqualified && height <= maxJumpHeight) {
            System.out.println("Participant " + name + " has jumped the height of " + height);
        } else {
            disqualified = true;
            System.out.println("Participant " + name + " is disqualified");
        }
    }

    @Override
    public boolean isDisqualified() {
        return disqualified;
    }

    @Override
    public String getName() {
        return name;
    }
}
