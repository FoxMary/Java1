package hw.hw3;

import java.util.HashMap;
import java.util.HashSet;

public class PhoneBook {
    HashMap<String, HashSet<Integer>> book = new HashMap<>();

    public void add(String lastName, int number) {
        HashSet<Integer> numbers = new HashSet<>();

        if (book.containsKey(lastName)) {
            book.get(lastName).add(number);
        } else {
            numbers.add(number);
            book.put(lastName, numbers);

        }
    }

    public void info() {
        System.out.println(book.entrySet());
    }

    public void get(String lastName) {
        if (!book.containsKey(lastName)) {
            System.out.println("Такой фамилии не найдено");
        } else {
            System.out.println(book.get(lastName));
            }
        }
    }
