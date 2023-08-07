package api.pizzaria.pizzariamaven.produtos.pizzaSabores;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.log4j.Log4j2;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Log4j2
public enum Sabores {

    // Sabores salgados
    CALABRESA(35.0),
    MUSSARELA(30.0),
    PORTUGUESA(40.0),
    FRANGO_COM_CATUPIRY(38.0),
    QUATRO_QUEIJOS(42.0),
    ATUM(36.0),
    BACON(39.0),
    MARGUERITA(33.0),
    PALMITO(37.0),
    ESCAROLA(38.0),

    // Sabores doces
    CHOCOLATE(30.0),
    BRIGADEIRO(32.0),
    ROMEU_E_JULIETA(34.0),
    BANANA_COM_CANELA(31.0),
    MORANGO_COM_NUTELLA(35.0),

    // Sabores mistos
    NUTELLA(40.0),
    MORANGO(43.0),
    MORANGO_E_NUTELLA(45.0),
    LEITE_NINHO(42.0),
    CHOCOLATE_BANANA(44.0);

    private String saborPizza;

    private double preco;

    Sabores(double preco) {
        this.preco = preco;
    }
}
