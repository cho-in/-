package Example;

public class ExtendMain {

    public static void main(String[] args) {

        Object[] objects = new Object[5];

        int index = 0;

        objects[index] = new Teacher();
        objects[index].index = index;
        objects[index].name = "이승석";
        objects[index].age = 38;
        objects[index]._class = "K_강의장";
        ++index;

        objects[index] = new Student();
        objects[index].index = index;
        objects[index].name = "이몽룡";
        objects[index].age = 35;
        objects[index]._class = "K_강의장";
        ++index;

        objects[index] = new Student();
        objects[index].index = index;
        objects[index].name = "임꺽정";
        objects[index].age = 40;
        objects[index]._class = "K_강의장";
        ++index;

        objects[index] = new Student();
        objects[index].index = index;
        objects[index].name = "성춘향";
        objects[index].age = 28;
        objects[index]._class = "K_강의장";
        ++index;

            for(int i =0 ;i< objects.length; ++i)
            objects[i].render();

        Teacher tchs = new Teacher();
        Student[] stds = new Student[];



        /*
        Object std1 = new Student();

        std1.index = 1;
        std1.name = "홍길동";
        std1.age =32;
        std1._class ="k 강의실";


        Object tch = new Teacher();

        tch.index = 0;
        tch.name = "고길동";
        tch.age =48;
        tch._class ="k_강의실";

        tch.render();
        std1.render();
    }
     */
}

