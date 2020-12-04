package HomeWork6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.function.Function;

public class HomeWork6 {
    public static void main(String[] args) throws Exception {
        StringBuilder builder = null;

        try (FileReader reader = new FileReader("HomeWork" + File.separator + "resources" + File.separator + "Война и мир_книга.txt")) {
            builder = new StringBuilder();
            int read;
            while ((read = reader.read()) > -1) {
                builder.append((char) read);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        assert builder != null;
        String str = builder.toString();

        str = str.replaceAll("\\p{P}|\\n", "");

        //String[] s = str.split(" +");


        MyCallable callable = new MyCallable(str, "война");
        try {
            System.out.println("Кол-во упоминаний слова 'война' - " + callable.call());
        } catch (Exception e) {
            e.printStackTrace();
        }

        StringSplitter splitter = new StringSplitter();
        ArrayList<String> parts = splitter.textForParts(str, 1000);

        System.out.println("------------------------------------");

        ExecutorService executor = Executors.newFixedThreadPool(3);
        Future <Long> firstWord;
        Future <Long> secondWord;
        Future <Long> thirdWord;
        Long count1 = 0L;
        Long count2 = 0L;
        Long count3 = 0L;


        for (String part : parts) {
            MyCallable callabl = new MyCallable(part, "война");
            MyCallable callable1 = new MyCallable(part, "и");
            MyCallable callable2 = new MyCallable(part, "мир");
            firstWord = executor.submit(callabl);
            secondWord = executor.submit(callable1);
            thirdWord = executor.submit(callable2);
            count1 += firstWord.get();
            count2 += secondWord.get();
            count3 += thirdWord.get();


        }
        System.out.println("Слово 'война' встречается в тексте " + count1);
        System.out.println("Слово 'и' встречается в тексте " + count2);
        System.out.println("Слово 'мир' встречается в тексте " + count3);

        executor.shutdown();

    }
}
