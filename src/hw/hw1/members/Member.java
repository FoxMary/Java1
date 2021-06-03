package hw.hw1.members;

public class Member {
    String name;
    int jumpHeight;
    int runDistance;
    int swimDistance;
    boolean isOnDistance;


    public Member(String name, int jumpHeight, int runDistance, int swimDistance) {
        this.name = name;
        this.jumpHeight = jumpHeight;
        this.runDistance = runDistance;
        this.swimDistance = swimDistance;
        isOnDistance = true;
    }

    public void setOnDistance(boolean onDistance) {
        isOnDistance = onDistance;
    }

    public String getName() {
        return name;
    }

    public int getJumpHeight() {
        return jumpHeight;
    }

    public int getRunDistance() {
        return runDistance;
    }

    public int getSwimDistance() {
        return swimDistance;
    }

    public boolean isOnDistance() {
        return isOnDistance;
    }

}
