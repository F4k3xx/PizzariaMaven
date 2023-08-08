package api.pizzaria.pizzariamaven.pagamentos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.log4j.Log4j2;

import java.util.Scanner;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Log4j2
public class Pagamentos {
    private static Scanner entrada = new Scanner(System.in);
    private double valorPago;

    public void escolhaDoPagamento() {
        log.info("\n1. Cartão de Crédito/Débito/VR.");
        log.info("\n2. Dinheiro");
        log.info("\n3. Pix");
        log.info("\nDigite o número do meio escolhido: ");
        int meioDePagamento = entrada.nextInt();

        switch (meioDePagamento) {
            case 1:
                pagamentoPorCartao();
                break;
            case 2:
                pagamentoDinheiro();
                break;
            case 3:
                pagamentoEmPix();
                break;
            default:
                escolhaDoPagamento();
        }
    }

    public static void pagamentoDinheiro() {
        log.info("Pagamento em Dinheiro selecionado.");
    }

    public static void pagamentoEmPix() {
        log.info("Pagamento por PIX selecionando." +
                "\nPara efetuar o pagamento copie e cole o código abaixo na aba PIX do aplicativo do seu banco.");
        log.info("\n7163e29e-bdaf-4f02-b492-90e161b9ede7");
        log.info("\nPagamento confirmado.");
    }

    public static void pagamentoPorCartao() {
        log.info("Pagamento por cartão selecionado.\nSelecione a opção: ");

        log.info("\n1- Débito.\n2- Crédito (não parcelamos)\n3- Vale Refeição (VR).");
        byte opcaoDePagamento = entrada.nextByte();

        if (opcaoDePagamento == 1) {
            log.info("Cartão de Débito selecionado.");
            log.info("O motoboy levará a máquininha.");
        } else if (opcaoDePagamento == 2) {
            log.info("Cartão de Crédito selecionado.");
            log.info("O motoboy levará a máquininha.");
        } else if (opcaoDePagamento == 3) {
            log.info("Cartão Vale-Refeição selecionado.");
            log.info("O motoboy levará a máquininha.");

        } else {
            log.info("Selecione uma opção válida!");
            pagamentoPorCartao();
        }
    }
}
