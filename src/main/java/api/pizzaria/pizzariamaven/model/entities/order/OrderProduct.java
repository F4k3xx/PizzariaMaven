package api.pizzaria.pizzariamaven.model.entities.order;

import api.pizzaria.pizzariamaven.model.entities.product.Product;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OrderProduct {
    private Long id;
    private Product product;
    private int quantity;
    private String observation;
}
