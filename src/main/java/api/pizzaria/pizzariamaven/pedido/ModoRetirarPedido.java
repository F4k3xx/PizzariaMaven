package api.pizzaria.pizzariamaven.pedido;


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
public class ModoRetirarPedido {
    public Scanner leia = new Scanner(System.in);
    private int modoEntrega;

    public void escolherEntega() {
        log.info("===== ENTREGA DO PEDIDO =====\n");
        log.info("1. RETIRADA NO BALCÃO\n" + "2. ENTREGA A DOMICÍLIO\n " + "3. ALACARTE");
        log.info("-> Selecione a melhor opção para você: ");

        int tipoPedido = leia.nextInt();

        switch (tipoPedido) {
            case 1:
                log.info("===== RETIRADA NO BALCÃO =====" + "\n**Após confirmação do pagamento!!** ");
                break;
            case 2:
                log.info("===== ENTREGA A DOMOCÍLIO =====" + "\n*** Frete GRÁTIS *** " + "\nEndereço de entrega registrado em cadastro: ");
                break;
            case 3:
                log.info("===== ALACARTE =====" + "\nNos informe o número da sua mesa");
                int numeroDaMesa = leia.nextInt();
                log.info("Sua mesa é: " + numeroDaMesa);

                break;
            default:
                escolherEntega();
        }
    }

}
