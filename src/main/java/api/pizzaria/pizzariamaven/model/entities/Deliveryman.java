package api.pizzaria.pizzariamaven.model.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Deliveryman extends Employee {
    private Long id;
    private String motorcyclePlate;
    private char[] password;
}
