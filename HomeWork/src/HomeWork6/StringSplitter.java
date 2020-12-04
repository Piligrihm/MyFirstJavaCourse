package HomeWork6;

import java.util.ArrayList;

public class StringSplitter {

    public ArrayList<String> textForParts(String text, int partCount) {
        String[] str = text.split(" +");
        ArrayList<String> parts = new ArrayList<String>();
        StringBuilder stringBuffer = new StringBuilder();
        int count = 0;
        int index = 0;
        long partSize = str.length / partCount;
        while (index != str.length) {
            if (count <= partSize) {
                count++;
                stringBuffer.append(str[index]).append(" ");
                index++;
            } else {
                parts.add(stringBuffer.toString());
                stringBuffer = new StringBuilder();
                count = 0;
            }
        }
        if (stringBuffer.length() > 0){
            parts.add(stringBuffer.toString());
        }
        return parts;
    }

}
