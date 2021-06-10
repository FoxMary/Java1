package hw.hw5;

/**Необходимо написать два метода, которые делают следующее:
 * 1) Создают одномерный длинный массив, например:
 * static final int size = 10000000;
 * static final int h = size / 2;
 * float[] arr = new float[size];
 * 2) Заполняют этот массив единицамиж
 * 3) Засекают время выполнения: long a =System.currentTimeMillis();
 * 4) Проходят по всему массиву и для каждой ячейки считают новое значение по формуле :
 * arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
 * 5) Проверяется время окончания метода System.currentTimeMillis();
 * 6) В консоль выводится время работы: System.out.println(System.currentTimeMillis() - a);
 *
 * Отличие первого метода от второго:
 * Первый просто пробежит по массиву и вычисляет значения.
 * Второй разбивает массив на два массива, в двух потоках высчитывает новые значения и потом склеивает эти массивы обратно в один.
 *
 * Пример деления одного массива на два:
 * System.arraycopy(arr, 0, a1, 0, h);
 * System.arraycopy(arr, h, a2, 0, h);
 *
 * Пример обратной склейки:
 * System.arraycopy(a1, 0, arr, 0, h);
 * System.arraycopy(a2, 0, arr, h, h);
 *
 * Примечание:
 * System.arraycopy() - копирует данные из одного массива в другой:
 * System.arraycopy(массив-источник, откуда начинаем брать данные из массива-источника, массив-назначение,
 * откуда начинаем записывать данные в массив-назначение, сколько ячеек копируем)
 * По замерам времени:
 * Для первого метода надо считать время только на цикл расчета:
 * for (int i = 0; i < size; i++) {
 *     arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(o.4f + i / 2);
 *  }
 * Для второго метода замеряете время разбивки массива на 2, просчета каждого из двух массивов и склейки.
 */
public class Main {
    public static void main(String[] args) {
        method1();
        method2();
    }

    public static void method1() {
        final int size = 10000000;
        final int h = size / 2;
        float[] arr = new float[size];

        for (float f : arr) f = 1;
        long a =System.currentTimeMillis();
        for(float f : arr) f = (float)(f * Math.sin(0.2f + f / 5) * Math.cos(0.2f + f / 5) * Math.cos(0.4f + f / 2));
        System.out.println("Вычисление целого массива: " + (System.currentTimeMillis() - a) + "мс");

    }

    public static void method2() {
        final int size = 10000000;
        float[] arr = new float[size];
        for (float f : arr) f = 1;
        final int h = size / 2;
        float[] a1 = new float[h];
        float[] a2 = new float[h];

        long a =System.currentTimeMillis();
        System.arraycopy(arr, 0, a1, 0, h);
        System.arraycopy(arr, h, a2, 0, h);

        new Thread(() -> {
            for(float f : a1) f = (float)(f * Math.sin(0.2f + f / 5) * Math.cos(0.2f + f / 5) * Math.cos(0.4f + f / 2));
        }).start();

        new Thread(() -> {
            for(float f : a2) f = (float)(f * Math.sin(0.2f + f / 5) * Math.cos(0.2f + f / 5) * Math.cos(0.4f + f / 2));
        }).start();

        System.arraycopy(a1, 0, arr, 0, h);
        System.arraycopy(a2, 0, arr, h, h);
        System.out.println("Вычисление разделенного массива: " + (System.currentTimeMillis() - a) + "мс");
    }
}
