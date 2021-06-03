package hw.hw1.members;

public class Team {
    String teamName;
    Member[] members;

    public Team(String teamName, Member... members) {
        this.teamName = teamName;
        this.members = members;
    }

    public Member[] getMembers() {
        return members;
    }

    public void teamInfo(){
        System.out.println("Team '" + teamName + "': ");
        for (Member member : members) {
            System.out.println(member.name + " (" + member.getClass().getSimpleName() + "): " + "\n record jump height: " + member.jumpHeight + "m" + "\n record run distance: " + member.runDistance + "km" + "\n record swim distance: " + member.swimDistance + "m");
            if (member.isOnDistance) {
                System.out.println("Participates in the marathon");
            } else {
                System.out.println("Retired");
            }
        }
    }
    public void result() {
        System.out.println("Team '" + teamName + "': ");
        for (Member member : members) {
            if (member.isOnDistance) {
                System.out.println(member.name + ": 🗸");
            } else {
                System.out.println(member.name + ": ✗");
            }
        }
    }
}
