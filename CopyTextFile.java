package com.sch.igor;

import java.io.*;

public class CopyTextFile {

    public void start(File file1, File file2, File file3) {
        ArraysToFile(fileToArray(file1), fileToArray(file2), file3);

    }

    //Собирает все данные в одну строку и разделяет их пробелом что бы легче было вычленить слова.
    //Вычленивает слова по регулярке и возвращает массив со словами
    public String[] fileToArray(File file) {
        StringBuilder result = new StringBuilder();
        try (BufferedReader out = new BufferedReader(new
                FileReader(file))) {
            String str;
            while ((str = out.readLine()) != null) {
                result.append(str);
                result.append(" ");
            }
        } catch (IOException e) {
            System.out.println("ERROR " + e);
        }
        return result.toString().split("[\\s,.!?]+");
    }

    // Получает 2 массива со словами и путь к файлу, который сохранит общие слова
    public void ArraysToFile(String[] array1, String[] array2, File inFile) {
        try (PrintWriter a = new PrintWriter(inFile)) {
            for (int k = 0; k < array1.length; k++) {
                for (int i = 0; i < array2.length; i++) {
                    if (array1[k].equals(array2[i])) {
                        a.print(array1[k] + " ");
                    }
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("ERROR File Write " + e);
        }
    }
}
