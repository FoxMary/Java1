package hw.hw1.courses;

import hw.hw1.members.Member;

public class Water extends Obstacle{

    public Water(int swimDist) {
        super.swimDist = swimDist;
    }

    @Override
    public void doIt(Member member) {
        if (member.isOnDistance()) {
            if (member.getSwimDistance() >= swimDist) {
                System.out.println(member.getName() + " swim: 🗸");
            } else {
                member.setOnDistance(false);
                System.out.println(member.getName() + "swim: ✗");
            }
        }
    }
}
