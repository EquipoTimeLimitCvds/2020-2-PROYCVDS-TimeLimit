package edu.eci.cvds.TimeLimit.manageBeans;

        import edu.eci.cvds.TimeLimit.authenticator.SessionLogger;
        import edu.eci.cvds.TimeLimit.exceptions.TimeLimitExceptions;
        import edu.eci.cvds.TimeLimit.services.ServicesFactory;
        import org.apache.shiro.SecurityUtils;
        import org.apache.shiro.authz.annotation.RequiresGuest;
        import org.apache.shiro.subject.Subject;

        import javax.faces.application.FacesMessage;
        import javax.faces.bean.ManagedBean;
        import javax.faces.bean.SessionScoped;
        import javax.faces.context.FacesContext;
        import java.io.IOException;


@SuppressWarnings("deprecation")
@ManagedBean(name="LoginBean")
@SessionScoped
public class LoginBean {


    private static final long serialVersionUID = -2084921068710522276L;

    private String nombre;
    private String clave;
    


    //@Inject
    //private SessionLogger logger;
    private SessionLogger logger = ServicesFactory.getInstance().getLoginServices();

    public Subject getCurrentUser(){
        Subject currentUser = SecurityUtils.getSubject();
        return currentUser;
    }

    public SessionLogger getLogger() {
        return logger;
    }

    public void setLogger(SessionLogger logger) {
        this.logger = logger;
    }

    public String getNombre() {
        return nombre;
    }
    public String getClave(){
        return clave;
    }


    @RequiresGuest
    public void login() throws TimeLimitExceptions {
        try {
             logger.login(nombre,clave);
             System.out.println("Conecte");

        } catch (TimeLimitExceptions e){
           throw new TimeLimitExceptions  ("no conecte",e);
        }

    }

    public void activeSession () throws IOException {
        FacesContext facesContext = FacesContext.getCurrentInstance();
        facesContext.getExternalContext().redirect("");
    }




}