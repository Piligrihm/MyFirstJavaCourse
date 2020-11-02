package HomeWork4;

import java.util.Arrays;

public class DataContainerMain {
    public static void main(String[] args) {
        DataContainer<Integer> container = new DataContainer<Integer>(Integer[].class, 4);


        container.add(5);
        container.add(null);
        container.add(255);
        container.add(492);
        container.add(15);
        container.printLastIndex();
        container.add(777);
        container.printLastIndex();
        container.add(null);
        container.printLastIndex();

        System.out.println(container.get(0));
        System.out.println(container.get(1));
        System.out.println(container.get(10));

        System.out.println("[" + container.get(5) + "]");
        System.out.println(Arrays.toString(container.getItems()));

        //container.delete(2);

        //container.delete((Integer) 255);
        System.out.println(Arrays.toString(container.getItems()));

        System.out.println(container.toString());

        container.sort(new DataComparator<>());
        System.out.println(container.toString());


    }


}
