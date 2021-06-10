package lessons.lambda;

public class Main {
    public static void main(String[] args) {

        MyInterface mi = (a, b, c) -> System.out.println(a + c + b);                //можно сохранить

        //---------------------------------------------------------

        int x = 0;
        x++;
        int w = x;

        doIt(new MyInterface() {
            @Override
            public void doSomething(int a, int b, String c) {
//                System.out.println(x);                                      //нельзя использовать изменяемые данные
                System.out.println(w);                                      //можно положить в неизменяемые :)
            }
        });

        //-----------------------------------------------------------

        doIt((a, b, c) -> System.out.println(w));

        //-----------------------------------------------------------
    }

    public static void doIt(MyInterface mi) {

    }
}
