package edu.eci.cvds.TimeLimit.manageBeans;

import com.google.inject.Inject;
import edu.eci.cvds.TimeLimit.exceptions.TimeLimitExceptions;
import edu.eci.cvds.TimeLimit.model.Laboratorio;
import edu.eci.cvds.TimeLimit.services.LaboratorioServices;
import edu.eci.cvds.TimeLimit.services.NovedadServices;
import edu.eci.cvds.TimeLimit.services.ServicesFactory;
import org.primefaces.PrimeFaces;
import sun.awt.Symbol;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import java.lang.reflect.Array;
import java.util.ArrayList;



@SuppressWarnings("deprecation")
@ManagedBean(name="LaboratorioBean")
@SessionScoped

public class LaboratorioBean {
	//@Inject
    //private LaboratorioServices laboratorioServices;
	LaboratorioServices laboratorioServices= ServicesFactory.getInstance().getLaboratorioServices();
    NovedadServices novedadServices= ServicesFactory.getInstance().getNovedadServices();

	private int id;
    private String nombre;
    private String horario;
    private String descripcion;
    private ArrayList<Laboratorio>laboratorios=new ArrayList<Laboratorio>();
    
    
    public LaboratorioServices getElementoServices(){
        return laboratorioServices;
    }

    public void setElementoServices(LaboratorioServices laboratorioServices){
        this.laboratorioServices=laboratorioServices;
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
            laboratorios=todosLaboratorios();
            laboratorioServices.registrarLaboratorio(nombre,horario,descripcion);
            novedadServices.registrarNovedad("Se creo el Laboratorio "+nombre+" "+"de id "+laboratorios.size()+1,"finalizada","Laboratorio",laboratorios.size()+1);
            FacesContext.getCurrentInstance().addMessage(null,new FacesMessage("Laboratorio creado con exito"));
            PrimeFaces current = PrimeFaces.current();
            current.executeScript("PF('dlg2').hide();");
        }catch (TimeLimitExceptions ex){
            FacesContext.getCurrentInstance().addMessage(null,new FacesMessage(FacesMessage.SEVERITY_ERROR,"No se pudo crear el Laboratorio","Error"));
            throw ex;
        }
    }
    public ArrayList<Laboratorio> todosLaboratorios() throws TimeLimitExceptions {
        laboratorios=laboratorioServices.getLaboratorios();
        return laboratorioServices.getLaboratorios();
    }
}
