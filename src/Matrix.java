import java.util.Random;

public class Matrix {
    int a[][];
    int m,n;
    public Matrix(int m, int n)
    {
        this.m=m;
        this.n=n;
        Random r=new Random();
        this.a=new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j]=r.nextInt();
            }
        }
    }
    public void Print() {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(a[i][j]+" ");
            }
            System.out.println("\n");
        }
    }
}