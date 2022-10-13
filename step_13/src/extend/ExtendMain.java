package extend;

public class ExtendMain {
    public static void main(String[] args)
    {
        // Parent p = new Parent();

        // p.str1 = "홍길동";
        //p.str2 = "임꺽정";
        //p.str3 = "이몽룡";
        // c.str1 = "철수";
        // c.str2 = "영희";
        // c.str3 = "민수";

        //p.renderHong();
        //pp.renderLee();
        //pp.renderLim();

        // c.render();
        // c.renderHong();
        // c.renderLee();
        // c.renderLim();


        //System.out.println();
        //System.out.println();
        //System.out.println();


        Child c = new Child();

        c.name = "홍길동";
        c.age = 32;

        c.render(10);
        c.render("임꺽정");
        //System.out.println(c.name + " : " + c.age);


    }
}
