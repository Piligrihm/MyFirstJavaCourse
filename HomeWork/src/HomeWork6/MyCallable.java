package HomeWork6;

import HomeWork5.EasySearch;
import HomeWork5.ISearchEngine;

import java.util.concurrent.Callable;

public class MyCallable implements Callable {
    private final String text;
    private final String word;

    public MyCallable(String text, String word) {
        this.text = text;
        this.word = word;

    }
    /*
    Данный метод реализован с помощью лямбд
    метод подсчитывает, сколько раз то или иное слово упоминалось в тексе
    @param String text принимает текст, в котором ищем слово
    @param String word принимает слово, которое ищем словов тексте
    @ return (long) возвращает информацию о кол-ве упоминаний заданного слова в заданном тексте
    */

    ISearchEngine search = (text, word) -> {
        text = text.toLowerCase();
        word = word.toLowerCase();

        EasySearch easySearch = new EasySearch();
        return easySearch.search(text, word);
    };

    /*
    метод подсчитывает, сколько раз то или иное слово упоминалось в тексе
    @param String text принимает текст, в котором ищем слово
    @param String word принимает слово, которое ищем словов тексте
    @ return (long) возвращает информацию о кол-ве упоминаний заданного слова в заданном тексте
    */
//    ISearchEngine search = new ISearchEngine() {
//
//        @Override
//        public long search(String text, String word) {
//            EasySearch easySearch = new EasySearch();
//            text = text.toLowerCase();
//            word = word.toLowerCase();
//            return (long) easySearch.search(text, word);
//        }
//    };


    @Override
    public Object call() throws Exception {
        return search.search(text, word);
    }
}
