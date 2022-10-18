package Management;

public class ManagementMain {

    public static void main(String[] args) {
        Member member = new Member();
        member.setAge(32);
        member.setUserName("홍길동");


        String name = member.getUserName();
        int age = member.getAge();

        System.out.println(name + " : " + age);

    }

}
