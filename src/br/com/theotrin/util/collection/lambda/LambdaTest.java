package br.com.theotrin.util.collection.lambda;

interface InterfaceLambda {
    public String executar(String texto);
}

interface Icalc {
    public double soma(double num1, double num2);
}

public class LambdaTest {
    public static void main(String[] args) {

        InterfaceLambda lambdaTest = (String text) -> {
            return text;
        };

        System.out.println(lambdaTest.executar("Lorem ipsu"));

        Icalc calculadora = (double numero1, double numero2) -> {
            return numero1+numero2;
        };

        System.out.println(calculadora.soma(12,12.4));
    }
}
