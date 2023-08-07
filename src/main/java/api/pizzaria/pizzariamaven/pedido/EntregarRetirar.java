package api.pizzaria.pizzariamaven.pedido;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.log4j.Log4j2;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Log4j2
public class EntregarRetirar{

    public void Finalizar() throws InterruptedException {

        log.info("Seu pedido foi feito com sucesso!");

        for(int i = 0; i <= 2; i++){
            log.info(".");
            Thread.sleep(500);
        }

        log.info("Seu pedido está sendo preparado");
        for(int i = 0; i <= 3; i++){
            log.info(".");
            Thread.sleep(1500);
        }
        log.info("Seu pedido saiu para entrega ou está pronto para ser retirado");
        log.info("Obrigado por realizar seu pedido na Pizzaria FAG! Até logo!");

    }
}
