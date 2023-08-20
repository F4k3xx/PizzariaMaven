package api.pizzaria.pizzariamaven.model.entities.register;

import api.pizzaria.pizzariamaven.controller.UserController;
import api.pizzaria.pizzariamaven.model.exception.DomainException;
import api.pizzaria.pizzariamaven.model.entities.menu.Menu;
import api.pizzaria.pizzariamaven.model.entities.payment.Payment;
import api.pizzaria.pizzariamaven.model.entities.order.EntregarRetirar;
import api.pizzaria.pizzariamaven.model.entities.order.ModoRetirarPedido;
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
        UserController register = new UserController();
        Scanner input = new Scanner(System.in);

        try {
            log.info("Para iniciar, selecione uma opção: ");
            log.info("[1] - Quero me cadastrar");
            log.info("[2] - Sair");
            log.info("Digite sua escolha: ");
            int option = input.nextInt();

            if (option == 1) {
                register.registerUser();
            } else if (option == 2) {
                log.error("Você saiu do programa!");
                throw new DomainException("Usuario saiu do programa!");
            } else {
                log.info("Opção inválida!");
                input.nextLine();
                escolherOpcoesMenu();
            }
            chamarMenu(register);
        } catch (InputMismatchException e) {
            log.error("Opção inválida! Por favor, digite um número válido!.");
            escolherOpcoesMenu();
        }
    }

    public void chamarMenu(UserController cadastro) {
        Menu menu = new Menu();
        menu.cardapioPizza();
        menu.cardapioBebidas();
        menu.somaValores();

        chamarEntrega(cadastro);
    }

    private void chamarEntrega(UserController cadastro) {
        ModoRetirarPedido modoRetirarPedido = new ModoRetirarPedido();
        // modoRetirarPedido.escolherEntega(cadastro);

        escolherFormaDePagamento();
    }

    private void escolherFormaDePagamento() {
        Payment payment = new Payment();
        payment.escolhaDoPagamento();

        finalizarPedido();
    }

    private void finalizarPedido() {
        EntregarRetirar entregarRetirar = new EntregarRetirar();
        entregarRetirar.finalizar();
    }


}
