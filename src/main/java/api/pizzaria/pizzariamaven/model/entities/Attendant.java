package api.pizzaria.pizzariamaven.model.entities;

import api.pizzaria.pizzariamaven.repository.Authenticated;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Attendant extends Employee implements Authenticated {
    private Long id;
    private int ramal;
    private char[] password;

    @Override
    public int autentica(String login, char[] password) {
        return 0;
    }
}
