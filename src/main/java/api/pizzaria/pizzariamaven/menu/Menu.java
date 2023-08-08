package api.pizzaria.pizzariamaven.menu;


import api.pizzaria.pizzariamaven.model.entities.Pizza;
import api.pizzaria.pizzariamaven.pedido.ModoRetirarPedido;
import api.pizzaria.pizzariamaven.produtos.Bebidas.Bebidas;
import api.pizzaria.pizzariamaven.produtos.pizzaSabores.Sabores;
import api.pizzaria.pizzariamaven.produtos.tamanho.EnumTamanho;
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
public class Menu {
    private Scanner sc = new Scanner(System.in);
    int valorTotalPizza = 0;
    int valorBebidas = 0;

    public void cardapioPizza() {
        try {
            int tamanho = 0;
            log.info("=========== CATALOGO ===========");
            log.info("[0]- Pequena -->  1 Sabor");
            log.info("[1]- Grande  -->  2 Sabor");
            log.info("[2]- Gigante -->  3 Sabor");
            log.info("Escolha o tamanho da sua Pizza:");
            tamanho = sc.nextInt();
            log.info(EnumTamanho.values()[tamanho]);

            log.info("Escolha o sabor da sua pizza!");
            for (Sabores pizza : Sabores.values()) {
                log.info(pizza.ordinal() + "-" + "Sabor: " + pizza + ": $" + pizza.getPreco());
            }
            Pizza pizza = new Pizza();
            valorTotalPizza = pizza.adicionarPedidoPizza(tamanho);
        } catch (ArrayIndexOutOfBoundsException e) {
            log.error("Opção inválida! Por favor, digite uma opção válida!.");
            cardapioPizza();
        }
    }

    public void cardapioBebidas() {
        Bebidas bebidas = new Bebidas();
        valorBebidas = bebidas.catalogoBebidas();
    }

    public void somaValores() {
        int valorTotal = 0;
        valorTotal = valorTotalPizza + valorBebidas;
        log.info("Valor total do pedido: " + valorTotal);
    }
}
