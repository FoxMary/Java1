package hw.hw2;

public class Main {
    public static void main(String[] args) {
//        Week w = Week.MONDAY;
//        w.goWork(Week.FRIDAY);
        Week.MONDAY.goWork(Week.SUNDAY);

    try {
    String[][] mass1 = {{"3", "4", "4", "5"},  {"3", "4", "4", "7"},   {"3", "4", "4", "7"},  {"4", "4", "7"}};
        System.out.println(massive(mass1));
    } catch (MyArrayException e) {
        e.printStackTrace();
    }

        try {
            String[][] mass2 = {{"1", "2", "3", "4"},  {"5", "6", "b", "8"}, {"9", "0", "1", "2"},  {"3", "4", "5", "6"}};
            System.out.println(massive(mass2));
        } catch (MyArrayException e) {
            e.printStackTrace();
        }

        try {
            String[][] mass3 = {{"1", "2", "36", "4"},  {"5", "6", "7", "8"}, {"9", "0", "1", "2"},  {"3", "4", "5", "6"}};
            System.out.println(massive(mass3));
        } catch (MyArrayException e) {
            e.printStackTrace();
        }

    }



    public static int massive (String[][] mass) {
        int sum = 0;
        int massLength = 4;

        if (mass.length != massLength) throw new MyArraySizeException();
        for (String[] strings : mass) {
            if (strings.length != massLength) throw new MyArraySizeException();
        }

                for (int i = 0; i < massLength; i++) {
            for (int j = 0; j < massLength; j++) {
                try {
                    sum += Integer.parseInt(mass[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        return sum;
    }
}
