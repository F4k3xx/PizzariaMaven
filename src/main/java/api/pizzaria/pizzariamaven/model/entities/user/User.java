package api.pizzaria.pizzariamaven.model.entities.user;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private Long id;
    private String name;
    private String login;
    private String password;
    private String phone;
    private String address;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }
}

