package HomeWork5;

public class EasySearch implements ISearchEngine {

    /*
    метод подсчитывает, сколько раз то или иное слово упоминалось в тексе
    @param String text принимает текст, в котором ищем слово
    @param String word принимает слово, которое ищем словов тексте
    @ return возвращает информацию о кол-ве упоминаний заданного слова в заданном тексте
    */

    public long search(String text, String word) {
        text = text.toLowerCase(); // переводит текст в нижний регистр
        word = word.toLowerCase(); // переводит слово в нижний регистр
        long counter = 0;
        int i = 0;

        while (i != -1) {

            i = text.indexOf(" " + word + " ", i+1);
            counter++;
        }
        return counter;
    }


}
