import java.util.Scanner;
import java.util.*;

public class IntStackSearch {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        IntStack s = new IntStack(64); // 최대 64개를 푸시할 수 있는 스택

        String z;

        while (true) {
            System.out.print("스택을 선택하세요 : ");
            z = stdIn.next();

            System.out.println("현재 데이터 수：" + s.size(z) + " / "
                    + s.capacity());
            System.out.print("(1)푸시　(2)팝　(3)피크　" +
                    "(4)덤프 (5)검색 (6)비움 (7)info　(0)종료：");

            int menu = stdIn.nextInt();
            if (menu == 0) break;

            int x;
            switch (menu) {
                case 1: 							// 푸시
                    System.out.print("데이터：");
                    x = stdIn.nextInt();
                    try {
                        s.push(x,z);
                    } catch (IntStack.OverflowIntStackException e) {
                        System.out.println("스택이 가득 찼습니다.");
                    }
                    break;

                case 2: 							// 팝
                    try {
                        x = s.pop(z);
                        System.out.println("팝한 데이터는 " + x + "입니다.");
                    } catch (IntStack.EmptyIntStackException e) {
                        System.out.println("스택이 비어 있습니다.");
                    }
                    break;

                case 3: 							// 피크
                    try {
                        x = s.peek(z);
                        System.out.println("피크한 데이터는 " + x + "입니다.");
                    } catch (IntStack.EmptyIntStackException e) {
                        System.out.println("스택이 비어 있습니다.");
                    }
                    break;

                case 4: 							// 덤프
                    s.dump(z);
                    break;

                case 5:                             //검색
                    System.out.print("찾는 데이터: ");
                    x = stdIn.nextInt();
                    int result = s.indexOf(x,z);

                    if(result>0)
                        System.out.println("꼭대기부터 " + result + "번째에 있습니다.");
                    else
                        System.out.println("그 데이터가 없습니다.");
                    break;

                case 6:                             //비움
                    s.clear(z);
                    break;

                case 7:                             //정보표시
                    int capa = s.capacity();
                    int num = s.size(z);
                    System.out.println("용량: " + capa + "개");
                    System.out.println("데이터 수: " + num + "개");
                    break;
            }
        }
    }
}