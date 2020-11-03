package HomeWork4;

import java.util.Arrays;

public class DataContainerMain {
    public static void main(String[] args) {

        //Создаем объект класса c дженериком, который принимает массив целочисленных значений длиной 4 ячейки(элемента)
        DataContainer<Integer> container = new DataContainer<Integer>(Integer[].class, 4);

        // Наполняем значениями
        container.add(5);
        container.add(null);
        container.add(255);
        container.add(492);
        container.add(15);
        container.add(444);
        container.add(127);
        container.add(19);
        container.add(111);

        //Выводим в консоль индекс последнего добавленного элемента
        container.printLastIndex();
        container.add(777);
        container.printLastIndex();
        container.add(null);
        container.printLastIndex();
        //Получаем пердварительно сохраненный объект и выводим в консоль
        System.out.println(container.get(0));
        System.out.println(container.get(1));
        System.out.println(container.get(10));

        System.out.println("[" + container.get(5) + "]");
        //Получаем поле data (его содержимое) и выводим в консоль в виде строки
        System.out.println(Arrays.toString(container.getItems()));
        //Удаляем элемент по заданному индексу
        container.delete(2);
        //Удаляем элемент по заданному значению
        container.delete((Integer) 255);

        System.out.println(Arrays.toString(container.getItems()));
        //Получаем поле data (его содержимое) и выводим в консоль в виде строки, использую пееропределенный метод toString
        System.out.println(container.toString());
        //Сортируем значения в поле dataб используя заданный компаратор
        container.sort(new DataComparator<>());
        //Получаем поле data (его содержимое) и выводим полученный результат в консоль в виде строки
        System.out.println(container.toString());


    }


}
