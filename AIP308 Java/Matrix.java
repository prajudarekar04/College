import java.util.*;

public class Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] a = new int [3][3];
		int [][] b = new int [3][3];
		int [][]res = new int [3][3];
        System.out.println("Enter 1st Matrix:");
		for(int i =0;i<3;i++)
		{
			for(int j=0;j<3;j++)
				a[i][j] = sc.nextInt();
		}
		System.out.println("Enter 2nd Matrix:");
		for(int i =0;i<3;i++)
		{
			for(int j=0;j<3;j++)
				b[i][j] = sc.nextInt();
		}
        while(true) {
			int cho=0;
			System.out.println("1.Add Matrix\n2.Subtract Matrix\n3.Multiply Matrix\n4.Exit\nEnter Choice:");
			cho = sc.nextInt();
			if(cho>=4)
				break;
			if(cho==1)
				AddMatrix(a,b,res);
			if(cho==2)
				SubMatrix(a,b,res);
			if(cho==3)
				MulMatrix(a,b,res);
		}
    }
    static void AddMatrix(int [][] c,int [][] d,int[][] r) {
        for(int i = 0; i < 3; i++)
		{
			for(int j=0;j<3;j++)
				r[i][j] = c[i][j] + d[i][j];
		}
		for(int i = 0; i < 3; i++) {
			System.out.print("\n");
			for(int j = 0; j < 3; j++)
				System.out.print(" " + r[i][j]);
		}
		System.out.println();
    }
    static void SubMatrix(int [][] c,int [][] d,int[][] r) {
        for(int i = 0; i < 3; i++)
		{
			for(int j=0;j<3;j++)
				r[i][j] = c[i][j] - d[i][j];
		}
		for(int i = 0; i < 3; i++) {
			System.out.print("\n");
			for(int j = 0; j < 3; j++)
				System.out.print(" " + r[i][j]);
		}
		System.out.println();
    }
    static void MulMatrix(int [][] c,int [][] d,int[][] r) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                r[i][j] = 0;
                for (int k = 0; k < 3; k++) {
                    r[i][j] += c[i][k] * d[k][j];
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            System.out.print("\n");
            for (int j = 0; j < 3; j++)
                System.out.print(" " + r[i][j]);
        }
        System.out.println();
    }
}