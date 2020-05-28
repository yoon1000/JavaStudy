import java.util.Arrays;

public class Arraypractice {
	static void swap(int[] a, int i1, int i2) {
		int t = a[i1];
		a[i1] = a[i2];
		a[i2] = t;
	}
	
	static void reverse(int[] a) {
		for(int i=0; i<=a.length/2; i++){
			swap(a, i, a.length-i-1);
		}
	}
	
	
	public static void main(String[] args) {

		
	int[] A;
	A = new int[5];
			
	A[0] = 10;
	A[1] = 21;
	A[2] = 3;
	A[3] = 17;
	A[4] = 5;	
		
	for (int i=0; i<5; i++){
			System.out.println("A[" + i + "]: " + A[i]);
		}
	
	System.out.println();
	reverse(A);
	
	for (int i=0; i<5; i++){
			System.out.println("A[" + i + "]: " + A[i]);
		}
			


		}	
	}

