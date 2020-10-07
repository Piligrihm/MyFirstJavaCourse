package HomeWork2;

public class Sorters {
    public static void bubbleSort(int[] array) {
        // i - номер прохода
        for (int i = 0; i < array.length - 1; i++) {
            // внутренний цикл прохода
            for (int j = array.length - 1; j > i; j--) {
                if (array[j - 1] > array[j]) { // если предпоследний элемент больше последнего
                    int tempVar = array[j - 1]; // записываем значение предпоследнего в о временную переменную
                    array[j - 1] = array[j]; // Присваиваем значение последнего пердпоследнему
                    array[j] = tempVar; // Присваиваем последнему значение временной перменной
                }
            }
        }
    }

    public static void shakerSort(int array[]) {
        int tempVar;
        int leftEl = 0;
        int rightEl = array.length - 1;
        do {
            for (int i = leftEl; i < rightEl; i++) {
                if (array[i] > array[i + 1]) {
                    tempVar = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tempVar;
                }
            }
            rightEl--;
            for (int i = rightEl; i > leftEl; i--) {
                if (array[i] < array[i - 1]) {
                    tempVar = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = tempVar;
                }
            }
            leftEl++;
        } while (leftEl < rightEl);
    }
}
