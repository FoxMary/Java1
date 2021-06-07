package hw.hw2;

import lessons.l2.FactorialException;

public class Main {
    public static void main(String[] args) {
        Week.MONDAY.goWork(Week.MONDAY);

        String[][] mass1 = {{"3", "4", "4", "5"},  {"3", "4", "4", "7"}};
        String[][] mass2 = {{"1", "2", "3", "4"},  {"5", "6", "b", "8"}, {"9", "0", "1", "2"},  {"3", "4", "5", "6"}};
        String[][] mass3 = {{"1", "2", "36", "4"},  {"5", "6", "7", "8"}, {"9", "0", "1", "2"},  {"3", "4", "5", "6"}};

        try {
            massive(mass1);
        } catch (MyArraySizeException | MyArrayDataException e) {
            e.printStackTrace();
        }

        try {
            massive(mass2);
        } catch (MyArraySizeException | MyArrayDataException e) {
            e.printStackTrace();
        }

        try {
            massive(mass3);
        } catch (MyArraySizeException | MyArrayDataException e) {
            e.printStackTrace();
        }

    }



    public static void massive (String[][] mass) throws MyArraySizeException, MyArrayDataException {
        int sum = 0;
        int massLength = 4;
        if (mass.length != massLength || mass[0].length != massLength) throw new MyArraySizeException("Размер массива должен быть " + massLength + "x" + massLength);
        for (int i = 0; i < massLength; i++) {
            for (int j = 0; j < massLength; j++) {
                if (!isNumeric(mass[i][j])) throw new MyArrayDataException("Элемент массива " + i + "x" + j + " не является числом");
                sum += Integer.parseInt(mass[i][j]);
            }
        }
        System.out.println(sum);
    }

    public static boolean isNumeric(String str) {
        return str.matches("-?\\d+(\\.\\d+)?");
    }
}
