package api.pizzaria.pizzariamaven.pedido;


import api.pizzaria.pizzariamaven.model.entities.User;
import api.pizzaria.pizzariamaven.pagamentos.Pagamentos;
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
    Pagamentos pagamentos = new Pagamentos();
    public Scanner leia = new Scanner(System.in);
    private User user = new User();
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
                if (user.getAddress() == null){
                log.info("Preciso que insira o seu endereço");
                user.setAddress(leia.next());
                }
                log.info("===== ENTREGA A DOMOCÍLIO =====" + "\n*** Frete GRÁTIS *** " + "\nEndereço de entrega registrado em cadastro: " + user.getAddress());
                EntregarRetirar entregarRetirar = new EntregarRetirar();
                pagamentos.escolhaDoPagamento();
                entregarRetirar.finalizar();
                break;
            case 3:
                log.info("===== ALACARTE =====" + "\nNos informe o número da sua mesa");
                int numeroDaMesa = leia.nextInt();
                log.info("Sua mesa é: " + numeroDaMesa);
                pagamentos.escolhaDoPagamento();

                break;
            default:
                escolherEntega();
        }
    }

}
