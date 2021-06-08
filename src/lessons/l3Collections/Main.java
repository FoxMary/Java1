package lessons.l3Collections;

import java.util.*;

public class Main {
    public static class Box {
        String  color;
        int size;

        public Box(String  color, int size) {
            this.color = color;
            this.size = size;
        }

//        @Override
//        public int hashCode() {         //стандартный метод из класса Object
//            return color.length() + size * 17;      //приравнивает к какому то числу на основании объектов. НЕ ЯВЛЯЕТСЯ УНИКАЛЬНЫМ ЧИСЛОМ. Если объекты равны по equals, они обязаны быть равны по hashCode
//        }
//
//        @Override
//        public boolean equals(Object obj) {         //как следует сравнивать объекты
//            if (obj == null) return false;
//            if (obj instanceof Box) return false;
//            Box another = (Box) obj;
//            if (this.size == another.size && this.color.equals(another.color)) return true;
//            return false;
//        }
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();


//        HashSet<String> hs = new HashSet<>();       //множество уникальных элементов в любом порядке
//        HashSet<String> hs2 = new LinkedHashSet<>();        //сохраняет порядок заполнения
//        TreeSet<String> ts3 = new TreeSet<>();      //сохраняет в отсортированном виде
//        hs.add("A");        //метод add - boolean
//        hs.add("B");
//        hs.add("C");



//        LinkedHashMap       //возвращает в порядке заполнения
//        ThreeMap        //сортирует в порядке возрастания ключа
//
//        HashMap<String, String> hm = new HashMap<>();       //пары хранятся в рандомном порядке
//        hm.put("Russia", "Moscow");         //под одним ключем может лежать только одно значение
//        hm.put("Germany", "Berlin");
//        hm.put("England", "London");
//        hm.keySet();        //набор ключей, которые есть
//        hm.containsKey("Russia");       //есть ли такой ключ
//        hm.containsValue("Moscow");         //есть ли значение
//        hm.getOrDefault("France", "Empty");         //поиск по ключу, если нету "Empty"(иначе будет null)
//        hm.values();        //набор всех значений
//        System.out.println(hm.get("Russia"));
//        System.out.println(hm);         //все существующие пары ключ - значение
//
//        for (Map.Entry<String, String> o : hm.entrySet()) {
//            System.out.println(o);
//        }



//        Box box1 = new Box("Green",  10);
//        Box box2 = new Box("Red", 20);
//        System.out.println(box1.hashCode());
//        System.out.println(box2.hashCode());
//
//        System.out.println(box1 == box2);       //ссылается ли на один и тот же объект в памяти
//        System.out.println(box1.equals(box2));



//        LinkedList<String> list3 = new LinkedList<>();
//
//        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
//        list2.remove((Integer) 3);      //удаление с указанием, что это объект, а не индекс
//
//
//        ArrayList<String> list = new ArrayList<>();
//        list.add("A");
//        list.add("B");
//        list.add("C");
//        System.out.println(list);
//
//        list.set(0, "Z");       //заменит элемент по индексу
//        list.add(1, "E");       //добавит элемент со смещением
//        list.remove("A");       //удаление по объекту (удаляет 1 раз)
//        list.remove(1);     //удаление по индексу
//
//        while (list.remove("A"));       //удаление все А
//
//        list.contains("C");     //проверить есть ли С
//        list.indexOf("A");      //поиск индекса первой А
//        list.lastIndexOf("A");      //поиск индекса последней А






        //------------------------------------------------------------------------------------------------------------------------
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
