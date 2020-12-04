package edu.eci.cvds.TimeLimit.manageBeans;

import com.google.inject.Inject;
import edu.eci.cvds.TimeLimit.exceptions.TimeLimitExceptions;
import edu.eci.cvds.TimeLimit.model.Equipo;
import edu.eci.cvds.TimeLimit.model.Laboratorio;
import edu.eci.cvds.TimeLimit.services.LaboratorioServices;
import edu.eci.cvds.TimeLimit.services.NovedadServices;
import edu.eci.cvds.TimeLimit.services.ServicesFactory;
import org.primefaces.PrimeFaces;
import org.primefaces.model.chart.PieChartModel;
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

    private PieChartModel torta;

	private int id;
    private String nombre;
    private String horario;
    private String descripcion;
    private ArrayList<Laboratorio>laboratorios=new ArrayList<Laboratorio>();
    private ArrayList<Equipo>equiposRedes=new ArrayList<Equipo>();
    private ArrayList<Equipo>equiposPlataformas=new ArrayList<Equipo>();
    private ArrayList<Equipo>equiposSoftware=new ArrayList<Equipo>();


    
    
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
    public ArrayList<Equipo> getEquiposDeRedes()throws TimeLimitExceptions{
        equiposRedes= laboratorioServices.getEquiposDeRedes();
        return laboratorioServices.getEquiposDeRedes();
    }
    public ArrayList<Equipo> getEquiposDePlataformas()throws TimeLimitExceptions{
        equiposPlataformas= laboratorioServices.getEquiposDePlataformas();
        return laboratorioServices.getEquiposDePlataformas();
    }
    public ArrayList<Equipo> getEquiposDeSoftware()throws TimeLimitExceptions{
        equiposSoftware= laboratorioServices.getEquiposDeSoftware();
        System.out.println(equiposSoftware.size());
        return laboratorioServices.getEquiposDeSoftware();
    }

    public void graficar()throws TimeLimitExceptions{
        torta=new PieChartModel();
        torta.set("Laboratorio de Software",getEquiposDeSoftware().size());
        torta.set("Laboratorio de Plataformas",getEquiposDePlataformas().size());
        torta.set("Laboratorio de Redes",getEquiposDeRedes().size());

        torta.setTitle("Cantiadad de Equipos en cada laboratorio");
        torta.setFill(true);
        torta.setDiameter(500);
        torta.setLegendPosition("e");
    }

    public PieChartModel getTorta() {
        return torta;
    }

    public void setTorta(PieChartModel torta) {
        this.torta = torta;
    }
}
