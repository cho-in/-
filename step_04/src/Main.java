public class Main {
    public static void main(String[] args) {

        String str = "ABC";
        // ================
        // 1. char = 정수형이다.
        // 2. 각각의 데이터 타입의 형태로 출력됨.
        // * int 형 타입에 문자로 초기화를 진행 하더라도
        // 출력할 때에는 정수를 출력하고 , char 타입에
        // 정수로 초기화를 하더라도 출력할 때에는 문자가 출력된다.
        char c1 ='A';

        int i1 = c1;  // 아스키 코드.

        char c2 = 66;  //  아스키 코드.

        int i2 = c1 + i1 ;

        System.out.println(c1);
        System.out.println(i1);
        System.out.println(c2);
        System.out.println(i2);
        // ========================
        // 1.float = 실수 값의 마지막에 f 붙혀준다.
        // 2. double = 실수 값의 마지막에 d 붙혀준다.
        // * double = 실수값의 마지막에 d가 없더라도 double 타입으로 판단한다.
        // ========================
        float f = 3.141592653589793f;  // 실수형 데이터타입. 4byte

        double d = 3.141592653589793d;  // 8byte
        double d2 = 3.141592653589793;

        System.out.println(f);
        System.out.println(d);
        System.out.println(d2);

        // ====================================
        //   [상수와 리터럴]
        // ** final = 상수 선언에 사용되는 키워드
        // * 선언시에 최초 한번 초기화 가능.
        // ====================================

        final double PI = 3.141592;   // 리터럴 상수.
        // ** 상수로 선언 해놓고 값을 다시 변경하려고 할 때 ....
        // PI = 3.141592653689793; error

        // =========================================
        // [\n] = 줄바꿈
        // [\t] = 탭
        // [\\] = \
        // [\'] = '
        // [\"] = "
        // =============================================

        System.out.println("문자열\n출력");
        System.out.println("문자열\\출력");
        System.out.println("문,자,열,출,력");
        System.out.println("\"문자열\" \"출력\"");
        System.out.println("문자열 출력");

        // =============================================
        //   [변수의 범위]
        // 1. 해당 영역에서 생성된 변수는 해당 영역을 빠져나가면 더이상
        // 사용할수 없다.
        // 2. 영역이 다르다면 변수명을 동일하게 지을수 있음.
        // 3. A라는 영역 내부에서 또다른 B 영역을 포함 한다면
        // B 영역을 A 영역의 일부이다.
        // ================================================
        int number1 = 10;

        {
            int number2 = 1000;
            number1 = 100;  // 회색: 의미없는 값.
        }

        {
            int number2 = 10000;
            number1 = 1000;
        }
        System.out.println("number1 ="+ number1);
        //System.out.println("number2 ="+  number2); error
    }
}