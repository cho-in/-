public class Main {
    public static void main(String[] args) {
        // ======================================
        // [제어문]
        // ======================================

        // ** 조건문(분기문)
        // [if], [else], [if else]

        {
            int number = 10;


            // 만약 number 값이 100이 넘는다면?
            // 또는 0보다 작다면?
            if(number > 100 || 0 > number)
            {
              //  System.out.println(number + "의 값이 잘못되었습니다.");
            }
            else {
              //  System.out.println("정상 입력 되었습니다.");

            }

            // ** if 영역과 else 영역을 서로 다른 분기로 나누어
            // ** 특정 조건에 맞는 영역만을 실행하게 된다.

            // ** 해당 분기문은 두 영역중 무조건 1개의 영역은 실행됨.

            //===============================================

            // ** if 문만 있는경우는 조건에 맞으면 실행되지만
            // ** 조건과 성립하지 않은 경우에는 pass
            if(number == 10)
            {
               // System.out.println("당첨");
            }

            // ** 정리 if/else 문은 if 문만 별도로 사용 가능하고,
            // ** else 문을 따로 사용할 수 없다.

            // ** else 문이 사용되기 위해서는 if 문이 선행 되어야함.
            // ** else 문이 사용되었다면 분기들 중 하나의 분기는 무조건 실행 된다.
            // ==================================================

            // ** 여러개의 분기를 만들어 사용 가능.
            if(number < 15)
            {

            }
            else if (number < 30)
            {

            }
            else if (number < 50)
            {

            }
            else // ** 조건식이 필요하지 않음.
            {

            }

            // ** 분기문의 중첩 사용이 가능하다.
            if(true)
            {
                if(false)
                {

                }
                else
                {

                }
            }
            else
            {

            }
            // ** [switch/case]

                int num = 0;

                // ** switch = 정수 & 상수만 사용이 가능하다.
                // ** 변수이지만 final 키워드를 사용하여 상수로 만든 경우에는 사용 가능.

                switch(num)
                {
                    case 0:
                        System.out.println("case 1번입니다.");
                         break;// 탈출문
                    case 1:
                        System.out.println("case 2번입니다.");
                        break;
                    case 2:
                        System.out.println("case 3번입니다.");
                        break;
                    case 3:
                        System.out.println("case 4번입니다.");
                        break;

                }

                switch (num)
                {
                    case 0:
                        switch (num)
                        {
                            case 0:
                                System.out.println("case 1번입니다.");
                            case 1:
                                System.out.println("case 2번입니다.");



                        default:  // else 랑 같다.
                            System.out.println("0과 1만 사용이 가능합니다." + num + "3은 사용이 불가합니다.");
                        }
                }





        }



    }
}