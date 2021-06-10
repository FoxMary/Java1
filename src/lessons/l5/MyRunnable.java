package lessons.l5;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " " + Thread.currentThread().getName());         //узнать имя потока
            try {
                Thread.sleep(1);            //задержка на 1 мс
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
