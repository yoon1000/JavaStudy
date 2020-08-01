import java.util.Scanner;

public class Factorial {

    static int factorial (int a) {
        if(a>0)
            return a * factorial(a-1);
        else
            return 1;
    }

    public static void main (String[] args){

        Scanner stdIn = new Scanner(System.in);
        System.out.print("정수를 입력하세요:");
        int n = stdIn.nextInt();
        System.out.println();
        System.out.print( n + "의 팩토리얼은 " + factorial(n) + "입니다.");
    }
}
