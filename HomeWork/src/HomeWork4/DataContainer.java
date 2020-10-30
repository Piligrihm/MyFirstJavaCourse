package HomeWork4;

import java.lang.reflect.Array;
import java.util.Arrays;

public class DataContainer<T> {
    private T item;
    private T[] data;

    public DataContainer(Class<T[]> array, int size) {
        data = array.cast(Array.newInstance(array.getComponentType(), size));
    }


    int index = 0;
    int index1;

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

    public T get(int index) {
        if (index >= 0) {
            return data[index];
        } else {
            return null;
        }
    }

    public T[] getItems() {
        return data;
    }

    public void printLastIndex() {
        System.out.println("Last added index = " + index1);
    }


    boolean delete(int index) {
        boolean var;
        if (index == 0) {
            T[] data2 = (T[]) new Object[data.length - 1];
            System.arraycopy(data, 1, data2, 0, data2.length);
            data = data2;
            var = true;
        } else if (index == data.length - 1) {
            T[] data2 = (T[]) new Object[data.length - 1];
            for (int i = 0; i < data.length - 1; i++) {
                data2[i] = data[i];

            }
            var = true;
            data = data2;
        } else if (index > data.length-1) {
            var = false;

        } else {
            T[] data2 = (T[]) new Object[data.length - 1];
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

   /* boolean delete(E item){

    }*/

}



