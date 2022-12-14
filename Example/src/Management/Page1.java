package Management;

public class Page1 {
    public void SetData()
    {
        // ** 맴버 객체를 생성한다. 객체화 된것을 인스턴스(추상적)라고 한다(객체가 아님.). 객체는 실물화 된것.
        Member member = new Member();

        // ** 생성한 멤버 개체에 필드값을 셋팅한다.
        member.setAge(32);
        member.setUserName("홍길동");

        {
            // ** 멤버 객체와 has-a 관계인 Group class 를 생성한다. ★ 중요. 가지게 된것. is a
            Group group = new Group();
            // Group group = new Group();

            // ** 생성된 클래스의 필드값을 셋팅한다.
            group.set_class("K");
            group.setSubject("Java");

            // ** 값이 셋팅된 클래스를 멤버 클래스에 맵핑한다.
            member.setGroup(group);  // 그룹 값을 저장.
        }

        Singleton.getInstace().setMember(member);  // 맴버 객체 생성. 멤버 전달
    }


}
