import java.util.Scanner;

public class Hello2 {

	static int sumof(int a, int b) {
		
		int min, max;
		
		if (a < b)
		{min = a; max = b;}
		
		else
		{min = b; max = a;}
		
		int sum = 0;
		
		for (int i=min; i<= max; i++)
			sum = sum + i;
		
			return sum;
	}
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int c, d;
		int result = 0;
		
		System.out.println("a와 b를 포함하여 그 사이의 모든 정수의 합을 구합니다.");
		System.out.print("a의 값：");
		c = input.nextInt();
		
		System.out.print("b의 값：");
		d = input.nextInt();
		
		result = sumof (c,d);
		System.out.print(result);
	}

}
