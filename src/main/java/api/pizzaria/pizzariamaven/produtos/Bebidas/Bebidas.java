package api.pizzaria.pizzariamaven.produtos.Bebidas;

import lombok.extern.log4j.Log4j2;

import java.util.Scanner;

@Log4j2
public class Bebidas {
    private Scanner sc = new Scanner(System.in);
    private int valorTotalBebidas = 0;
    private int soma;

    public int catalogoBebidas() {
        String continuar;
        do {
            log.info("======= BEBIDAS =======");
            log.info("1. Refrigerante - R$5.0");
            log.info("2. Água - R$6.0");
            log.info("3. Suco - R$7.0");
            log.info(">>>>> Escolha o número da sua bebida! <<<<<<");
            int bebidas = sc.nextInt();

            int quantidadeRefrigerante = 0;
            int quantidadeAgua = 0;
            int quantidadeSuco = 0;
            switch (bebidas) {
                case 1:
                    log.info("Você escolheu Refrigerante!");
                    log.info("Quantos você deseja?");
                    quantidadeRefrigerante = sc.nextInt();
                    valorTotalBebidas += 5;
                    log.info("Deseja mais alguma bebida? (S ou N)");
                    break;
                case 2:
                    log.info("Você escolheu Água!");
                    log.info("Quantas você deseja?");
                    quantidadeAgua = sc.nextInt();
                    valorTotalBebidas += 6;
                    log.info("Deseja mais alguma bebida? (S ou N)");
                    break;
                case 3:
                    log.info("Você escolheu Suco!");
                    log.info("Quantos você deseja?");
                    quantidadeSuco = sc.nextInt();
                    valorTotalBebidas += 7;
                    log.info("Deseja mais alguma bebida? (S ou N)");
                    break;
                default:
                    log.info("Opção inválida!");
            }
            continuar = sc.next();
            int totalBebidas = quantidadeRefrigerante + quantidadeAgua + quantidadeSuco;
            soma = totalBebidas * valorTotalBebidas;
        }
        while (continuar.equals("s") || continuar.equals("S"));

        log.info("Valor bebidas " + soma);

        return soma;
    }
}