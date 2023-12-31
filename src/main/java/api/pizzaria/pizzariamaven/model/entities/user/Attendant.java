package api.pizzaria.pizzariamaven.model.entities.user;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Attendant extends Employee {
    private Long id;
    private int ramal;
    private String password;
}
