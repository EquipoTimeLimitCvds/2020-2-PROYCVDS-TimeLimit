
package edu.eci.cvds.TimeLimit.authenticator;


import edu.eci.cvds.TimeLimit.authenticator.SessionLogger;
import edu.eci.cvds.TimeLimit.exceptions.TimeLimitExceptions;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.crypto.hash.Sha256Hash;
import org.apache.shiro.subject.Subject;

public class ShiroSession implements SessionLogger {
    @Override
    public void login(String nombre,String clave) throws TimeLimitExceptions {
        try{

            Subject currentUser = SecurityUtils.getSubject();

            UsernamePasswordToken token = new UsernamePasswordToken(nombre,clave);

            currentUser.getSession().setAttribute("Correo",nombre);

            currentUser.login( token );

        } catch ( UnknownAccountException a ) {
            throw new TimeLimitExceptions("Usuario o contraseña incorrectos",a);
        } catch ( IncorrectCredentialsException b ) {
            throw new TimeLimitExceptions("Usuario o contraseña incorrectos",b);
        }
    }

    @Override
    public boolean isLogged() {
        return SecurityUtils.getSubject().isAuthenticated();
    }

}