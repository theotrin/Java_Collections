package br.com.theotrin.util.io.writer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriterTest {
    public static void main(String[] args) throws IOException {
        FileWriter arquivo = new FileWriter("src/texto.txt", true);

        BufferedWriter bufferedWriter = new BufferedWriter(arquivo);

        bufferedWriter.append("\nJava é muito bom");
        bufferedWriter.close();
    }
}
