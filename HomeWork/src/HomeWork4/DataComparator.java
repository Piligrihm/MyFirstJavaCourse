package HomeWork4;

import java.util.Comparator;

public class DataComparator<T extends Comparable> implements Comparator<T> {

    /**
     * compare реализует сравнение объектов
     *
     * @param ob1 - первый объект
     * @param ob2 - второй объект
     * @return возвращает результат сравнения
     */
    @Override
    public int compare(T ob1, T ob2) {
        return ob1.compareTo(ob2);
    }
}

