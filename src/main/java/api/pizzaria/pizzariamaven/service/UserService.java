package api.pizzaria.pizzariamaven.service;

import api.pizzaria.pizzariamaven.dto.UserDTO;
import api.pizzaria.pizzariamaven.model.entities.user.User;
import lombok.Getter;
import lombok.extern.log4j.Log4j2;

import java.util.List;

@Getter
@Log4j2
public class UserService {
    User user;

    public void registerUser(UserDTO userDTO) {
        User user = new User();

        user.setName(userDTO.getName());
        user.setLogin(userDTO.getLogin());
        user.setPassword(userDTO.getPassword());
        user.setPhone(userDTO.getPhone());
        user.setAddress(userDTO.getAddress());

        this.user = user;
    }

    public User getByLogin(String login) {
        try {
            if (user.getLogin().equals(login)) {
                return user;
            }
        } catch (Exception e) {
            log.error("Login não encontrado!");
        }
        return null;
    }

    public List<User> find(UserDTO userDTO) {
        return null;
    }

    public List<User> findAll() {
        return null;
    }

}
