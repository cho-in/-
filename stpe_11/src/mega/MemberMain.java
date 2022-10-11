package mega;

public class MemberMain {



    public static void main(String[] args)
    {
        // ===============================
        // [메모리 구조 확인]
        // ================================
        Member m = new Member();
        Member m2 = new Member();

        if(m == m2)
            System.out.println("같다");
        else
            System.out.println("다르다");

        String str1 = "홍길동";
        String str2 = "홍길동";

        if(str1 == str2)
            System.out.println("같다");
        else
            System.out.println("다르다");

        // ==============================
        // [객체를 배열로 사용.]
        // ==============================

        Member[] mArray = new Member[5];

        mArray[0] = new Member();
        mArray[0].setId("key1");

        mArray[1] = new Member();
        mArray[1].setId("key2");

        mArray[2] = new Member();
        mArray[2].setId("key3");

        mArray[3] = new Member();
        mArray[3].setId("key4");

        mArray[4] = new Member();
        mArray[4].setId("key5");

        for(Member element : mArray)
        {
            String str = element.getId();
            System.out.println(str);
        }

    }
}
