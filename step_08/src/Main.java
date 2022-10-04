public class Main {
    public static void main(String[] args) {

        /*
        int number = 10;
        int number1 = 100;
        int number2 = 200;
        int number3 = 300;
        int number4 = 400;
        int number5 = 500;
        */


        // =================================
        // ** null 아무것도 없는 상태
        // ** " " Space 한칸이 있는 상태

        // ** 출력의 상태는 동일하지만 전혀 다른값이다. ↓
        String str1 = " "; // str1 과 str2는 서로 다른 의미다.
        String str2 = null;
        // ====================================
        // ** 배열의 초기화
        {
            int[] numArr = null;
            int arrNum[] = null; // 변수 초기화 필수. null = 아무것도 없는 상태

            // ** 초기화 되지 않은 배열은 에러.
            // System.out.println(numArr[0]);
            // System.out.println(arrNum[0]);
        }
        //==========================================
        {
            // ** 배열 초기화 방법.↓
            //int number[] = new int[5];
            int[] number = new int[5];
            // ** 원소의 값을 초기화
            number[0] = 10;
            number[1] = 20;
            number[2] = 30;
            number[3] = 40;
            number[4] = 50;

            System.out.println(
                    number[0] + " " +
                            number[1] + " " +
                            number[2] + " " +
                            number[3] + " " +
                            number[4]);
        }
        // =======================================
        {
            int[] number = new int[5];  // 배열의 길이는 5다. 0부터 시작. 0,1,2,3,4

            for (int i = 0; i < 5; ++i) {
                number[i] = i * 10 + 10;
            }
            //System.out.println(
            //        number[0] + "\t" +
            //                number[1] + "\t" +
            //                number[2] + "\t" +
            //                number[3] + "\t" +
            //                number[4]);

            // for(int i =0 ;i < 5; ++i)
            // {
            //     System.out.println(number[i]);
            // }
        }
        // =========================================
        {
            // ** 배열 초기화의 다른 방법.
            String[] strArr = {"홍길동", "임꺽정", "이몽룡"};

            System.out.println("배열의 길이 : " + strArr.length);  // length 배열의길이.

            for (int i = 0; i < strArr.length; ++i) {
                System.out.println(strArr[i]);
            }
        }
        // =======================================

        {
            int[] numbers = new int[6];
            int index = 0;

            while (true) {
                // ** 1 ~ 45사이의 난수를 생성한다.
                int num = (int) (Math.random() * 45) + 1;

                // ** true || false
                boolean insert = true;

                // ** 리스트에 같은 값이 있는지 확인한다.
                for (int i = 0; i <= index; ++i)
                {
                    // ** 만약 같은 값이 존재 한다면  .....
                    if (numbers[index] == num)
                    {
                       // ** 데이터를 넣지 못하게 함.
                        insert = false;
                        break;
                    }

                }
                // ** 같은 값이 없을때 ...
                if (insert == true)
                {
                    // ** 리스트에 값을 추가한다.
                    numbers[index] = num;
                    // ** 인덱스를 증가시킨다. 다음위치로.
                    ++index;
                }
                // ** 리스트가 모두 완성되었다면 반복문을 탈출한다.
                if (index == 6) break;

            }
            // ** 로또번호를 출력한다.
            for (int i = 0; i < 6; ++i)
            {
                System.out.println(numbers[i]);
            }


        }
    }
}