package api.pizzaria.pizzariamaven.model.entities.menu;


import api.pizzaria.pizzariamaven.model.entities.product.drinks.Bebidas;
import api.pizzaria.pizzariamaven.model.entities.product.food.Pizza;
import api.pizzaria.pizzariamaven.model.entities.product.food.Sabores;
import api.pizzaria.pizzariamaven.model.entities.product.size.EnumPizzaSize;
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
    private Scanner input = new Scanner(System.in);
    int valorTotalPizza = 0;
    int valorBebidas = 0;

    public void cardapioPizza() {
        try {
            int pizzaSize = 0;
            log.info("=========== CATALOGO ===========");
            log.info("        Tamanho     Sabores");
            log.info("[0]  -  Pequena  -->  1 Sabor ");
            log.info("[1]  -  Grande   -->  2 Sabores");
            log.info("[2]  -  Gigante  -->  3 Sabores ");
            log.info("Escolha o tamanho da sua Pizza:");
            pizzaSize = input.nextInt();
            log.info(EnumPizzaSize.values()[pizzaSize]);

            log.info("Escolha o sabor da sua pizza!");
            for (Sabores pizza : Sabores.values()) {
                log.info(pizza.ordinal() + "-" + "Sabor: " + pizza + ": $" + pizza.getPreco());
            }
            Pizza pizza = new Pizza();
            valorTotalPizza = pizza.adicionarPedidoPizza(pizzaSize);
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
