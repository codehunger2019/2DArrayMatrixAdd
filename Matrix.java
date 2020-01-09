//to find biggest element in an array

package generic;
import java.util.Scanner;
public class Matrix {
	int[][] readMat()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows and columns");
		int rows=sc.nextInt();
		int cols=sc.nextInt();
		int mat[][]=new int[rows][cols];
		System.out.println("enter "+rows*cols+" elements");
		
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[i].length;j++) {
				mat[i][j]=sc.nextInt();
				}
		}
		return mat;
	}
	
	void dispMat(int mat[][]){
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[i].length;j++) {
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
	}

	
	int	getBiggest(int mat[][]){
		int big=mat[0][0];
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[i].length;j++) {
				if(mat[i][j]>big)
					big=mat[i][j];
			}
		}
		return big;
		}
}
