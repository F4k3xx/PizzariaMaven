package api.pizzaria.pizzariamaven.model.entities.product.food;

import api.pizzaria.pizzariamaven.model.entities.product.size.EnumPizzaSize;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.log4j.Log4j2;

import java.util.List;
import java.util.Scanner;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Log4j2
public class Pizza {
    private Scanner sc = new Scanner(System.in);
    private Long id;
    private int totalPizza;
    private double valorPizza;
    private double somaPizza;

    public int adicionarPedidoPizza(int tamanho) {
        int pizza = 0;
        int[] saboresSelecionados = new int[3];
        int tamanhoSelecionado = List.of(EnumPizzaSize.values()).get(tamanho).getQuantidadesDesabor();

        for (int i = 0; i <= tamanho; i++) {
            log.info("Digite o número da pizza que você quer:");
            pizza = sc.nextInt();
            saboresSelecionados[i] = pizza;
            log.info(Sabores.values()[pizza]);
        }
        log.info("=========================================");
        log.info("Você está pedindo 1 pizza ");
        log.info("Tamanho " + EnumPizzaSize.values()[tamanho]);

        log.info("========= Sabores ========= ");
        for (int i = 0; i <= tamanho; i++) {
            Sabores listaDosSaboresSelecionados = Sabores.values()[saboresSelecionados[i]];
            log.info(listaDosSaboresSelecionados);
            somaPizza += listaDosSaboresSelecionados.getPreco();
        }
        totalPizza = (int) somaPizza / (tamanho + 1);
        log.info("Valor da Pizza R$" + totalPizza);

        return totalPizza;
    }
}
