package hw.hw1;

import hw.hw1.courses.*;
import hw.hw1.members.*;

public class Main {
    public static void main(String[] args) {
        Team team = new Team("Crowns",
                new Human("Bob", 1, 10000, 200),
                new Dog("Baster", 2, 30000, 500),
                new Cat("Felix", 2, 5000,0));
        Course courses = new Course(new Cross(2000), new Wall(2), new Water(200));


        team.teamInfo();
        team.result();
        courses.start(team);
        //team.result();

    }
}
