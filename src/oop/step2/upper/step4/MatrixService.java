package oop.step2.upper.step4;

import java.util.Arrays;

public class MatrixService {
    public void printMatrix(Matrix matrix) {
        double[][] printMatrix = matrix.getMatrix();

        for (double[] mRow: printMatrix) {
            System.out.println(Arrays.toString(mRow));
        }
        System.out.println();
    }
}
