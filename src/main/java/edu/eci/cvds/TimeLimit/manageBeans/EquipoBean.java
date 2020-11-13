package edu.eci.cvds.TimeLimit.manageBeans;

import com.google.inject.Inject;
import edu.eci.cvds.TimeLimit.exceptions.TimeLimitExceptions;
import edu.eci.cvds.TimeLimit.model.Equipo;
import edu.eci.cvds.TimeLimit.services.EquipoServices;
import edu.eci.cvds.TimeLimit.services.ServicesFactory;
import org.primefaces.PrimeFaces;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;




@SuppressWarnings("deprecation")
@ManagedBean(name="EquipoBean")
@SessionScoped
public class EquipoBean {
    //@Inject
    //private EquipoServices equipoServices;

    EquipoServices equipoServices= ServicesFactory.getInstance().getEquipoServices();

    private int id;
    private String nombre;
    private String estado;
    private String enUso;
    private int idLaboratorio;

    public EquipoServices getElementoServices(){
        return equipoServices;
    }

    public void setEquipoServices(EquipoServices elementoServices){
        this.equipoServices=equipoServices;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getEnUso() {
        return enUso;
    }

    public void setEnUso(String enUso) {
        this.enUso = enUso;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdLaboratorio() {
        return idLaboratorio;
    }

    public void setIdLaboratorio(int idLaboratorio) {
        this.idLaboratorio = idLaboratorio;
    }


    public void registrarEquipo()throws TimeLimitExceptions{
        try{
            equipoServices.registrarEquipo(id,nombre,estado,enUso,idLaboratorio);
            FacesContext.getCurrentInstance().addMessage(null,new FacesMessage("Equipo creado con exito"));
            PrimeFaces current = PrimeFaces.current();
            current.executeScript("PF('dlg2').hide();");
        }catch (TimeLimitExceptions ex){
            FacesContext.getCurrentInstance().addMessage(null,new FacesMessage(FacesMessage.SEVERITY_ERROR,"No se pudo crear el Equipo","Error"));
            throw ex;
        }
    }

}
