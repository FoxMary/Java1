package lessons.l5;

import lessons.l4.MyForm;

public class Main {
    public static void main(String[] args) throws Exception{
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    while (true) {
                        if (Thread.currentThread().isInterrupted()) {           //обозначение точки безопасного выхода, если команда interrupt пришла, когда потом находится в режиме ожидания, появляется ошибка
                            break;
                        }
                        Thread.sleep(500);
                        System.out.println("A");
                    }
                } catch (InterruptedException e) {
                        e.printStackTrace();
                }
            }
        });
        t1.start();
        Thread.sleep(600);
        t1.interrupt();         //прервать выполнение потока


//        Counter counter = new Counter();
//
//        Thread t1 = new Thread(() -> {          //сокращенный вариант(лямбда)
//            for (int i = 0; i < 100; i++) {
//                counter.inc();
//                try {
//                    Thread.sleep(1);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        });
//
//        Thread t2 = new Thread(() -> {          //сокращенный вариант(лямбда)
//            for (int i = 0; i < 100; i++) {
//                counter.dec();
//                try {
//                    Thread.sleep(1);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        });



//        Thread t1 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 0; i < 100; i++) {
//                    counter.inc();
//                }
//            }
//        });
//        t1.start();
//        t2.start();
//
//        t1.join();
//        t2.join();
//
//        System.out.println(counter.getValue());


//        Thread t1 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                while (true) {          //приложение не завершит работу, пока активен хотя бы 1 поток
//                    try {
//                        Thread.sleep(1000);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                    System.out.println("X");
//                }
//            }
//        });

//        t1.setDaemon(true);     //служебный поток, работает до тех пор, пока работает хотя бы один обычный поток
//        t1.setPriority(1);      //задает приоритет от 1 до 10, рекомендация для ОС(не строгое указание)
//        t1.stop();              //не рекомендуется использовать никогда
//        t1.start();
//
//        System.out.println("Start");
//        Thread.sleep(2000);
//        System.out.println("End");

//        Thread t1 =new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println(1);
//            }
//        });

//        Thread t2 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println(2);
//            }
//        });
//
//        t1.start();
//        t2.start();
//
//        t1.join();          //тот поток, в котором был вызван join будет ждать пока t1 закончит свою работу (ожидание завершения другого потока)
//        t2.join();
//
//        Thread.sleep(1000);         //текущий поток перейдет в режим ожидания на 1с

//        System.out.println("A");


//        Thread t = new Thread(new Runnable() {      //анонимный внутренний класс
//            @Override
//            public void run() {
//                System.out.println(1);
//            }
//        });
//        t.start();

//        -----------------------------------------------       аналог анонимного класса выше
//        public class Main3$1 implements Runnable {
//                @Override
//                public void run() {
//                    System.out.println(1);
//                }
//        }
//
//        Main3$1 n1 = new Main3$1();
//        Thread t = new Thread(n1);
//        t.start();
//        -------------------------------------------------

//        System.out.println(Thread.currentThread().getName());       //основной поток main
//
//        Thread rt1 = new Thread(new MyRunnable());
//        Thread rt2 = new Thread(new MyRunnable());
//
//        rt1.start();
//        rt2.start();


//        MyTread mt1 = new MyTread();        //создание потока
//        MyTread mt2 = new MyTread();
//
//        mt1.start();        //run - выполняется поочереди, start - выполняется параллельно
//        mt2.start();
    }
}
