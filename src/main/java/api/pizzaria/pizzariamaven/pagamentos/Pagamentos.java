//package api.pizzaria.pizzariamaven.pagamentos;
//
//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//import lombok.extern.log4j.Log4j2;
//
//import java.util.Scanner;
//
//@Getter
//@Setter
//@AllArgsConstructor
//@NoArgsConstructor
//@Log4j2
//public class Pagamentos {
//    private static Scanner entrada = new Scanner(System.in);
//    private double valorPago;
//
//    public void telaInicialPagamentos(int valorTotal) {
//        log.info("O valor total foi de R$" + valorTotal);
//        escolhaDoPagamento();
//    }
//
//    public static void escolhaDoPagamento() {
//        log.info("\n1. Cartão de Crédito/Débito/VR.");
//        log.info("\n2. Dinheiro");
//        log.info("\n3. Pix");
//        log.info("\nDigite o número do meio escolhido: ");
//        int meioDePagamento = entrada.nextInt();
//
//        switch (meioDePagamento) {
//            case 1:
//                pagamentoPorCartao();
//                break;
//            case 2:
//                pagamentoDinheiro();
//                break;
//            case 3:
//                pagamentoEmPix();
//                break;
//            default:
//                do {
//                    log.info("Escolha uma opção válida. Digite 1 para voltar a tela de escolha: ");
//                    meioDePagamento = entrada.nextByte();
//                } while (meioDePagamento != 1 && meioDePagamento != 2 && meioDePagamento != 3);
//                escolhaDoPagamento();
//        }
//
//    }
//
//    public static void pagamentoDinheiro() {
//        log.info("Pagamento em Dinheiro selecionado.\nPrecisa de troco?\n1. Sim.\n2. Não.");
//        byte troco = entrada.nextByte();
//
//        if (troco == 1) {
//            sistemaDeTroco();
//        } else if (troco == 2) {
//
//        } else {
//            do {
//                log.info("Opção inválida. Digite 1 para tentar novamente.");
//                troco = entrada.nextByte();
//            } while (troco != 1 && troco != 2);
//
//            pagamentoDinheiro();
//        }
//
//        finalizarPedido.Finalizar();
//    }
//
//    public static void sistemaDeTroco() throws InterruptedException {
//        log.info("Para quanto?");
//        valorPago = entrada.nextDouble();
//        Thread.sleep(500);
//
//        double troco = valorPago - Menu.getValorPizza();
//        System.out.printf("Levaremos seu troco de R$" + troco);
//    }
//
//    public static void pagamentoEmPix() throws InterruptedException {
//        log.info(
//                "Pagamento por PIX selecionando.\nPara efetuar o pagamento copie e cole o código abaixo na aba PIX do aplicativo do seu banco.");
////        Thread.sleep(1500);
//        log.info("\n7163e29e-bdaf-4f02-b492-90e161b9ede7");
//        Thread.sleep(10000);
//        log.info("\nPagamento confirmado.");
//        Thread.sleep(1500);
//
//        finalizarPedido.Finalizar();
//    }
//
//    public static void pagamentoPorCartao() throws InterruptedException {
//        log.info("Pagamento por cartão selecionado.\nSelecione a opção: ");
//
//        log.info("\n1- Débito.\n2- Crédito (não parcelamos)\n3- Vale Refeição (VR).");
//        byte opcaoDePagamento = entrada.nextByte();
//
//        if (opcaoDePagamento == 1) {
//            log.info("Cartão de Débito selecionado.");
//            Thread.sleep(500);
//            log.info("Escolha a bandeira referente ao seu cartão: ");
//            Thread.sleep(500);
//            log.info("1- Visa.\n2- MasterCard.\n3- Elo\n4- American Express\n5- Nenhuma das opções acima.");
//            byte bandeiraCartaoDebito = entrada.nextByte();
//            Thread.sleep(500);
//
//            switch (bandeiraCartaoDebito) {
//                case 1:
//                case 2:
//                case 3:
//                case 4:
//                    log.info("O motoboy levará a máquininha.");
//                    Thread.sleep(500);
//                    break;
//                case 5:
//                    log.info(
//                            "Não temos maquininha que aceite sua bandeira. Por favor, selecione outra forma de pagamento.");
//                    Thread.sleep(500);
//                    mudarPagamento();
//                default:
//                    do {
//                        log.info("Escolha uma opção válida. Digite 1 para voltar a tela de escolha: ");
//                        Thread.sleep(500);
//                        bandeiraCartaoDebito = entrada.nextByte();
//                    } while (bandeiraCartaoDebito != 1);
//                    escolhaDoPagamento();
//            }
//        } else if (opcaoDePagamento == 2) {
//            log.info("Cartão de Crédito selecionado.");
//            Thread.sleep(500);
//            log.info("Escolha a bandeira referente ao seu cartão: ");
//            Thread.sleep(500);
//            log.info("1- Visa.\n2- MasterCard.\n3- Elo\n4- American Express\n5- Nenhuma das opções acima.");
//            byte bandeiraCartaoCredito = entrada.nextByte();
//            Thread.sleep(500);
//
//            switch (bandeiraCartaoCredito) {
//                case 1:
//                case 2:
//                case 3:
//                case 4:
//                    log.info("O motoboy levará a máquininha.");
//                    Thread.sleep(500);
//                    break;
//                case 5:
//                    log.info(
//                            "Não temos maquininha que aceite sua bandeira. Por favor, selecione outra forma de pagamento.");
//                    Thread.sleep(500);
//                    mudarPagamento();
//                default:
//                    do {
//                        log.info("Escolha uma opção válida. Digite 1 para voltar a tela de escolha: ");
//                        bandeiraCartaoCredito = entrada.nextByte();
//                        Thread.sleep(500);
//                    } while (bandeiraCartaoCredito != 1);
//                    escolhaDoPagamento();
//            }
//
//        } else if (opcaoDePagamento == 3) {
//            log.info("Cartão Vale-Refeição selecionado.");
//            Thread.sleep(500);
//            log.info("Escolha a bandeira referente ao seu cartão: ");
//            Thread.sleep(500);
//            log.info("1- Alelo.\n2- Sodexo.\n3- Visa\n4- MasterCard\n5- Elo\n6- Nenhuma das opções acima.");
//            byte bandeiraValeRefeicao = entrada.nextByte();
//            Thread.sleep(500);
//
//            switch (bandeiraValeRefeicao) {
//                case 1:
//                case 2:
//                case 3:
//                case 4:
//                case 5:
//                    log.info("O motoboy levará a máquininha.");
//                    Thread.sleep(500);
//                    break;
//                case 6:
//                    log.info(
//                            "Não temos maquininha que aceite sua bandeira. Por favor, selecione outra forma de pagamento.");
//                    Thread.sleep(500);
//                    mudarPagamento();
//                default:
//                    do {
//                        log.info("Escolha uma opção válida. Digite 1 para voltar a tela de escolha: ");
//                        bandeiraValeRefeicao = entrada.nextByte();
//                        Thread.sleep(500);
//                    } while (bandeiraValeRefeicao != 1);
//                    escolhaDoPagamento();
//            }
//
//        } else if (opcaoDePagamento > 3 || opcaoDePagamento < 1) {
//            do {
//                log.info("Opção inválida. Digite 1 para tentar novamente.");
//                opcaoDePagamento = entrada.nextByte();
//                Thread.sleep(500);
//            } while (opcaoDePagamento != 1 && opcaoDePagamento != 2 && opcaoDePagamento != 3);
//
//            pagamentoPorCartao();
//        }
//
//        finalizarPedido.Finalizar();
//
//    }
//
//    public static void mudarPagamento() throws InterruptedException {
//        escolhaDoPagamento();
//    }
//}
