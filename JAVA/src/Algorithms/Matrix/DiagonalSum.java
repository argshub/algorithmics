package Algorithms.Matrix;

/**
 * Created by xenonus on 5/22/2018.
 */
public class DiagonalSum {

    public static int sum(int data[][]) {
        int sum = 0;
        if((data.length & 1) != 0) {
            int i = 0, j = data.length - 1;
            while (i <= j) {
                if (i == j) {
                    sum += data[i++][j--];
                    continue;
                }
                sum += data[i][i];
                sum += data[j][j];
                sum += data[i][j];
                sum += data[j--][i++];
            }
        } else {
            int i = 0, j = data.length - 1;
            while (i < j) {
                sum += data[i][i];
                sum += data[j][j];
                sum += data[i][j];
                sum += data[j--][i++];
            }
        }

        return sum;
    }


    public static void main(String arg[]) {
        int data[][] = {
                {1, 2,3, 4, 5},
                {1, 2,3, 4, 5},
                {1, 2,3, 4, 5},
                {1, 2,3, 4, 5},
                {1, 2,3, 4, 5}
        };

        System.out.println(sum(data));
    }
}
