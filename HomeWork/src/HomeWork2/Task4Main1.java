package HomeWork2;

import java.util.Arrays;

public class Task4Main1  {
    public static void main(String[] args) {

        System.out.println("!!! Пузырьковая сортировка !!!");

        int[] arr1 = {1, 2, 3, 4, 5, 6};
        System.out.println("\nМассив № 1 до сортировки - " +Arrays.toString(arr1));
        for (int elements: arr1){
            Sorters.bubbleSort(arr1);
        }
        System.out.println("Массив № 1 после сортировки - " +Arrays.toString(arr1));

        int[] arr2 = {1,1,1,1};
        System.out.println("\nМассив № 2 до сортировки - " +Arrays.toString(arr2));
        for (int elements: arr2){
            Sorters.bubbleSort(arr2);
        }
        System.out.println("Массив № 2 после сортировки - " +Arrays.toString(arr2));


        int[] arr3 = {9,1,5,99,9,9};
        System.out.println("\nМассив № 3 до сортировки - " + Arrays.toString(arr3));
        for (int elements: arr3){
            Sorters.bubbleSort(arr3);
        }
        System.out.println("Массив № 3 после сортировки - " +Arrays.toString(arr3));

        int[] arr4 = {};
        System.out.println("\nМассив № 4 до сортировки - " +Arrays.toString(arr4));
        for (int elements: arr4){
            Sorters.bubbleSort(arr4);
        }
        System.out.println("Массив № 4 после сортировки - " +Arrays.toString(arr4));




    }
}
