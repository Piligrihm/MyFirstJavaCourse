package HomeWork4;


import java.util.Arrays;

public class DataContainerMain {
    public static void main(String[] args) {
        DataContainer<Object> container = new DataContainer<Object>(Object[].class, 4);


        container.add(3);
        container.get(0);
        container.get(1);

        container.add(5);
        container.add(null);
        container.add(255);
        container.add(255);
        container.add(15);
        container.add(255);
        container.printLastIndex();
        container.add(null);
        container.printLastIndex();


        System.out.println("[" + container.get(5) + "]");
        System.out.println(Arrays.toString(container.getItems()));
        System.out.println(container.delete(3));
        System.out.println(container.delete(18));
        System.out.println(Arrays.toString(container.getItems()));

    }


}
