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
        //System.out.println(uniq);


        Map<String, Integer> top = new HashMap<>();
        for (String word : s) {
            top.put(word, top.getOrDefault(word, 0) + 1);
        }


        //сортировка коллекции по значениям (по возрастанию)
        Map<String, Integer> top1 = top.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed()).limit(10)
                .collect(LinkedHashMap::new, (m, c) -> m.put(c.getKey(), c.getValue()),
                        LinkedHashMap::putAll);

        // Вывод топ-10 слов
        for (Map.Entry<String, Integer> entry : top1.entrySet()) {
            System.out.println(entry);

        }
        ;
        EasySearch easySearch = new EasySearch();
        System.out.println("easySearch - кол-во упоминаний слова 'война' - " + easySearch.search(str, "война"));
        System.out.println("easySearch - кол-во упоминаний слова 'и' - " + easySearch.search(str, "и"));
        System.out.println("easySearch - кол-во упоминаний слова 'мир' - " + easySearch.search(str, "мир"));

        RegExSearch regExSearch = new RegExSearch();
        System.out.println("regExSearch - кол-во упоминаний слова 'война' - " + regExSearch.search(str, "война"));
        System.out.println("regExSearch - кол-во упоминаний слова 'и' - " + regExSearch.search(str, "и"));
        System.out.println("regExSearch - кол-во упоминаний слова 'мир' - " + regExSearch.search(str, "мир"));
    }


}
