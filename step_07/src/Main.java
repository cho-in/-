public class Main {
    public static void main(String[] args)
    { //===================================
        // [반복문]
        //==================================
        {
          // [for]
          /*
          for(초기문 ; 조건문; 증감문)
          {
            반복될 내용

          }
            */

            // ** 1. 각 초기문, 조건문, 증감문은 [;](세미콜론)으로 구분된다.
            // ** 2. 초기문 : int i = 0; 과 같이 사용할 변수를 초기화 하는 내용.
            // ** 3. 조건문 : (i < 10) 과 같이 조건이 true 동안 반복됨.
            // *    현재 i가 0이고 10보다 작기 때문에 반복조건에 맞음.
            // ** 4. 증감문: ++i, i++, --i, i--와 같이 1씩 증가 하거나 감소하는 내용.

            // ** 반복문 중복 [구구단 출력하기]

            for(int i = 0 ; i < 10 ; ++i)
            {
             //   System.out.println(i);
            }


            /*for(int i =0 ; i <10 ; ++i)
            {
                System.out.println("[" + i + "]단");

                for(int j =1 ; j < 10 ; ++j)
               {
                   System.out.println(i + " * " + j + " = " + i * j);

               }

                System.out.println("\n");

            }
            */

            /* [while]
            * 초기문
            * while(조건문)
            * {
                    증감문
                    반복내용
              }
            */

            /*int i = 0;
            while (i < 10)
            {
                System.out.println(i++);
            }
            // * 보통 언제 끝이 날지 그 끝을 알수없는 경우에 많이 사용됨.
            int count = 0;
            int max = 10;
            while (true)
            {
                System.out.println((++count) + "반복됨, (" + max + ")");

                if(count%2 == 0)
                    max++;

                if (count > max)
                    break;

            }
           */
           /* int i = 2;
            while (true)
            {
                int j = 1;
                System.out.println("[" + i + "] 단");

                while (true)
                {
                    System.out.println(i + " * " + j + " = " + i * j);
                    ++j;

                    if(j > 9) break;
                }

                System.out.println("\n");

                if ((++i) >9) break;


            }
            */
            // [do ~ while]
            /*
            * 초기문
            * do
            * {
            *       증감문
            *       반복될 내용
            * } while(조건식)
            */

            // ** do ~ while : 조건이 성립되지 않더라도 무조건 1회는 실행됨.
            do
            {
                System.out.println("do ~ while : 홍길동");
            } while (false);

            int i = 0;
            while (i < 0)
            {
                System.out.println("while : 홍길동");
            }

            for(i = 0 ; i <0 ; ++i)
            {
                System.out.println("for : 홍길동");
            }

            // ========================
            for(i=1;i<10;i++)
            {
                int j;
                for(j=1;j<10;j++)
                {
                    if (j%2==0)
                        continue;
                    System.out.println(i +"*"+ j +"="+i*j);
                }
                System.out.println("\n");
            }



        }

    }
}