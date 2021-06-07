package lessons.l2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Main {
    public static void main(String[] args) {

        try {
            something();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

//        System.out.println(sqrt(2));

//        try {
//            System.out.println(sqrt(-10));
//        } catch (ArithmeticException e) {
//            System.out.println("Введите число больше 0");
//    }
//        throw new RuntimeException("Error");        //создание ошибки

//        try(FileOutputStream fileOutputStream =  new FileOutputStream("hello.txt")) {
//            fileOutputStream.write();
//        }

//        System.out.println(testFinally());

//        try {
//            int[] mass = {2,3,4};
//            mass[20] = 10;
//            int b = 10 / 0;
//        } catch (ArithmeticException e) {
//            e.printStackTrace();
//        }

//        Outer outer = new Outer(1);
//        outer.outerInfo();
//
//        Outer.Inner inner = new Outer(10).new Inner(2);     //создание экземпляра внутреннего класса
//        inner.innerInfo();
    }

    public static void something() throws FileNotFoundException {
        FileOutputStream fileOutputStream = new FileOutputStream("1.txt");
    }

    public static int sqrt(int n) {
        if (n > 0) {
            return n / 2;
        }
        throw new ArithmeticException("Нельзя отрицательные");
    }

    static int testFinally() {
        try {
            return 1;
        } finally {                                 //отработает в любом случае
            return 2;
        }
    }
}
