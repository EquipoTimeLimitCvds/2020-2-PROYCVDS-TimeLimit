package edu.eci.cvds.TimeLimit.manageBeans;

        import edu.eci.cvds.TimeLimit.authenticator.SessionLogger;
        import edu.eci.cvds.TimeLimit.exceptions.TimeLimitExceptions;
        import edu.eci.cvds.TimeLimit.services.ServicesFactory;
        import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.UnknownAccountException;
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
    private boolean logg;


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
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setClave(String clave){
        this.clave=clave;
    }

    public boolean isLogg() {
		return logg;
	}

	public void setLogg(boolean logg) {
		this.logg = logg;
	}

    @RequiresGuest
    public void login() throws TimeLimitExceptions {
        try {
             logger.login(nombre,clave);
             setLogg(true);
             FacesContext.getCurrentInstance().getExternalContext().redirect("/index2.xhtml");

        } catch (TimeLimitExceptions | IOException e){
            FacesContext.getCurrentInstance().addMessage("shiro", new FacesMessage(FacesMessage.SEVERITY_ERROR, "Usuario no registrado", "Este usuario no se encuentra en nuestra base de datos"));
        }

    }


    public void activeSession () throws IOException {
        FacesContext facesContext = FacesContext.getCurrentInstance();
        facesContext.getExternalContext().redirect("");
    }
    public void volver(){
        try{
            //FacesContext.getCurrentInstance().getExternalContext().redirect("/index.xhtml");
            setNombre(null);
            setClave(null);
            SecurityUtils.getSubject().logout();
            logger.logout();
            setLogg(false);
        }catch (Exception e){
            setErrorMessage(e);
        }

    }
    public void retroceder(){
        if(isLogged()){
            try{
            	FacesContext.getCurrentInstance().getExternalContext().redirect("/index.xhtml");
            }catch (IOException e){
                setErrorMessage(e);
            }
        }
    }
    public boolean isLogged(){
        return logger.isLogged();
    }
    
    public void logout() throws IOException{
        System.out.println("estoy en logout");
        if(isLogged()){
            System.out.println("HOLA");
            FacesContext.getCurrentInstance().getExternalContext().redirect("/index.xhtml");
            SecurityUtils.getSubject().logout();
        }
    }
    protected static void setErrorMessage(Exception e) {
        String message = e.getMessage();
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, message, null));
    }

	

}
