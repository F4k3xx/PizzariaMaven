//package api.pizzaria.pizzariamaven.pedido;
//
//
//import api.pizzaria.pizzariamaven.cadastro.Cadastro;
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
//public class ModoRetirarPedido {
//
//    public Scanner leia = new Scanner(System.in);
//
//    private Cadastro cadastro = new Cadastro();
//
//
//    @SuppressWarnings("unused")
//    private int modoEntrega;
//
//    public void EscolherEntrega() throws InterruptedException {
//
//        log.info("===== ENTREGA DO PEDIDO =====\n");
//        Thread.sleep(2000);
//
//        log.info("1. RETIRADA NO BALCÃO\n"
//                + "2. ENTREGA A DOMICÍLIO\n "
//                + "3. ALACARTE");
//        Thread.sleep(1000);
//        log.info("-> Selecione a melhor opção para você: ");
//
//        int tipoPedido = leia.nextInt();
//
//        switch (tipoPedido) {
//            case 1:
//                log.info("===== RETIRADA NO BALCÃO ====="
//                        + "\n**Após confirmação do pagamento!!** ");
//                Thread.sleep(2500);
//                break;
//            case 2:
//                log.info("===== ENTREGA A DOMOCÍLIO ====="
//                        + "\n*** Frete GRÁTIS *** "
//                        + "\nEndereço de entrega registrado em cadastro: " + cadastro.getEndereco());
//                Thread.sleep(2500);
//                break;
//            case 3:
//                log.info("===== ALACARTE ====="
//                        + "\nNos informe o número da sua mesa");
//                int numeroDaMesa = leia.nextInt();
//                log.info("Sua mesa é: " + numeroDaMesa);
//                Thread.sleep(2500);
//                break;
//            default:
//                do {
//                    log.info("Escolha uma opção válida!"
//                            + "\n 'Digite 1 para retornar as opções...");
//                    Thread.sleep(1500);
//                    tipoPedido = leia.nextInt();
//                } while (tipoPedido != 1 && tipoPedido != 2 && tipoPedido != 3);
//
//                EscolherEntrega();
//        }
//
//        Pagamentos.telaInicialPagamentos();
//
//    }
//}
