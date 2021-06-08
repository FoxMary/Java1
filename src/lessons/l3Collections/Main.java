package lessons.l3Collections;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();

        System.out.println(ll);
        Boolean f = ll.offer("a");
        System.out.println(ll + " " + f);


//        ArrayList<String > states = new ArrayList<>();
//        states.add("Russia");
//        states.add("USA");
//        states.add("France");
//        states.add("France");
//        states.add("Spain");

//        Iterator<String> iter = states.iterator();          //итератор маркирует каждый элемент и проверяет посещал его или нет
//        ListIterator<String> iter2 = states.listIterator(); //расширеный функционал итератора
        
//        while (iter.hasNext()) {
//            if (iter.next().equalsIgnoreCase("France")) iter.remove();
//        }
////равнозначные записи
//        states.removeIf(s -> s.equalsIgnoreCase("France"));


//        for (int i = 0; i < states.size(); i++) {                           //при удалении объекта, остальные элементы смещаются
//            if (states.get(i).equalsIgnoreCase("France")) {             //сравнение без учета регистра
//                states.remove(i);
//            }
//        }
        
//        System.out.println(states);


//        ArrayList<Integer> ai = new ArrayList<>(1000000);       //initialCapacity - начальная емкость
//        ArrayList<Integer> ai = new ArrayList<>();
//
//        ai.add(1);
//        ai.add(2);
//        ai.add(3);
//
//        if (ai.contains(1)) {                   //есть ли такой элемент в коллекции
//            System.out.println("YES");
//        }

//        ai.trimToSize();                            //обрезка Capacity до необходимого размера
//        System.out.println(ai.get(1));          //вызов по индексу
//        System.out.println(ai.size());
//        ai.remove(1);                                 //удаление по индексу
//        ai.remove((Integer) 1);                 //удаление по объекту
//            ai.set(0, 5);                               //добавление по индексу (Замена значения)
//        ai.set(ai.size() / 2, 5);                   //вставить в середину
//        System.out.println(ai);

//        int[] arr = {1, 2, 3, 4};
//        int[] arr2 = new int[20];
//
//        System.arraycopy(arr, 0, arr2, 0, arr.length);
//        arr2[5] = 1;
//        System.out.println(Arrays.toString(arr2));
    }
}
