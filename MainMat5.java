package generic;

public class MainMat5 {
public static void main(String[] args) {
	Matrix mt=new Matrix();
	MatAdd m=new MatAdd();
	System.out.println("Read first Matrix:");
	int x[][]=mt.readMat();
	
	System.out.println("Read second matrix:");
	int y[][]=mt.readMat();
	
	System.out.println("entered first matrix:");
	mt.dispMat(x);
	
	System.out.println("entered second matrix:");
	mt.dispMat(y);
	
	System.out.println("Added matrix:");
	int z[][]=m.addMat(x,y);
	if(z!=null)
		mt.dispMat(z);
}
}
