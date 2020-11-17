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
import java.sql.Time;
import java.util.ArrayList;


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
    private int idEquipo =0;
    private ArrayList<Elemento>tecladosDisponibles;
    private ArrayList<Elemento>monitoresDisponibles;
    private ArrayList<Elemento>cpusDisponibles;
    private ArrayList<Elemento>mousesDisponibles;
    private ArrayList<Elemento>elementos;


    public ArrayList<Elemento>getTecladosDisponibles() throws TimeLimitExceptions {
        elementos=getElementos();
        //System.out.println("llega a teclados");
        tecladosDisponibles=new ArrayList<Elemento>();
        for(int i=0;i<elementos.size();i++){
            //System.out.println(elementos.get(i).getNombre().equals("Teclado"));
            //System.out.println(elementos.get(i).getIdEquipo());
            if(elementos.get(i).getNombre().equals("Teclado")&& elementos.get(i).getIdEquipo()==0){
                tecladosDisponibles.add(elementos.get(i));
            }
        }
        return tecladosDisponibles;
    }
    public void setTecladosDisponibles(ArrayList<Elemento>tecladosDisponibles){
        this.tecladosDisponibles=tecladosDisponibles;
    }
    public void setMonitoresDisponibles(ArrayList<Elemento>monitoresDisponibles){
        this.monitoresDisponibles=monitoresDisponibles;
    }
    public ArrayList<Elemento>getMonitoresDisponibles() throws TimeLimitExceptions {
        getElementos();
        monitoresDisponibles=new ArrayList<Elemento>();
        for(int i=0;i<getElementos().size();i++){
            if(elementos.get(i).getNombre().equals("Monitor")&& elementos.get(i).getIdEquipo()==0){
                monitoresDisponibles.add(elementos.get(i));
            }
        }
        return monitoresDisponibles;
    }
    public ArrayList<Elemento>getMousesDisponibles() throws TimeLimitExceptions {
        getElementos();
        mousesDisponibles=new ArrayList<Elemento>();
        for(int i=0;i<getElementos().size();i++){
            if(elementos.get(i).getNombre().equals("Mouse")&& elementos.get(i).getIdEquipo()==0){
                mousesDisponibles.add(elementos.get(i));
            }
        }
        return mousesDisponibles;
    }

    public void setMousesDisponibles(ArrayList<Elemento> mousesDisponibles) {
        this.mousesDisponibles = mousesDisponibles;
    }

    public ArrayList<Elemento>getCpusDisponibles() throws TimeLimitExceptions {
        getElementos();
        cpusDisponibles=new ArrayList<Elemento>();
        for(int i=0;i<getElementos().size();i++){
            if(elementos.get(i).getNombre().equals("Cpu")&& elementos.get(i).getIdEquipo()==0){
                cpusDisponibles.add(elementos.get(i));
            }
        }
        return cpusDisponibles;
    }
    public void setCpusDisponibles(ArrayList<Elemento>cpusDisponibles){
        this.cpusDisponibles=cpusDisponibles;
    }


    public void setElementos(ArrayList<Elemento>elementos){
        this.elementos=elementos;
    }


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
    public ArrayList<Elemento> getElementos()throws TimeLimitExceptions {
        ArrayList<Elemento> elementos=new ArrayList<Elemento>();
        elementos=elementoServices.getElementos();
        return elementos;
    }
    public void editElemento(int id,int idEquipo)throws TimeLimitExceptions{
        elementoServices.editElemento(id,idEquipo);
    }

}
