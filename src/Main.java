

public class Main {
    public static void main(String[] args) {
        Matrix A = new Matrix(2,3);
        System.out.println("Matrix A");
        A.print();
        Matrix B = new Matrix(3,2);
        System.out.println("Matrix B");
        B.print();
        System.out.println("Matrix multiplication");
        A.multiply(B);
        A.print();
    }
}
