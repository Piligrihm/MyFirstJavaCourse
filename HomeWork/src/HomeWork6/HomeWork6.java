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
            System.out.println("Кол-во упоминаний слова 'мир' - " + callable.call());
        } catch (Exception e) {
            e.printStackTrace();
        }

        StringSplitter splitter = new StringSplitter();
        ArrayList<String> parts = splitter.textForParts(str, 6);

        System.out.println("------------------------------------");
        int result = 0;
        ExecutorService executor = Executors.newFixedThreadPool(2);

        for (String sublist : parts) {
            MyCallable callabl = new MyCallable(sublist, "война");
            Future<Integer> future = executor.submit(callabl);
            System.out.println(future.get());
        }

        executor.shutdown();

    }
}
