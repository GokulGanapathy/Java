package Learn;

import java.util.*;
public class Matrix0Replace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int mat[][]=new int[n][m];
		
		for(int i=0;i<n;++i)
		{
			for(int j=0;j<m;++j)
			{
				mat[i][j]=sc.nextInt();
			}
		}
		int arr[][]=new int[n][m];
		for(int i=0;i<n;++i)
		{
			for(int j=0;j<m;++j)
			{
				arr[i][j]=1;
			}
		}
		for(int i=0;i<n;++i)
		{
			for(int j=0;j<m;++j)
			{
				if(mat[i][j]==0)
				{
					for(int k=0;k<n;++k)
					{
						arr[k][j]=0;
					}
					for(int k=0;k<m;++k)
					{
						arr[i][k]=0;
					}
				}
			}
		}
		for(int i=0;i<n;++i)
		{
			for(int j=0;j<m;++j)
			{
				if(j<m-1)
				{
					System.out.print(arr[i][j]+" ");
				}
				else if(j==m-1)
				{
					System.out.print(arr[i][j]);
				}
				
			}
			System.out.println();
		}
			
	}

}
