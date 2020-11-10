package HomeWork5;

import java.io.*;
import java.util.*;

public class HomeWork5Main1 {
    public static void main(String[] args) {
        StringBuilder builder = null;

        try (FileReader reader = new FileReader("HomeWork" + File.separator + "resources" + File.separator + "Война и мир_книга.txt")) {
            builder = new StringBuilder();
            int read;
            while ((read = reader.read()) > -1) {
                builder.append((char) read);

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        assert builder != null;
        String str = builder.toString();

        str = str.replaceAll("\\p{P}|\\n", "");

        // str = str.replaceAll("\\.|\\,+ |\\--|\\n|\\!|\\(|\\)|\\:|\\'|\\?|\\;|\"/g|\\*|\\=", " ");

        String[] s = str.split(" +");
        System.out.println(s.length);

        Set<String> uniq = new TreeSet<>(Arrays.asList(s));
      //  System.out.println(uniq);


        Map<String, Integer> top = new HashMap<>();
        for (String word : s) {
            top.put(word, top.getOrDefault(word, 0) + 1);
        }




       //сортировка коллекции по значениям (по возратсанию)
        top.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed()).limit(10)
                 .forEach(System.out::println);


    }

}
