package api.pizzaria.pizzariamaven.model.entities.order;


import api.pizzaria.pizzariamaven.controller.UserController;
import api.pizzaria.pizzariamaven.dto.UserDTO;
import api.pizzaria.pizzariamaven.model.entities.user.User;
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

    public void escolherEntega(UserDTO user) {
        log.info("===== ENTREGA DO PEDIDO =====\n");
        log.info("1. RETIRADA NO BALCÃO\n" + "2. ENTREGA A DOMICÍLIO\n " + "3. ALACARTE");
        log.info("-> Selecione a melhor opção para você: ");

        int tipoPedido = leia.nextInt();

        switch (tipoPedido) {
            case 1:
                log.info("===== RETIRADA NO BALCÃO =====" + "\n**Após confirmação do pagamento!!** ");
                break;
            case 2:
                if (user.getAddress() == null) {
                    log.info("Preciso que insira o seu endereço");
                    user.setAddress(leia.next());
                }
                log.info("===== ENTREGA A DOMOCÍLIO =====" + "\n*** Frete GRÁTIS *** " + "\nEndereço de entrega registrado em cadastro: " + user.getAddress());
                break;
            case 3:
                log.info("===== ALACARTE =====" + "\nNos informe o número da sua mesa");
                int numeroDaMesa = leia.nextInt();
                log.info("Sua mesa é: " + numeroDaMesa);

                break;
            default:
                escolherEntega(user);
        }
    }

}
