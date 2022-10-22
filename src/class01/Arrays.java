package class01;

public class Arrays {
        // sum of 2D array, add only even and odd numbers
        static int sumRow(int[][] number) {
            int sum = 0;
            int sum1=0;
            for (int i = 0; i < number.length; i++) {
                // sum=0;
                for (int j = 0; j < number[i].length; j++) {//i=0; j=1
                    sum += number[i][j];//sum=0+2=2
                }
                sum1=sum;
            }
            return sum1;
        }

        public static void main(String[] args) {
            int[][] numbers = {
                    {2, 6, 4},//12
                    {767, 86, 43},//896
                    {4, 7, 8}//19
            };
            System.out.println(sumRow(numbers));

        }
    }

