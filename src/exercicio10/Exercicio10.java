package exercicio10;

import java.util.Scanner;

/**
 *
 * @author Wellington F
 */
public class Exercicio10 {

    public static void main(String[] args) {
        int ano = 0;
        float valorVeiculo = 0.0f;
        float valorTotal = 0.0f;
        char desejaContinuar = 'S';
        float valorPorcentagem = 0.0f;
        float valorDesconto = 0.0f;
        int totVeiculos = 0;
        int totUsados = 0;

        while (desejaContinuar == 's' || desejaContinuar == 'S') {
            Scanner leitor = new Scanner(System.in);
            System.out.print("Informe o ano do veículo: ");
            ano = leitor.nextInt();
            System.out.print("Informe o valor do vaículo: ");
            valorVeiculo = leitor.nextFloat();

            if (ano <= 2000) {
                valorPorcentagem = 0.12f;
                totUsados++;
            } else {
                valorPorcentagem = 0.07f;
            }
            totVeiculos++;

            valorDesconto = valorVeiculo * valorPorcentagem;
            valorTotal = valorVeiculo - valorDesconto;

            System.out.printf("O valor do veículo com desconto é %.2f\n", valorTotal);

            System.out.println("Deseja continuar [S-Sim/N-Não]: ");
            desejaContinuar = leitor.next().charAt(0);

        }
        System.out.println("O total de veículos com o ano até 2000: " + totUsados);
        System.out.println("O total de carros: " + totVeiculos);
    }

}
