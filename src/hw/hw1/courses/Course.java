package hw.hw1.courses;

import hw.hw1.members.Team;

public class Course {       //полоса препятствий
    Obstacle[] obstacles;

    public Course(Obstacle... obstacles) {
        this.obstacles = obstacles;
    }

    public void start(Team team){               //прохождение полосы препятствий командой
        System.out.println("Start marathon:");
        for (Obstacle obstacle : obstacles){
            for (int i = 0; i < team.getMembers().length; i++){
                obstacle.doIt(team.getMembers()[i]);
            }
        }
        System.out.println("\n Winners: ");
        for (int i = 0; i < team.getMembers().length; i++) {
            if (team.getMembers()[i].isOnDistance()){
                System.out.println(team.getMembers()[i].getName());
            }
        }
    }
}
