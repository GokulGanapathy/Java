package guviPractice;

import java.util.Scanner;

public class island_1s_0s {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int mat[][]=new int[n][n];
		for(int i=0;i<n;++i)
		{
			for(int j=0;j<n;++j)
			{
				mat[i][j]=sc.nextInt();
			}
		}
		int count=0;
		for(int i=0;i<n;++i)
		{
			for(int j=0;j<n;++j)
			{
				if(mat[i][j]==1)
				{
					if(island(mat,i,j,n)==true)
					{
						count++;
					}
				}
			}
		}
		if(count==0)
		{
			System.out.println("-1");
		}
		else
		{
			System.out.println(count);
		}
	}
	
	public static boolean island(int mat[][],int x,int y,int n)
	{
		if (x < 0 || x >= n || y < 0 || y >= n || mat[x][y] == 0) {
            return true; // Base case: If the cell is out of bounds or water, it's part of the island boundary.
        }

        // Mark the current cell as visited
        mat[x][y] = 0;

        // Recursively check in all four directions
        boolean up = island(mat, x - 1, y, n);
        boolean down = island(mat, x + 1, y, n);
        boolean left = island(mat, x, y - 1, n);
        boolean right = island(mat, x, y + 1, n);

        // If any adjacent cell is water, this cell is part of the island boundary
        return up || down || left || right;
	}

}
