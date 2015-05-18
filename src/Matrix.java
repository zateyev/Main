import java.util.Random;

public class Matrix {
    int A[][];
    int m,n;
    public Matrix(){
        this.m=0;
        this.n=0;
    }
    //Constructor: zapolnenie matritsyi sluchaynyimi chislami
    public Matrix(int m, int n)
    {
        this.m=m;
        this.n=n;
        Random r = new Random();
        this.A = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                //Sluchaynyie chisla v diapazone -10..10
                A[i][j]=r.nextInt()%11;
            }
        }
    }
    //Metod vyivoda matritsyi na konsol
    public void print() {
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
    //Metod umnozheniya matrits
    public Matrix Multiply(Matrix c){
        //Proverka formyi matrits na soglasovannost
        if(this.n!=c.m){
            m=n=-1;//Uslovnoe prisvaivanie -1 k m i n (ne soglasovannost matrits)
            this.A=null;
        }
        else {
            this.n=c.n;
            //Rezultat umnozheniya zapisyivayu na vremennyiy massiv (matritsu) tmp
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