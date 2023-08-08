package api.pizzaria.pizzariamaven.cadastro;

import api.pizzaria.pizzariamaven.model.entities.User;
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
public class Cadastro {
    User user = new User(1L, "nome", "login", "password", "phone", "address");
    public Scanner leitor = new Scanner(System.in);

    public void registerUser() {
        log.info(">>>>>> CADASTRO <<<<<<");
        log.info("-> Digite seu nome: ");
        user.setName(leitor.nextLine());

        log.info("-> Digite seu login:");
        user.setLogin(leitor.nextLine());

        log.info("-> Digite sua senha:");
        user.setPassword(leitor.nextLine());

        validateInfo();

        log.info("-> Digite seu telefone:");
        user.setPhone(leitor.nextLine());

        log.info("-> Digite seu endereço:");
        user.setAddress(leitor.nextLine());

        insertLogin();
    }

    private void validateInfo() {
        if (StringUtils.isEmpty(user.getLogin()) && StringUtils.isEmpty(user.getPassword())) {
            log.info("Login e senha não podem ser vazio!");
            registerUser();
        }
    }

    public void insertLogin() {
        log.info("Insira seu login: ");
        String login = leitor.nextLine();
        if (user.getLogin().equals(login)) {
            insertPassword();
        } else {
            log.info("Login não encontrado!");
            log.info("Tente novamente!");
            insertLogin();
        }
    }

    public void insertPassword() {
        log.info("Insira sua senha: ");
        String password = leitor.nextLine();
        if (user.getPassword().equals(password)) {
            log.info("Login efetuado com sucesso!");
        } else {
            log.info("Senha incorreta!");
            log.info("Tente novamente!");
            insertPassword();
        }
    }
}
