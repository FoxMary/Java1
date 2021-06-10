package lessons.l3Collections;

public class Box implements Comparable {        //интерфейс сравниваемые
    int weight, size;

    public Box(int weight) {
        this.weight = weight;
    }

    @Override
    public int compareTo(Object o) {            //как сравнивать
        if (this == o) {
            return 0;
        }
        if (!(o instanceof Box)) {
            throw new RuntimeException("?");
        }
        Box another = (Box) o;
        return  -(this.weight - another.weight);        //сортировка по убыванию веса
    }

    @Override
    public String toString() {
        return "Box{ " + "weight=" + weight + ", size=" + size + "}";
    }
}
