package api.pizzaria.pizzariamaven.cadastro;

import api.pizzaria.pizzariamaven.menu.Menu;
import lombok.extern.log4j.Log4j2;

import java.util.InputMismatchException;
import java.util.Scanner;

@Log4j2
public class Home {

    public void saudarUser() {
        log.info("Olá! Seja bem-vinde a Pizzaria FAG!");
        escolherOpcoesMenu();
    }

    public void escolherOpcoesMenu() {
        Cadastro cadastro = new Cadastro();
        Scanner entrada = new Scanner(System.in);

        try {
            log.info("Para iniciar, selecione uma opção: ");
            log.info("1. Já sou cliente");
            log.info("2. Quero me cadastrar");
            log.info("3. Sair");

            log.info("Digite sua escolha: ");
            int escolha = entrada.nextInt();

            if (escolha == 1) {
//                cadastro.InsertLogin();
                chamarMenu();
            } else if (escolha == 2) {
                cadastro.registerUser();
                chamarMenu();
            } else if (escolha == 3) {
                log.info("Você saiu do programa!");
            } else {
                log.info("Opção inválida!");
                entrada.nextLine();
                escolherOpcoesMenu();
            }
        } catch (InputMismatchException e) {
            throw new RuntimeException("Opção inválida! Por favor, digite uma opção válida!.");
        }
    }

    public void chamarMenu() {
        Menu menu = new Menu();
        menu.cardapioPizza();
    }
}
