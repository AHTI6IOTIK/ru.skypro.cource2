package oop.step2.upper.step4;

public class Matrix {
    private static final int COLUMNS = 10;
    private static final int ROWS = 10;

    private final double[][] matrix = new double[ROWS][COLUMNS];

    public Matrix() {
        if (COLUMNS != ROWS) {
            throw new RuntimeException("Строки и колонки должны быть равны");
        }
    }

    public Matrix addMatrix(Matrix addMatrix) {
        double[][] outerMatrix = addMatrix.getMatrix();
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                matrix[i][j] += outerMatrix[i][j] ;
            }
        }
        return this;
    }

    public double[][] getMatrix() {
        return matrix;
    }

    public Matrix initializeRandomMatrix() {

        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                matrix[i][j] = (Math.random() + 1) * 10;
            }
        }

        return this;
    }

    public Matrix multiplyNumber(int multiplyNumber) {
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                matrix[i][j] *= multiplyNumber;
            }
        }
        return this;
    }
}
