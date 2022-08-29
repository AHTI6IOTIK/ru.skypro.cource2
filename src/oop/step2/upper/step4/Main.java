package oop.step2.upper.step4;

public class Main {
    public static void main(String[] args) {
        MatrixService service = new MatrixService();
        Matrix mOne = (new Matrix()).initializeRandomMatrix();
        Matrix mtwo = (new Matrix()).initializeRandomMatrix();

        service.printMatrix(mOne);
        service.printMatrix(mtwo);
        service.printMatrix(mOne.addMatrix(mtwo));
        service.printMatrix(mOne.multiplyNumber(2));
    }
}
