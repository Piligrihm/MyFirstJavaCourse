package HomeWork4;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;

public class DataContainer<T> {
    private T item;
    private T[] data;

    /**
     * Метод toString - мереопределние метода toString класса Object (используем StringBuilder)
     * @param - не принимает параметров
     * @return возвращает строку
     */
    public DataContainer(T[] data) {
        this.data = data;
    }

    public DataContainer(Class<T[]> array, int size) {
        data = array.cast(Array.newInstance(array.getComponentType(), size));
    }


    int index = 0;
    int index1;
    /**
     * Метод add добавляет элемент в массив
     * @param item - принимаемое значение
     * @return вернет индекс добавленного элемента
     */
    public int add(T item) {

        if (item != null) {
            if (index >= data.length) {
                data = Arrays.copyOf(data, data.length + 4);
            }
            if (index < data.length & data[index] == null) {
                data[index] = item;
            }
            index1 = index;
            index++;
        } else {
            index1 = -1;
        }
        return index1;
    }

    /**
     * Метод T get получает из поля Data предварительно переданный объект
     * @param index - принимаемый индекс элемента
     * @return возвращает объект (значение элемента массива). Если элемент - null, то вернет "null"
     */
    public T get(int index) {
        if (index >= 0 & index < data.length) {
            return data[index];
        } else {
            return null;
        }
    }
    /**
     * Метод T[] getItems получает объекты поля Data
     * @param - не принимает никаких параметров
     * @return возвращает поле Data
     */
    public T[] getItems() {
        return data;
    }
    /**
     * Метод printLastIndex - тестовый метод
     * @param - не принимает никаких параметров
     * @return возвращает void. Выводит индекс последнего переданного элемента в консоль
     */
    public void printLastIndex() {
        System.out.println("Last added index = " + index1);
    }

    /**
     * Метод delete - удаляет элемент массива по заданному индексу
     * @param - принимает парметр - индекс эелемента
     * @return true, если удалось удалить элемент. Если нет - false
     */
    public boolean delete(int index) {
        boolean var;
        if (index == 0) {
            T[] data2 = (T[]) java.lang.reflect.Array.newInstance(data.getClass().getComponentType(), data.length - 1);
            System.arraycopy(data, 1, data2, 0, data.length - 1);

            data = data2;
            var = true;
        } else if (index == data.length - 1) {
            T[] data2 = (T[]) java.lang.reflect.Array.newInstance(data.getClass().getComponentType(), data.length - 1);
            if (data.length - 1 >= 0) {
                System.arraycopy(data, 0, data2, 0, data2.length);
            }
            var = true;
            data = data2;
        } else if (index > data.length - 1) {
            var = false;

        } else {
            T[] data2 = (T[]) java.lang.reflect.Array.newInstance(data.getClass().getComponentType(), data.length - 1);
            for (int i = 0; i < data.length; i++) {
                if (i > index) {
                    data2[i - 1] = data[i];
                }
                if (i == index) {
                    continue;
                }
                if (i < index) {
                    data2[i] = data[i];
                }
            }
            var = true;
            data = data2;

        }
        return var;
    }
    /**
     * Метод delete - удаляет элемент массива по заданному значению
     * @param - принимает парметр - значение эелемента
     * @return true, если удалось удалить элемент. Если нет - false
     */
    public boolean delete(T item) {
        int i = 0;
        for (T element : data) {
            if (element.equals(item)) {
                break;
            }
            i++;
            index = i;
        }
        return delete(index);

    }

    /**
     * Метод sort - сортирует данные, записанные в поле дата (сортирует элементы массива)
     * использует шейкерную сортировку
     * @param - принимает объект реализации сортировки Comparator
     * @return возвращает void
     */
    public void sort(Comparator<T> comparator) {
        if (comparator != null & data.length > 1) {
            T tempVar;
            int leftEl = 0;
            int rightEl = data.length - 1;

            do {
                for (int i = leftEl; i < rightEl; i++) {
                    if (data[i + 1] != null) {
                        if (comparator.compare(data[i], data[i + 1]) > 0) {
                            tempVar = data[i];
                            data[i] = data[i + 1];
                            data[i + 1] = tempVar;
                        }
                    }
                }
                rightEl--;
                for (int i = rightEl; i > leftEl; i--) {
                    if (data[i] != null) {
                        if (comparator.compare(data[i], data[i - 1]) < 0) {
                            tempVar = data[i];
                            data[i] = data[i - 1];
                            data[i - 1] = tempVar;
                        }
                    }
                }
                leftEl++;
            }
            while (leftEl < rightEl);

        }
    }
    /**
     * Метод toString - мереопределние метода toString класса Object (используем контактенацию строк)
     * @param - не принимает параметров
     * @return возвращает строку
     */
    /*@Override
    public String toString() {
        String str = "[";
        boolean var = false;
        for (int i = 0; i < data.length; i++) {
            if (data[i] != null) {
                if (var) {
                    str += ", ";
                } else {
                    var = true;
                }
                str += String.valueOf(data[i]);
            } else {
                continue;
            }
        }
        str += "]";
        return str;
    }*/

    /**
     * Метод toString - мереопределние метода toString класса Object (используем StringBuilder)
     * @param - не принимает параметров
     * @return возвращает строку
     */
    @Override
    public String toString() {
        boolean var = false;
        if (data == null) {
            return "null";
        }
        int iMax = data.length - 1;
        if (iMax == -1)
            return "[]";
        StringBuilder b = new StringBuilder();
        b.append('[');
        for (int i = 0; i < data.length; i++) {
            if (i == iMax) {
                b.append(']');
            }
            if (data[i] != null) {
                if (var) {
                    b.append(", ");
                }
                b.append(data[i]);
                var = true;

            } else {
                continue;
            }

        }
        return b.toString();
    }


    public static <T extends Comparable<T>> void sort(DataContainer<T> container) {
        if (container.data[0].compareTo(container.data[1]) > 0) {

        }


    }

    public static <T> void sort(DataContainer<T> container, Comparator<T> comparator) {
        if (comparator.compare(container.data[0], container.data[1]) > 0) {

        }


    }


}



