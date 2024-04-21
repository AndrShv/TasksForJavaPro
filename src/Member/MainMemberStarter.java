package Member;

import java.util.ArrayList;
import java.util.List;

public class MainMemberStarter {
    public static void main(String[] args) {
        List<Member> members = new ArrayList<>();
        members.add(new Human("John", 200, 2));
        members.add(new Human("Alice", 150, 1));
        members.add(new Human("Bob", 250, 3));

        List<Barrier> barriers = new ArrayList<>();
        barriers.add(new RunningTrack(100));
        barriers.add(new Wall(2));
        barriers.add(new RunningTrack(200));
        barriers.add(new Wall(3));

        for (Member member: members) {
            for (Barrier barrier : barriers) {
                if (!member.isDisqualified()) {
                    barrier.overcome(member);
                } else {
                    break;
                }
            }
        }
    }
}
