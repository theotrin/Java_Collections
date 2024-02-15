package br.com.theotrin.util.io.reader;

import java.io.*;

public class inputTest {
    public static void main(String[] args) throws IOException {
        FileInputStream arquivo = new FileInputStream("src/texto.txt");

        InputStreamReader arquivoLido = new InputStreamReader(arquivo);

        BufferedReader arquivoFinal = new BufferedReader(arquivoLido);

        String linha = arquivoFinal.readLine();

        while( linha != null){
            System.out.println(linha);
            linha = arquivoFinal.readLine();
        }
    }
}
