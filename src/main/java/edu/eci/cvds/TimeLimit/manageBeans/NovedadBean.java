package edu.eci.cvds.TimeLimit.manageBeans;

import edu.eci.cvds.TimeLimit.exceptions.TimeLimitExceptions;
import edu.eci.cvds.TimeLimit.model.Elemento;
import edu.eci.cvds.TimeLimit.model.Equipo;
import edu.eci.cvds.TimeLimit.model.Laboratorio;
import edu.eci.cvds.TimeLimit.model.Novedad;
import edu.eci.cvds.TimeLimit.services.*;
import org.primefaces.PrimeFaces;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import java.time.LocalDate;
import java.util.ArrayList;

@SuppressWarnings("deprecation")
@ManagedBean(name="NovedadBean")
@SessionScoped

public class NovedadBean {
    //@Inject
    //private NovedadServices novedadServices;

    NovedadServices novedadServices = ServicesFactory.getInstance().getNovedadServices();
    ElementoServices elementoServices= ServicesFactory.getInstance().getElementoServices();
    LaboratorioServices laboratorioServices= ServicesFactory.getInstance().getLaboratorioServices();
    EquipoServices equipoServices= ServicesFactory.getInstance().getEquipoServices();

    private int id;
    private LocalDate fecha=LocalDate.now();
    private String descripcion;
    private String estado;
    private String tipo;
    private int idElemento;
    private Laboratorio cambioLab;
    private Equipo cambioEqui;
    private Elemento cambioEle;

    public Elemento getCambioEle() {
        return cambioEle;
    }

    public Equipo getCambioEqui() {
        return cambioEqui;
    }

    public Laboratorio getCambioLab() {
        return cambioLab;
    }

    public void setCambioEle(Elemento cambioEle) {
        this.cambioEle = cambioEle;
    }

    public void setCambioEqui(Equipo cambioEqui) {
        this.cambioEqui = cambioEqui;
    }

    public void setCambioLab(Laboratorio cambioLab) {
        this.cambioLab = cambioLab;
    }

    public NovedadServices getNovedadServices(){
        return novedadServices;
    }

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getIdElemento() {
        return idElemento;
    }

    public void setIdElemento(int idElemento) {
        this.idElemento = idElemento;
    }

    public void registrarNovedad()throws TimeLimitExceptions{
        System.out.println(tipo);
        try{
            if(tipo.equals("Laboratorio")){
                int idLab=cambioLab.getId();
                System.out.println(idLab);
                novedadServices.registrarNovedad(descripcion,estado,tipo,idLab);
            }else if(tipo.equals("Elemento")){
                novedadServices.registrarNovedad(descripcion,estado,tipo,cambioEle.getId());
            }else if(tipo.equals("Equipo")){
                novedadServices.registrarNovedad(descripcion,estado,tipo,cambioEqui.getId());
            }
            FacesContext.getCurrentInstance().addMessage(null,new FacesMessage("Novedad creada con exito"));
            PrimeFaces current = PrimeFaces.current();
            current.executeScript("PF('dlg2').hide();");
        }catch (TimeLimitExceptions ex){
            FacesContext.getCurrentInstance().addMessage(null,new FacesMessage(FacesMessage.SEVERITY_ERROR,"No se pudo crear la Novedad","Error"));
            throw ex;
        }
    }
    public ArrayList<Novedad>getNovedades() throws TimeLimitExceptions {
        ArrayList<Novedad>novedades=novedadServices.getNovedades();
        return novedades;
    }
    public ArrayList<Elemento>getTodosElementos() throws TimeLimitExceptions{
        return elementoServices.getElementos();
    }
    public ArrayList<Laboratorio>getTodosLaboratorios()throws TimeLimitExceptions{
        return laboratorioServices.getLaboratorios();
    }
    public ArrayList<Equipo>getComputadores()throws TimeLimitExceptions{
        return equipoServices.getEquipos();
    }

    public void setElementoServices(ElementoServices elementoServices) {
        this.elementoServices = elementoServices;
    }

    public void setEquipoServices(EquipoServices equipoServices) {
        this.equipoServices = equipoServices;
    }

    public void setLaboratorioServices(LaboratorioServices laboratorioServices) {
        this.laboratorioServices = laboratorioServices;
    }
}
