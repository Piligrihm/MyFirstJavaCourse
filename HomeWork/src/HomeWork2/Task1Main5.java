package HomeWork2;

public class Task1Main5 {
    public static void main(String[] args) {
        int a = 2;
        int b = 1;
        int columns;
        String result = "";

        for (int lines = 1; lines <= 18; lines++) {

            // цикл ограничивает строку 4-мя столбиками
            for (columns = 0; columns < 4; columns++) {

                result = result + (a + " x " + b + " = " + (a * b) + "\t|\t");
                a++;
            }

            System.out.println(result);
            if (lines < 9) {
                a = 2;
                b++;
                result = "";
            }

            if (lines == 9) {
                System.out.println("-------------------------------------------------------------");
                result = "";
                b = 1;
            }

            if (lines > 9) {
                a = 6;
                b++;
                result = "";
            }
        }

    }
}






