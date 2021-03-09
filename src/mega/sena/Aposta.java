package mega.sena;

import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Scanner;

public class Aposta {
    public void megaSena() {
        Scanner entrada = new Scanner(System.in);

        int numeros, jogos, numgerado;
        int contador;

        LinkedHashSet<Integer> lista = new LinkedHashSet<Integer>(15);

        System.out.println("Quantas opostas você quer gerar? ");
        jogos = entrada.nextInt();

        Random random = new Random();
        for (contador = 1; contador <= jogos; contador++) {
            System.out.println("Números de dezenas: " + contador + "º " + "Jogo?");
            numeros = entrada.nextInt();

            while (numeros < 6 || numeros > 15) {
                System.out.println("Erro!");
                System.out.println("Digite novamente");
                numeros = entrada.nextInt();
            }

            System.out.println("Jogo " + contador);

            while (lista.size() < numeros) {
                numgerado = random.nextInt(60) + 1;
                lista.add(numgerado);
            }

            System.out.println(lista);

            lista.clear();

        }
        entrada.close();
    }
}