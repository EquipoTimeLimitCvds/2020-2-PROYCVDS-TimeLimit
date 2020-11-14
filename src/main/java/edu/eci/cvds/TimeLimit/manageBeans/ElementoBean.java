package edu.eci.cvds.TimeLimit.manageBeans;

import com.google.inject.Inject;
import edu.eci.cvds.TimeLimit.exceptions.TimeLimitExceptions;
import edu.eci.cvds.TimeLimit.model.Elemento;
import edu.eci.cvds.TimeLimit.services.ElementoServices;
import edu.eci.cvds.TimeLimit.services.ServicesFactory;
import org.primefaces.PrimeFaces;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;



@SuppressWarnings("deprecation")
@ManagedBean(name="ElementoBean")
@SessionScoped
public class ElementoBean {
    //@Inject
    //private ElementoServices elementoServices;

    ElementoServices elementoServices= ServicesFactory.getInstance().getElementoServices();

    private int id;
    private String nombre;
    private String marca;
    private String modelo;
    private String caracteristicas;
    private int idEquipo;

    public ElementoServices getElementoServices(){
        return elementoServices;
    }

    public void setElementoServices(ElementoServices elementoServices){
        this.elementoServices=elementoServices;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdEquipo() {
        return idEquipo;
    }

    public void setIdEquipo(int idEquipo) {
        this.idEquipo = idEquipo;
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public void registrarElemento()throws TimeLimitExceptions{
        try{
            elementoServices.registrarElemento(nombre,marca,modelo,caracteristicas,idEquipo);
            FacesContext.getCurrentInstance().addMessage(null,new FacesMessage("Elemento creado con exito"));
            PrimeFaces current = PrimeFaces.current();
            current.executeScript("PF('dlg2').hide();");
        }catch (TimeLimitExceptions ex){
            FacesContext.getCurrentInstance().addMessage(null,new FacesMessage(FacesMessage.SEVERITY_ERROR,"No se pudo crear el Elemento","Error"));
            throw ex;
        }
    }

}
