package Learn;

import java.util.Scanner;

public class MatrixIsland {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int mat[][]=new int[n][m];
		for(int i=0;i<n;++i)
		{
			for(int j=0;j<n;++j)
			{
				mat[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<n;++i)
		{
			for(int j=0;j<m;++j)
			{
				if(mat[i][j]==1)
				{
					if(i>0 && j>0)
					{
					}
				}
			}
		}

	}

}