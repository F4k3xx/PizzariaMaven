package api.pizzaria.pizzariamaven.cadastro;

import lombok.extern.log4j.Log4j2;

import java.util.Scanner;

@Log4j2
public class TelaInicial {
    public void saudarUser() {
        log.info("Olá! Seja bem-vinde a Pizzaria FAG!");
        escolherOpcoesMenu();
    }

    public void escolherOpcoesMenu() {
        Cadastro cadastro = new Cadastro();
        Scanner entrada = new Scanner(System.in);


        log.info("Para iniciar, selecione uma opção: ");
        log.info("1. Já sou cliente");    //Melhorar o fluxo
        log.info("2. Quero me cadastrar");
        log.info("3. Sair");

        log.info("Digite sua escolha: ");
        int escolha = entrada.nextInt();

        if (escolha == 1) {
            cadastro.InsertLogin();
        } else if (escolha == 2) {
            cadastro.registerUser();
        } else if (escolha == 3) {
            log.info("Você saiu do programa!");
        } else {
            log.info("Opção inválida!");
            escolherOpcoesMenu();
        }
    }
}
