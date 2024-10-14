package principal;

import utilidades.FuncoesUteis;

public class Main {

    public static void main(String[] args) {
        FuncoesUteis util = new FuncoesUteis();

        // Testando o método soma
        int resultadoSoma = util.soma(10, 20);
        System.out.println("Resultado da soma: " + resultadoSoma);

        // Testando o método triangulo
        System.out.println("Triângulo com altura 8:");
        util.triangulo(8);

        // Testando o método printArquivo
        System.out.println("Conteúdo do arquivo:");
        util.printArquivo("arquivo.txt");
    }
}
