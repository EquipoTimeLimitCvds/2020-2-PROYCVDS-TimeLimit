package edu.eci.cvds.TimeLimit.manageBeans;

import edu.eci.cvds.TimeLimit.exceptions.TimeLimitExceptions;
import edu.eci.cvds.TimeLimit.model.User;
import edu.eci.cvds.TimeLimit.services.ServicesFactory;
import edu.eci.cvds.TimeLimit.services.UserServices;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

@SuppressWarnings("deprecation")
@ManagedBean(name = "userBean")
@SessionScoped
public class UserBean {
    //@Inject
    //Private UserServices userservices

    private UserServices userServices= ServicesFactory.getInstance().getUserServices();
    private String nombre;
    private String clave;


    public void logIn(){
        try{
            if(userServices.validateLogin(nombre,clave)){
                System.out.println("Validacion ok");
                User user=userServices.getUser(nombre);
            }else{
                System.out.println("Fallo de Validacion");
                FacesContext.getCurrentInstance().getExternalContext().redirect("index.xhtml");
            }
        } catch (TimeLimitExceptions timeLimitExceptions) {
            timeLimitExceptions.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
