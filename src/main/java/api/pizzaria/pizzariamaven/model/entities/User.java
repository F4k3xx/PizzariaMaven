package api.pizzaria.pizzariamaven.model.entities;

import lombok.*;

import java.util.List;

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
