package core.basesyntax.service;

public class ExistingLoginExeption extends RuntimeException {

    public ExistingLoginExeption(String message) {
        super(message);
    }
}
