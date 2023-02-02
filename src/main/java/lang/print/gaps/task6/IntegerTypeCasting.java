package lang.print.gaps.task6;

public class IntegerTypeCasting {
    long first = 1000;
    public static void main(String[] args) {

        long first = 1000;
        var second = (int) first;
        System.out.println(Long.toString(first) + "\n" + Integer.toString(second));

    }
}
