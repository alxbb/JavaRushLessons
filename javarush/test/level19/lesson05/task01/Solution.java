package com.javarush.test.level19.lesson05.task01;

/* Четные байты
Считать с консоли 2 имени файла.
Вывести во второй файл все байты с четным индексом.
Пример: второй байт, четвертый байт, шестой байт и т.д.
Закрыть потоки ввода-вывода.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inFile  = br.readLine();
        String outFile = br.readLine();
        br.close();

        if(!new File(inFile).exists()) return;

        FileReader fr = new FileReader(inFile);
        FileWriter fw = new FileWriter(outFile);

        while(fr.ready()){
            fr.read();
            fw.write(fr.read());
        }

        fr.close();
        fw.close();

    }
}
