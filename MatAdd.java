
//Wap a method to add two matrix
package generic;

public class MatAdd {

	int[][] addMat(int a[][],int b[][]){
		if(a.length!=b.length||a[0].length!=b[0].length) {
			System.out.println("addition failed");
			return null;
		}
		int c[][]=new int[a.length][a[0].length];
		for(int i=0;i<c.length;i++) {
			for(int j=0;j<c[i].length;j++) {
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		return c;
	}
}
