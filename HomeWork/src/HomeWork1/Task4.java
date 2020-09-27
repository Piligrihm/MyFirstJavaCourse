package HomeWork1;

public class Task4 {
    public static void main(String[] args) {

        boolean status = sleepIn(false, false);

        if (status == true) {
            System.out.println("Можем поспать по-дольше!");
        } else {
            System.out.println("Пора вставать на работу!");
        }
    }

    public static boolean sleepIn(boolean weekDay, boolean vacation) {

        if (!weekDay || vacation) {
            return true;

        } else if (weekDay && !vacation) {
            return false;

        } else {
            return false;

        }

    }
}
