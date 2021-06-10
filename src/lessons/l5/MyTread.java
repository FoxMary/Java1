package lessons.l5;

public class MyTread extends Thread {       //множественное наследование запрещено( нельзя при необходимости унаследоваться от чего то еще
    //есть смысл наследоваться от Thread только при необходимости добавить особый функционал
    @Override
    public void run() {             //в отдельном потоке
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
