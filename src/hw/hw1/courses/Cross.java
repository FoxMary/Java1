package hw.hw1.courses;

import hw.hw1.members.Member;

public class Cross extends Obstacle{

    public Cross(int runDist) {
        super.runDist = runDist;
    }

    @Override
    public void doIt(Member member) {
        if (member.isOnDistance()) {
            if (member.getRunDistance() >= runDist) {
                System.out.println(member.getName() + " run: 🗸");
            } else {
                member.setOnDistance(false);
                System.out.println(member.getName() + "run: ✗");
            }
        }
    }
}
