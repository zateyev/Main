/*import java.util.ArrayList;
import java.util.List;*/

public class Main {
    public static void main(String[] args) {
        Matrix A = new Matrix(2,2);
        System.out.println("Matrix A");
        A.Print();
        Matrix B = new Matrix(2,2);
        System.out.println("Matrix B");
        B.Print();
        System.out.println("Matrix multiplication");
        A.Multiply(B);
        A.Print();
    }
}
