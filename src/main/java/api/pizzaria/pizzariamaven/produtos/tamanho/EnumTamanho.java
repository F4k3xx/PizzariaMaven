package api.pizzaria.pizzariamaven.produtos.tamanho;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public enum EnumTamanho {
    PEQUENA(1, 0),
    GRANDE(2, 1),
    GIGANTE(3, 2);

    private int quantidadesDesabor;
    private int valorConstante;

}
