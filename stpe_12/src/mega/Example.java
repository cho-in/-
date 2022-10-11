package mega;

public class Example {
    String name;
    int age;  // 멤버변수


    Example()
    {
        name = "";
        age = 0;
        // **  생성자.
        // ** 클래스가 생성됨과 동시에 (생성직후) 호출된다.
    }


    Example(String name,int age)  // 지역변수.
    {
        this.age = age;
        this.name = name;
        // ** 복사 생성자.
        // ** 사용자가 호출한 시점에 호출된다.
    }

    void output()
    {
        System.out.println(name + ": "+ age);
    }

}
