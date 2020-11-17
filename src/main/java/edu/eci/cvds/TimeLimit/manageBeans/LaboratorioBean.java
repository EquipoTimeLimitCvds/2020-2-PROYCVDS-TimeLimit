package edu.eci.cvds.TimeLimit.manageBeans;

import com.google.inject.Inject;
import edu.eci.cvds.TimeLimit.exceptions.TimeLimitExceptions;
import edu.eci.cvds.TimeLimit.model.Laboratorios;
import edu.eci.cvds.TimeLimit.services.LaboratorioServices;
import edu.eci.cvds.TimeLimit.services.ServicesFactory;
import org.primefaces.PrimeFaces;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;



@SuppressWarnings("deprecation")
@ManagedBean(name="LaboratorioBean")
@SessionScoped

public class LaboratorioBean {
	//@Inject
    //private LaboratorioServices laboratorioServices;
	LaboratorioServices laboratorioServices= ServicesFactory.getInstance().getLaboratorioServices();
	private int id;
    private String nombre;
    private String horario;
    private String descripcion;
    private List<Laboratorios> listaLaboratorios;
   
    
    public LaboratorioServices getLaboratorioServices(){
        return laboratorioServices;
    }

    public void setLaboratorioServices(LaboratorioServices laboratorioServices){
        this.laboratorioServices=laboratorioServices;
    }
    public List<Laboratorios> consultarLaboratorios() throws TimeLimitExceptions{
        //return laboratorioServices.consultarLaboratorios();
    	try {
            if(listaLaboratorios == null){
            	listaLaboratorios = laboratorioServices.consultarLaboratorios();
            }
       
            return listaLaboratorios;
        } catch (TimeLimitExceptions ex) {
            throw ex;
        }
		
		
	}
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public void registrarLaboratorio()throws TimeLimitExceptions{
        try{
            laboratorioServices.registrarLaboratorio(nombre,horario,descripcion);
            FacesContext.getCurrentInstance().addMessage(null,new FacesMessage("Laboratorio creado con exito"));
            PrimeFaces current = PrimeFaces.current();
            current.executeScript("PF('dlg2').hide();");
        }catch (TimeLimitExceptions ex){
            FacesContext.getCurrentInstance().addMessage(null,new FacesMessage(FacesMessage.SEVERITY_ERROR,"No se pudo crear el Laboratorio","Error"));
            throw ex;
        }
    }
}
