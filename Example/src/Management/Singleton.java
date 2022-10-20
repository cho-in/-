package Management;

public class Singleton {
    static private Singleton instance = null;

    static public Singleton getInstace()
    {
        if(instance == null)
            instance = new Singleton(); // 클래스
        return instance;
    }

    private Member member;

    public Member getMember() {return member;}

    public void setMember(Member member) {
        this.member = member;}

    private Singleton() {};
}
