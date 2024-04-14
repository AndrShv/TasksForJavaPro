package Member;

public class RunningTrack implements Barrier {
    private int length;

    public RunningTrack(int length) {
        this.length = length;
    }

    @Override
    public void overcome(Member member) {
        member.run(length);

    }
}
