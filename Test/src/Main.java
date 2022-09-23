public class Main {
    public static void main(String[] args) {
        // 주석 : 컴퓨터가 인식하지 못하는 영역.
        /*
        여러줄의 영역을 인식하지 못하게 해야할 경우에 사용한다.
         */
        // ** 변수 : 값이 언제든지 변경 가능한 수.
        // ** 상수 : 값이 변경이 불가능한 수.

        // ** lvalue 변수 = rvalue 상수.
        int number;  // ** 변수 선언.

        number = 10; // ** 변수 초기화.

        int num = 100; // ** 변수 선언 및 초기화.

        // ** 출력
        System.out.println(number);
        System.out.println(num);
        // ** 값 변경
        number = 20;
        num = 200;
        // ** 출력
        System.out.println(number);
        System.out.println(num);

        // =====================================
        // [자료형]
        // =====================================

        /*
        * [정수형 datatype]
        * char : 문자를 표현할때 사용한다. 2byte

        * 숫자
        * byte : 1byte
        * short : 2byte
        * int : 4byte
        * long : 8byte

        * [실수형 datatype]
        * float : 4byte
        * double : 8byte

        * [논리형 datatype]
        * boolean : 1byte
        */


    }
}