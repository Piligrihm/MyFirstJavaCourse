package HomeWork2;

public class Task1Main2 {
    public static void main(String[] args) {

        String strResult = "";
        String fin = "";
        int intResult = 1;

        for (int progArg = Integer.parseInt(args[0]); progArg > 0; progArg /= 10) {

            int b = progArg % 10; // используем оеперацию "остаток от деления на 10" для "переборки" цифр в числе
            String res = " * ";
            intResult *= b; // перемножаем цифры в числе
            strResult = b + res;
            fin += strResult; // создаем строку из цифр, составляющих введенное число

        }

        String reversedString = new StringBuffer(fin).reverse().toString(); // создает новую строку из старой (символы реверсированы)
        StringBuffer finalStr = new StringBuffer(reversedString); // создаем объект класса StringBuffer
        finalStr.delete(0,2); // удаляем символы с нулевого по второй

        System.out.println(finalStr + " = " + intResult);



    }
}
