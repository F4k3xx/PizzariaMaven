package api.pizzaria.pizzariamaven.cadastro;

import api.pizzaria.pizzariamaven.exception.DomainException;
import api.pizzaria.pizzariamaven.menu.Menu;
import api.pizzaria.pizzariamaven.pagamentos.Pagamentos;
import api.pizzaria.pizzariamaven.pedido.EntregarRetirar;
import api.pizzaria.pizzariamaven.pedido.ModoRetirarPedido;
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
                cadastro.insertLogin();
            } else if (escolha == 2) {
                cadastro.registerUser();
            } else if (escolha == 3) {
                throw new DomainException("Você saiu do programa!");
            } else {
                log.info("Opção inválida!");
                entrada.nextLine();
                escolherOpcoesMenu();
            }
            chamarMenu(cadastro);
        } catch (InputMismatchException e) {
            log.error("Opção inválida! Por favor, digite uma opção válida!.");
            escolherOpcoesMenu();
        }
    }

    public void chamarMenu(Cadastro cadastro) {
        Menu menu = new Menu();
        menu.cardapioPizza();
        menu.cardapioBebidas();
        menu.somaValores();

        chamarEntrega(cadastro);
    }

    private void chamarEntrega(Cadastro cadastro) {
        ModoRetirarPedido modoRetirarPedido = new ModoRetirarPedido();
        modoRetirarPedido.escolherEntega(cadastro);

        escolherFormaDePagamento();
    }

    private void escolherFormaDePagamento() {
        Pagamentos pagamentos = new Pagamentos();
        pagamentos.escolhaDoPagamento();

        finalizarPedido();
    }

    private void finalizarPedido() {
        EntregarRetirar entregarRetirar = new EntregarRetirar();
        entregarRetirar.finalizar();
    }


}
