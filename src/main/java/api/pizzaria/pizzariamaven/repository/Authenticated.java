package api.pizzaria.pizzariamaven.repository;

public interface Authenticated {
    /**
     *
     * @param login
     * @param password
     * @return 0 não autenticou, 1 acesso ao usuario, 2 acesso a atendente
     *  3 acesso total
     */
    public int autentica(String login,char[] password);
}
