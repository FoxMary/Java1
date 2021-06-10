package lessons.l5;

public class Counter {
    private int value;
    private Object mon = new Object();

    public int getValue() {
        return value;
    }

//    public static synchronized void inc2() {     //в случае статического метода монитором выступает сам класс (Counter)
//
//    }

//    public void inc3() {        //в роли монитора выступает назначенный объект
//        synchronized (mon) {
//            value++;
//        }
//    }

    public synchronized void inc() {        //мотинотором является объект
        value++;
    }

    public synchronized void dec() {
        value--;
    }
}
