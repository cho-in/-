public class Main {
    public static void main(String[] args) {
        // ======================================
        // [다차원 배열]
        // ======================================
        {
            int[][] numbers = new int[3][3];

            numbers[0][0] = 1;
            numbers[0][1] = 2;
            numbers[0][2] = 3;

            numbers[1][0] = 4;
            numbers[1][1] = 5;
            numbers[1][2] = 6;

            numbers[2][0] = 7;
            numbers[2][1] = 8;
            numbers[2][2] = 9;
        }

        {
            int[][] numbers = {
                    {1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9}

            };
            for (int i = 0; i < 3; ++i) {
                for (int j = 0; j < 3; ++j) {
              //      System.out.println(numbers[i][j]);
                }
            }

        }

        {   // 5 4 3
            int[][][] numbers = {
                    {
                            {10, 11, 12},
                            {13, 14, 15},
                            {16, 17, 18},
                            {19, 20, 00}
                    },
                    {
                            {20, 21, 22},
                            {23, 24, 25},
                            {26, 27, 28},
                            {29, 30, 00}
                    },
                    {
                            {30, 31, 32},
                            {33, 34, 35},
                            {36, 37, 38},
                            {39, 40, 00}
                    },
                    {
                            {40, 41, 42},
                            {43, 44, 45},
                            {46, 47, 48},
                            {49, 50, 00}
                    },
                    {
                            {50, 51, 52},
                            {53, 54, 55},
                            {56, 57, 58},
                            {59, 60, 00}
                    }
            };
        //    System.out.println(numbers[2][2][1]);
        }
        {
            int[][] numbers =
                    {
                            {1, 2, 3},
                            {4, 5, 6},
                            {7, 8, 9}
                    };
            int[][] numbers2 =
                    {
                            {0, 0, 0},
                            {0, 0, 0},
                            {0, 0, 0}
                    };
                    for(int i= 0;i< 3;++i)
                    {
                        for(int j=0 ; j<3 ;++j)
                        {
                            numbers2[i][j]=numbers[i][j];
                        }
                    }
                    for(int i= 0;i< 3;++i)
                        for(int j=0 ; j<3 ;++j);
                       //     System.out.println(numbers2[i][j]);
        }

        //====================================
        // [문자열]
        //====================================
        {
            String name1 = "홍길동";
            String name2 = "임꺽정";
            String name3 = "홍길동";

            //System.out.println(name1 == name2);
            //System.out.println(name1 == name3);
        }

        {
            String name1 = new String("홍길동");
            String name2 = new String("홍길동");

           // System.out.println(name1 == name2);
        }
        //======================================
        // [정렬]
        //======================================

        {
            int[] numbers = new int[10];

            int index = 0;

            while(true)
            {
                boolean check = true;

                int num = (int)(Math.random() * 100)+1;

                for(int i =0; i< numbers.length;++i)
                    if(numbers[i] == num)
                    {
                        check = false;
                        break;
                    }
                if(check == true)
                {
                   numbers[index] =num;
                   ++index;
                }

                if(index == 10) break;
            }

            for(int i =0; i<numbers.length;++i)
                System.out.println(numbers[i]);
            // ================================= 난수 생성 완료,.

            // ================[버블 정렬]================= 정렬 시작.

            for(int i = 0; i <numbers.length -1 ; ++i)
            {
                for(int j = (i+1) ; j <numbers.length; ++j)
                {
                    if(numbers[i] < numbers[j])
                    {
                        int temp = numbers[i];
                        numbers[i] = numbers[j];
                        numbers[j] = temp;
                    }
                }
            }
            // ======================================= 정렬 끝.

            System.out.println("정렬된 값을 출력합니다. ===");
            for(int element : numbers)
                System.out.println(element);

        }

        // ================[선택 정렬]================= 정렬 시작.

        // ========================================== 정렬 끝. 내림차순.

    }
}