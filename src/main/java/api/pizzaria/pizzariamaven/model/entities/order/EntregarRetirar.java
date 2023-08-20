package api.pizzaria.pizzariamaven.model.entities.order;


import lombok.Getter;
import lombok.Setter;
import lombok.extern.log4j.Log4j2;

@Getter
@Setter
@Log4j2
public class EntregarRetirar {

    public void  finalizar() {
        log.info("Seu pedido foi feito com sucesso!");

        for (int i = 0; i <= 2; i++) {
            log.info(".");
        }

        log.info("Seu pedido está sendo preparado");
        for (int i = 0; i <= 3; i++) {
            log.info(".");
        }
        log.info("Seu pedido saiu para entrega ou está pronto para ser retirado");
        log.info("Obrigado por realizar seu pedido na Pizzaria FAG! Até logo!");

    }
}
