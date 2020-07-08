public class IntStack {
    private int max;            // 스택 용량
    private int ptrA;            // 스택 포인터 1
    private int ptrB;           // 스택 포인터 2
    private int[] stk;            // 스택 본체

    // 실행 시 예외 : 스택이 비어 있음
    public class EmptyIntStackException extends RuntimeException {
        public EmptyIntStackException() {
        }
    }

    // 실행 시 예외 : 스택이 가득 참
    public class OverflowIntStackException extends RuntimeException {
        public OverflowIntStackException() {
        }
    }

    // 생성자
    public IntStack(int capacity) {
        ptrA = 0;
        ptrB = max - 1;
        max = capacity;
        try {
            stk = new int[max];                // 스택 본체용 배열을  생성
        } catch (OutOfMemoryError e) {        // 생성할 수 없음
            max = 0;
        }
    }

    // 스택에 x를 푸시
    public int push(int x, String z) throws OverflowIntStackException {
        if (ptrA >= ptrB + 1)                                    // 스택이 가득 참
            throw new OverflowIntStackException();
        switch (z) {
            case "A":
                stk[ptrA++] = x;
                break;
            case "B":
                stk[ptrB--] = x;
                break;
        }
        return x;
    }

    // 스택에서 데이터를 팝(정상에 있는 데이터를 꺼냄)
    public int pop(String z) throws EmptyIntStackException {
        if (ptrA <= 0 && ptrB >= max - 1)                                    // 스택이 비어 있음
            throw new EmptyIntStackException();
        switch (z) {
            case "A":
                return stk[--ptrA];
            break;
            case "B":
                return stk[++ptrB];
            break;
        }
    }

    // 스택에서 데이터를 피크(정상에 있는 데이터를 들여다봄)
    public int peek(String z) throws EmptyIntStackException {
        if (ptrA <= 0 && ptrB >= max - 1)                                    // 스택이 비어 있음
            throw new EmptyIntStackException();
        switch (z) {
            case "A":
                return stk[ptrA - 1];
            break;
            case "B":
                return stk[ptrB + 1];
            break;
        }
    }

    // 스택에서 x를 찾아 인덱스(없으면 –1)를 반환
    public int indexOf(int x, String z) {
        switch (z) {
            case "A":
                for (int i = ptrA - 1; i >= 0; i--)
                    if (stk[i] == x)
                        return i;
                break;
            case "B":
                for (int i = ptrB + 1; i < max; i++)
                    if (stk[i] == x)
                        return i;
                break;
        }
        return -1;                                        // 검색 실패
    }

    // 스택을 비움
    public void clear(String z) {
        switch (z) {
            case "A":
                ptrA = 0;
                break;
            case "B":
                ptrB = 0;
                break;
        }
    }

    // 스택의 용량을 반환
    public int capacity() {
        return max;
    }

    // 스택에 쌓여 있는 데이터 수를 반환
    public int size(String z) {
        switch (z) {
            case "A":
                return ptrA;
            break;
            case "B":
                return max - ptrB - 1;
            break;
        }
    }

    // 스택이 비어 있는가?
    public boolean isEmpty(String z) {
        switch (z) {
            case "A":
                return ptrA <= 0;
            break;
            case "B":
                return ptrB >= max - 1;
            break;
        }
    }

    // 스택이 가득 찼는가?
    public boolean isFull() {
        return ptrA >= ptrB + 1;
    }

    // 스택 안의 모든 데이터를 바닥 → 꼭대기 순서로 출력
    public void dump(String z) {
        switch (z) {
            case "A":
                if (ptrA <= 0)
                    System.out.println("스택이 비어 있습니다.");
                else {
                    for (int i = 0; i < ptrA; i++)
                        System.out.print(stk[i] + " ");
                    System.out.println();
                }
                break;

            case "B":
                if (ptrB >= max - 1)
                    System.out.println("스택이 비어 있습니다.");
                else {
                    for (int i = max - 1; i > ptrB; i--)
                        System.out.print(stk[i] + " ");
                    System.out.println();
                }
                break;
        }
    }





}
