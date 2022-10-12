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

    public void render()
    {
        System.out.println("");
    }

}
