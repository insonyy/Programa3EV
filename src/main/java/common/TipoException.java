package common;

@SuppressWarnings("serial")
public class TipoException extends Exception {

/*Constructores*///

    public TipoException() {

        super("El tipo introducido no corresponde con los disponibles.");
    }
}
