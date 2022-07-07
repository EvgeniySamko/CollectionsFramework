import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws IOException {
        File f1 = new File("voyna.txt"); //Создание файлового дескриптора для входного файла
        String[] words;

        FileReader fr = new FileReader(f1);  //Создание объекта File Reader
        BufferedReader br = new BufferedReader(fr); //Создание объекта BufferedReader

        String s;

        int count = 0;

        while ((s = br.readLine()) != null) {  //Чтение содержимого из файла
            words = s.split(" ");  // Разделить слово пробелом
            for (String word : words) {
                Pattern input = Pattern.compile("[Сс]трад");
                Matcher mc = input.matcher(word);
                while (mc.find()) {//Поиск заданного слова
                    count++;//Если присутствует, увеличиваем количество на единицу
                }
            }
        }
        if (count != 0)  //Проверяем, не равен ли счет нулю
        {
            System.out.println("Данное слово присутствует " + count + " раз в файле");
        } else {
            System.out.println("Данное слово отсутствует в файле");
        }
        fr.close();




        for (int i = 1; i <= 10; i++) {
            System.out.println();
            for (int j = 1; j <= 10; j++) {
                System.out.print((i * j) + " \t");
            }
        }

    }}






