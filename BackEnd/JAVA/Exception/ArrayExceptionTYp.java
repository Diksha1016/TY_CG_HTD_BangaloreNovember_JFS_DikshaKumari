
public class ArrayExceptionTYp {
public static void main(String args[]) {
		  System.out.println("main started");
		  int a1[]=new int[2];
		  a1[0]=5;
		  a1[1]=10;
		  try {
			  a1[2]=20;
		  }catch(ArrayIndexOutOfBoundsException e) {
			  System.out.println("there is no size to store the data");
		  }
		  
		  
		  System.out.println("main ended");
		}

}
