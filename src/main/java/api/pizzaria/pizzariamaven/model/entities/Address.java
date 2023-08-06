package api.pizzaria.pizzariamaven.model.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Address {
    private Long id;
    private String street;
    private String number;
    private String complement;
}
