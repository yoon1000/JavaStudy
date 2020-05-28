import java.util.Arrays;
import java.util.Random;

public class RandomPractice {
	
	static int Max(int[] a) {
		int max = 0;
		for (int i=0; i<a.length; i++) {
			if (max < a[i]) {
				max = a[i];
			}		
		}
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		int[] A;
		A = new int[5];
		
		for (int i=0; i<5; i++){
			A[i]=random.nextInt(100);
			
			System.out.println("A[" + i + "]: " + A[i]);
		}
		
				System.out.println("최댓값은 " + Max(A) + " 입니다.");
		
		
		

	}

}
