package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int SIZE = 12;
    public static final int ERROR_CODE = -1;
    public static final int ELEVEN = 11;
    private final int[] numbers = new int[SIZE];

    public int total = ERROR_CODE;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == ERROR_CODE;
    }

    public boolean isFull() {
        return total == ELEVEN;
    }

    protected int peekaboo() {
        if (callCheck())
            return ERROR_CODE;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return ERROR_CODE;
        return numbers[total--];
    }

}
