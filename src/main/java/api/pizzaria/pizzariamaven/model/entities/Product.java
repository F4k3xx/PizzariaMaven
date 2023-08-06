package api.pizzaria.pizzariamaven.model.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    private Long id;
    private int code;
    private String name;
    private Category category;
    private double price;
    private List<Ingreients> ingredients;
}
