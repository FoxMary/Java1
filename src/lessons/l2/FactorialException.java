package lessons.l2;

public class FactorialException extends Exception {
    private int number;

    public FactorialException(String msg, int number) {
        super(msg);
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
}

class Factorial {
    public static int getFactorial(int num) throws FactorialException {
        int result = 1;
        if (num < 1) throw new FactorialException("Меньше 0", num);

        for (int i = 1; i < num; i++) {
            result *= i;
        }
        return result;
    }
}

class MainEx {
    public static void main(String[] args) {
        try {
            int result = Factorial.getFactorial(-10);
        } catch (FactorialException e) {
            e.printStackTrace();
        }
    }
}