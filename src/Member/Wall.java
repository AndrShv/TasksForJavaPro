package Member;
public class Wall implements Barrier {
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public void overcome(Member member) {
        member.jump(height);
    }

}
