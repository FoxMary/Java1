package hw.hw1.courses;

import hw.hw1.members.Member;

public class Wall extends Obstacle{

    public Wall(int wallHeight) {
        super.wallHeight = wallHeight;
    }

    @Override
    public void doIt(Member member) {
        if (member.isOnDistance()) {
            if (member.getJumpHeight() >= wallHeight) {
                System.out.println(member.getName() + " jump: 🗸");
            } else {
                member.setOnDistance(false);
                System.out.println(member.getName() + "jump: ✗");
            }
        }
    }
}
