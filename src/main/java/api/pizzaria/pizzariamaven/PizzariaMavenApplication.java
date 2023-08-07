package api.pizzaria.pizzariamaven;

import api.pizzaria.pizzariamaven.cadastro.Home;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PizzariaMavenApplication {

    public static void main(String[] args) {
        Home iniciarPrograma = new Home();
        iniciarPrograma.saudarUser();
    }
}
