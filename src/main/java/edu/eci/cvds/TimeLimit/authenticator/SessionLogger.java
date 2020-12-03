package edu.eci.cvds.TimeLimit.authenticator;
import edu.eci.cvds.TimeLimit.exceptions.TimeLimitExceptions;
public interface SessionLogger {
    public void login(String nombre, String clave)throws TimeLimitExceptions;

    public boolean isLogged();

    public void logout();
}
