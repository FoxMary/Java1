package hw.hw2;

public class MyArrayDataException extends Exception {
    int row, column;

    public MyArrayDataException(int row, int column) {
        super("Элемент массива " + row + "x" + column + " не является числом");
        this.row = row;
        this.column = column;
    }
}
