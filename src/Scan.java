import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Scan {
    public static void main(String[] args) throws IOException {
        File f2 = new File("voyna.txt");
        FileReader reader = new FileReader(f2);
        Scanner scanner = new Scanner(reader);
        scanner.useDelimiter("\\s");
        List<String> st = new ArrayList<>();
        int count = 0;
        while (scanner.hasNext()) {
            String words = scanner.next();
            st.add(words);
        }
        for (String word : st) {
            Pattern input = Pattern.compile("[Сс]трад");
            Matcher mc = input.matcher(word);
            while (mc.find()) {//Поиск заданного слова
                count++;//Если присутствует, увеличиваем количество на единицу
            }
        }
        if (count != 0)  //Проверяем, не равен ли счет нулю
        {
            System.out.println("Данное слово присутствует " + count + " раз в файле");
        } else {
            System.out.println("Данное слово отсутствует в файле");
        }
        scanner.close();
    }
}










