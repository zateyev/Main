import java.util.Random;

public class Matrix {
    int A[][];
    int m,n;
    public Matrix(){
        this.m=0;
        this.n=0;
    }
    public Matrix(int m, int n)
    {
        this.m=m;
        this.n=n;
        Random r = new Random();
        this.A = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                A[i][j]=r.nextInt()%11;
            }
        }
    }
    public void Print() {
        if (this.m==-1&&this.n==-1) {
            System.out.println("Dimensions of matrix not matched");
        }
        else {
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(A[i][j] + "\t");
                }
                System.out.println("\n");
            }
        }
    }
    public Matrix Multiply(Matrix c){
        if(this.n!=c.m){
            m=n=-1;
            this.A=null;
        }
        else {
            this.n=c.n;
            int tmp[][] = new int[m][n];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    for (int k = 0; k < c.m; k++) {
                        tmp[i][j] += this.A[i][k] * c.A[k][j];
                    }
                }
            }
            this.A=tmp;
        }
        return this;
    }
}