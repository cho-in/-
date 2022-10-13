package extend;

public class Child extends Parent {

    // ↓ 한곳에 포함됨.
    int age;
    Child()
    {
        System.out.println("Child 생성");
    }
    int getAge(){
        return age;
    }
    // 같은 클래스 내에서 파라미터의 갯수나 형태에 따라 달라지는 경우.→ 오버 로딩
    // 클래스가 상속간에 이루어 질수 있는 함수의 재정의 → 오버라이딩은 파라미터의 갯수나 형태가 같아야 한다.

    void render()
    {
        //** 멤버 변수와 똑같은 이름의 지역변수를 선언.
        int age = 100; // 지역 변수.

        // ** super 키워드를 사용하여 부모클래스에 있는 변수에 접근 가능.
        // ** age 앞에 this. 를 붙혀주지 않는다면 지역변수를 사용하게 된다.
        System.out.println(super.name+ " : " + this.age);
    }
    void render(int num) // 파라미터
    {
        //** 멤버 변수와 똑같은 이름의 지역변수를 선언.
        System.out.println("입력한 값은" + num + "이고 정수입니다.");
    }

    void render(String str)
    {
        System.out.println("입력한 값은" + str + "이고 문자열입니다.");
    }


}
