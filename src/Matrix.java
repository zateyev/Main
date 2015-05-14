import java.util.Random;

public class Matrix {
    int A[][];
    int m,n;
    public Matrix(){
        this.m=0;
        this.n=0;
    }
    // онструктор: заполнение матрицы случайными числами
    public Matrix(int m, int n)
    {
        this.m=m;
        this.n=n;
        Random r = new Random();
        this.A = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                //—лучайные числа в диапазоне -10..10
                A[i][j]=r.nextInt()%11;
            }
        }
    }
    //ћетод вывода матрицы на консоль
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
    //ћетод умножени€ матриц
    public Matrix Multiply(Matrix c){
        //ѕроверка формы матриц на согласованность
        if(this.n!=c.m){
            m=n=-1;//”словное присваивание -1 к m и n (не согласованность матриц)
            this.A=null;
        }
        else {
            this.n=c.n;
            //–езультат умножени€ записываю на временный массив (матрицу) tmp
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