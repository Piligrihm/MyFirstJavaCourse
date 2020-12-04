package HomeWork1;


public class Task3 {
    public static void main(String[] args) {

        int a = 20;
        int b = 15;
        double angleDegrees = 30.0;

        // Возведение в степень. Возвращает double
        double pow = Math.pow(a, b);
        System.out.println("Число а в степени b = " + pow);

        // Сравнивает значения и возврщает меньшее из них

        int min = Math.min(a, b);
        System.out.println("Меньшее из них - " + min);

        // Метод Math.sqrt вычисляет квадратный корень числа. Метод возвращает перменную double
        double sqrt = Math.sqrt(12);

        /*Выводит значение переменной в консоль. При этом ограничивая кол-во символов после запятой до 2-ух */
        System.out.printf("Квадратный корень из 12 = %.2f", sqrt);

        // Переводим градусы в радианы
        double angelRadians = Math.toRadians(angleDegrees);

        // Метод Math.tan вычисляет тангенс угла. Только угол нужно указывать в радианах. Метод возвращает перменную double
        double tan = Math.tan(angelRadians);
        System.out.printf("\nТангенс угла %.1f градусов равен %.3f", angleDegrees, tan);

        // Метод Math.sin вычисляет синус угла. Только угол нужно указывать в радианах. Метод возвращает перменную double
        double sin = Math.sin(angelRadians);
        System.out.printf("\nСинус угла %.1f градусов равен %.3f", angleDegrees, sin);


    }

}
