package TestcaseA;

public class TestcaseMain {

    public static void main(String[] args) {

        ObjectA objA = new ObjectA("A");   // 초기화. new 무조건 다른것.
        ObjectB objB = new ObjectB("B");

        objA.getNode().getNode();   // A->B->A 각자 서로 다르다. 참조만 할뿐이다.

        /*
        System.out.println(objA.getName());
        System.out.println(objA.getNode().getName());

        System.out.println(objB.getName());
        System.out.println(objB.getNode().getName());*/

        Object obj = new Object();

        obj.setName("홍길동").setAge(34).getName();

        obj.setNode(
                ( new Object()).setName("임꺽정")
                        .setAge(28).setNode(
                                (new Object().setName("이몽룡"))
                                        .setAge(20))
        );

        System.out.println(obj.getNode().getName());

    }

}
