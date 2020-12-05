package edu.eci.cvds.TimeLimit.manageBeans;

import edu.eci.cvds.TimeLimit.exceptions.TimeLimitExceptions;
import edu.eci.cvds.TimeLimit.model.Laboratorio;
import edu.eci.cvds.TimeLimit.services.LaboratorioServices;
import edu.eci.cvds.TimeLimit.services.NovedadServices;
import edu.eci.cvds.TimeLimit.services.ServicesFactory;
import org.primefaces.PrimeFaces;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import java.time.LocalDate;
import java.util.ArrayList;



@SuppressWarnings("deprecation")
@ManagedBean(name="LaboratorioBean")
@SessionScoped

public class LaboratorioBean {
    //@Inject
    //private LaboratorioServices laboratorioServices;
    LaboratorioServices laboratorioServices = ServicesFactory.getInstance().getLaboratorioServices();
    NovedadServices novedadServices = ServicesFactory.getInstance().getNovedadServices();



    private int id;
    private String nombre;
    private String horario;
    private String descripcion;
    private String cerrado;
    private LocalDate fechaDeCreado;
    private LocalDate fechaDeCerrado;
    private ArrayList<Laboratorio> laboratorios = new ArrayList<Laboratorio>();
    private ArrayList<Laboratorio> laboratoriosDisponibles = new ArrayList<Laboratorio>();
    private Laboratorio cerrarLab;


    public ArrayList<Laboratorio> getLaboratoriosDisponibles() {
        return laboratoriosDisponibles;
    }

    public void setLaboratoriosDisponibles(ArrayList<Laboratorio> laboratoriosDisponibles) {
        this.laboratoriosDisponibles = laboratoriosDisponibles;
    }

    public void setCerrarLab(Laboratorio cerrarLab) {
        this.cerrarLab = cerrarLab;
    }

    public Laboratorio getCerrarLab() {
        return cerrarLab;
    }

    public LaboratorioServices getElementoServices() {
        return laboratorioServices;
    }

    public void setElementoServices(LaboratorioServices laboratorioServices) {
        this.laboratorioServices = laboratorioServices;
    }

    public String getCerrado() {
        return cerrado;
    }

    public LocalDate getFechaDeCerrado() {
        return fechaDeCerrado;
    }

    public LocalDate getFechaDeCreado() {
        return fechaDeCreado;
    }

    public void setCerrado(String cerrado) {
        this.cerrado = cerrado;
    }

    public void setFechaDeCerrado(LocalDate fechaDeCerrado) {
        this.fechaDeCerrado = fechaDeCerrado;
    }

    public void setFechaDeCreado(LocalDate fechaDeCreado) {
        this.fechaDeCreado = fechaDeCreado;
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

    public void registrarLaboratorio() throws TimeLimitExceptions {
        try {
            laboratorios = todosLaboratorios();
            laboratorioServices.registrarLaboratorio(nombre, horario, descripcion,cerrado);
            novedadServices.registrarNovedad("Se creo el Laboratorio " + nombre + " " + "de id " + laboratorios.size() + 1, "finalizada", "Laboratorio", laboratorios.size() + 1);
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Laboratorio creado con exito"));
            PrimeFaces current = PrimeFaces.current();
            current.executeScript("PF('dlg2').hide();");
        } catch (TimeLimitExceptions ex) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "No se pudo crear el Laboratorio", "Error"));
            throw ex;
        }
    }

    public ArrayList<Laboratorio> todosLaboratorios() throws TimeLimitExceptions {
        laboratorios = laboratorioServices.getLaboratorios();
        return laboratorioServices.getLaboratorios();
    }
    public ArrayList<Laboratorio> todosLaboratoriosDisponibles() throws TimeLimitExceptions {
        laboratorios = laboratorioServices.getLaboratorios();
        for (int i=0;i<laboratorios.size();i++) {
            if(laboratorios.get(i).getCerrado().equals("No")){
                laboratoriosDisponibles.add(laboratorios.get(i));
            }
        }
        return laboratoriosDisponibles;
    }
    public void cerrarLaboratorio(){
        try{
            int cerrar=cerrarLab.getId();
            laboratorioServices.cerrarLaboratorio(cerrar);
        }catch (TimeLimitExceptions ex){
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,"No se puede cerrar este laboratorio","Error"));
        }
    }
}


