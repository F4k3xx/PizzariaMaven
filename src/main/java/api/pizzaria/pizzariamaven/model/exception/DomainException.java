package api.pizzaria.pizzariamaven.model.exception;

public class DomainException extends RuntimeException{
    public DomainException(String message) {
        super(message);
    }
}
