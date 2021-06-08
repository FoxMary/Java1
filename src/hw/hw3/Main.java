package hw.hw3;

import java.util.ArrayList;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>(Arrays.asList("A", "B", "A", "C", "D", "D", "D", "I", "X", "Q", "A", "R", "E"));
        PhoneBook book = new PhoneBook();
        book.add("Петров", 314323523);
        book.add("Орлов", 234234234);
        book.add("Петров", 33425325);

        book.info();
        book.get("Петров");

//        unique(al);
//        howMuch(al);


    }

    public  static void howMuch (ArrayList<String> arr) {
        for (String a : arr) {
            int replay = 0;
            for (String s : arr) {
                if (a.equals(s)) replay++;
            }
            System.out.println(a + " " + replay);
        }
    }

    public static void unique (ArrayList<String> arr) {
        for (String a : arr) {
            int replay = 0;
            for (String s : arr) {
                if (a.equals(s)) replay++;
            }
            if (replay == 1) System.out.println(a);
        }
    }
}

