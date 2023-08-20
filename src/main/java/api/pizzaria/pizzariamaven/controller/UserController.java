package api.pizzaria.pizzariamaven.controller;

import api.pizzaria.pizzariamaven.dto.UserDTO;
import api.pizzaria.pizzariamaven.model.entities.user.User;
import api.pizzaria.pizzariamaven.service.UserService;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.log4j.Log4j2;
import org.springframework.util.StringUtils;

import java.util.Scanner;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Log4j2
public class UserController {
    private UserService userService = new UserService();
    private Scanner input = new Scanner(System.in);

    public void registerUser() {
        UserDTO userDTO = new UserDTO();

        log.info(">>>>>> CADASTRO <<<<<<");
        log.info("-> Digite seu nome: ");
        userDTO.setName(input.nextLine());

        log.info("-> Digite seu login:");
        userDTO.setLogin(input.nextLine());

        log.info("-> Digite sua senha:");
        userDTO.setPassword(input.nextLine());

        validateInfo(userDTO);

        log.info("-> Digite seu telefone:");
        userDTO.setPhone(input.nextLine());

        log.info("-> Digite seu endereço:");
        userDTO.setAddress(input.nextLine());

        userService.registerUser(userDTO);
    }


    private void validateInfo(UserDTO userDTO) {
        if (StringUtils.isEmpty(userDTO.getLogin()) && StringUtils.isEmpty(userDTO.getPassword())) {
            log.info("Login e senha não podem ser vazio!");
            registerUser();
        }
    }

    public void insertLogin() {
        log.info("Insira seu login: ");
        String login = input.nextLine();
        User userDTO = userService.getByLogin(login);
        if (userDTO.getLogin().equals(login)) {
            insertPassword();
        } else {
            log.info("Login não encontrado!");
            log.info("Tente novamente!");
            insertLogin();
        }
    }

    public void insertPassword() {
        log.info("Insira sua senha: ");
        String password = input.nextLine();
        User userDTO = userService.getByLogin(password);
        if (userDTO.getPassword().equals(password)) {
            log.info("Login efetuado com sucesso!");
        } else {
            log.info("Senha incorreta!");
            log.info("Tente novamente!");
            insertPassword();
        }
    }
}
