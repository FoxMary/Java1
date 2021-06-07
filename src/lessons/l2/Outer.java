package lessons.l2;

public class Outer {
    private int outerVar;

    public Outer(int outerVar) {
        this.outerVar = outerVar;
    }

    public void outerInfo() {
        System.out.println(outerVar);
//        System.out.println(innerVar);       //внешний класс не имеет доступ к полям внутреннего класса
    }

    class Inner {                                       //нельзя создать внутренний класс, без указания на внешний
        private int innerVar;

        public Inner(int innerVar) {
            this.innerVar = innerVar;
        }

        public void innerInfo() {
            System.out.println(innerVar);
            System.out.println(outerVar);       //внутренний класс имеет доступ ко всем полям доступа внешнего класса
        }
    }
}
