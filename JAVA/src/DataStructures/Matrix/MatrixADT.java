package DataStructures.Matrix;

import DataStructures.Exceptions.DataStructuresExceptions;
import DataStructures.Exceptions.InvalidMatrix;

/**
 * Created by xenonus on 5/21/2018.
 */
public class MatrixADT {

    private int data[][];
    private int rows, columns;

    public MatrixADT(int data[][]) {
        this.rows = data.length;
        this.columns = data[0].length;
        this.data = data;
    }

    private MatrixADT(int rows, int columns) {
        this.data = new int[rows][columns];
        this.rows = rows;
        this.columns = columns;
    }

    public void add(MatrixADT matrixADT1, MatrixADT matrixADT2, MatrixADT matrixADT) throws InvalidMatrix{
        if(matrixADT1.rows != matrixADT2.rows && matrixADT1.columns != matrixADT2.columns) throw new InvalidMatrix("rows & column must be equal of two matrix");
        for (int  i = 0; i < matrixADT1.rows; i++) {
            for (int j = 0; j < matrixADT1.columns; j++) {
                matrixADT.insert(i, j, matrixADT1.getData(i, j) + matrixADT2.getData(i, j));
            }
        }
    }

    public void subtract(MatrixADT matrixADT1, MatrixADT matrixADT2, MatrixADT matrixADT) throws InvalidMatrix {
        if(matrixADT1.rows != matrixADT2.rows && matrixADT1.columns != matrixADT2.columns) throw new InvalidMatrix("rows & column must be equal of two matrix");
        for (int  i = 0; i < matrixADT1.rows; i++) {
            for (int j = 0; j < matrixADT1.columns; j++) {
                matrixADT.insert(i, j, matrixADT1.getData(i, j) - matrixADT2.getData(i, j));
            }
        }
    }

    public void multiply(MatrixADT matrixADT, MatrixADT matrixADT1, MatrixADT matrixADT2)  throws InvalidMatrix {
        if(matrixADT.columns != matrixADT1.rows) throw new InvalidMatrix("First matrix columns must be equal to second matrix rows");
        matrixADT2.empty();
        for (int i = 0; i < matrixADT.rows; i++) {
            for (int j = 0; j < matrixADT1.columns; j++) {
                for (int k = 0; k < matrixADT.rows; k++) {
                    matrixADT2.add(i, j, matrixADT.getData(i, k) * matrixADT1.getData(k, j));
                }
            }
        }
    }

    public void empty() {
        for (int i = 0; i < this.rows; i++)
            for (int j = 0; j < this.columns; j++)
                this.data[i][j] = 0;
    }

    public void add(int row, int column, int data) {
        this.data[row][column] += data;
    }

    private int getData(int row, int columns) {
        return this.data[row][columns];
    }

    private void insert(int row, int column, int data) {
        this.data[row][column] = data;
    }

    public void print() {
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.columns; j++) {
                System.out.printf("%d\t", this.data[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String arg[]) {
        try {
            int data1[][] = {
                    {1, 1, 1, 1},
                    {2, 2, 2, 2},
                    {3, 3, 3, 3},
                    {3, 3, 3, 3}};
            int data2[][] = {
                    {1, 1,},
                    {2, 2,},
                    {3, 3},
                    {4, 4}};
            MatrixADT matrixADT1 = new MatrixADT(data1);
            MatrixADT matrixADT2 = new MatrixADT(data2);
            MatrixADT matrixADT = new MatrixADT(4, 2);

            matrixADT1.multiply(matrixADT1, matrixADT2, matrixADT);

            matrixADT.print();

        } catch (DataStructuresExceptions dataStructuresExceptions) {
            System.out.println(dataStructuresExceptions.getMessage());
        }
    }
}
