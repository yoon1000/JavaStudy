import java.util.Scanner;

public class EuclideanAlgorithm {

    static int gcd (int x, int y) {
        if (y == 0) {
            return x;
        }
        else {
            return gcd (y,x % y);
        }
    }

    public static void main (String[] args) {

        Scanner stdIn = new Scanner(System.in);

        System.out.println("두 정수의 최대공약수를 구합니다.");
        System.out.println();

        System.out.print("정수를 입력하세요: ");
        int a = stdIn.nextInt();

        System.out.println();
        System.out.print("정수를 입력하세요: ");
        int b = stdIn.nextInt();

        System.out.println();
        System.out.print("최대공약수는 " + gcd(a,b) + "입니다.");



    }
}
