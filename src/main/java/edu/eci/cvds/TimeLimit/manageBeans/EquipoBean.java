package edu.eci.cvds.TimeLimit.manageBeans;
import edu.eci.cvds.TimeLimit.manageBeans.ElementoBean;
import com.google.inject.Inject;
import edu.eci.cvds.TimeLimit.exceptions.TimeLimitExceptions;
import edu.eci.cvds.TimeLimit.model.Elemento;
import edu.eci.cvds.TimeLimit.model.Equipo;
import edu.eci.cvds.TimeLimit.model.Laboratorio;
import edu.eci.cvds.TimeLimit.services.ElementoServices;
import edu.eci.cvds.TimeLimit.services.EquipoServices;
import edu.eci.cvds.TimeLimit.services.ServicesFactory;
import org.primefaces.PrimeFaces;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import java.util.ArrayList;


@SuppressWarnings("deprecation")
@ManagedBean(name="EquipoBean")
@SessionScoped
public class EquipoBean {
    //@Inject
    //private EquipoServices equipoServices;

    EquipoServices equipoServices= ServicesFactory.getInstance().getEquipoServices();
    ElementoServices elementoServices= ServicesFactory.getInstance().getElementoServices();


    private int id;
    private String nombre;
    private String estado;
    private String prueba;
    private String enUso;
    private int idLaboratorio;
    private Laboratorio idLab;
    private Elemento ejemplo;
    private Elemento ejemploDos;
    private Elemento raton;
    private Elemento torre;
    private ArrayList<Equipo>listaEquipos;
    private ArrayList<Elemento>elementos;
	private Equipo imaginacion;
    private Elemento Cambio;
    private Elemento elementonuevo;
    private ArrayList<Elemento> ElementosDisponibles;

	public Equipo getImaginacion() {
        return imaginacion;
    }

    public void setImaginacion(Equipo imaginacion) {
        this.imaginacion = imaginacion;
    }

    public String getPrueba() {
        return prueba;
    }

    public void setPrueba(String prueba) {

        this.prueba = prueba;
    }

    public ArrayList<Equipo>getListaEquipos(){
        return listaEquipos;
    }
    public void setListaEquipos(ArrayList<Equipo>listaEquipos){
        this.listaEquipos=listaEquipos;
    }

    public Elemento getTorre() {
        return torre;
    }

    public void setTorre(Elemento torre) {
        this.torre = torre;
    }

    public Elemento getRaton() {
        return raton;
    }

    public void setRaton(Elemento raton) {
        this.raton = raton;
    }

    public Elemento getEjemploDos(){
        return ejemploDos;
    }


    public void setEjemploDos(Elemento ejemploDos){
        this.ejemploDos=ejemploDos;
    }
    public Elemento getEjemplo(){
        return ejemplo;
    }

    public void setEjemplo(Elemento ejemplo) {
        this.ejemplo = ejemplo;
    }

    public EquipoServices getElementoServices(){
        return equipoServices;
    }

    public void setEquipoServices(EquipoServices equipoServices){
        this.equipoServices=equipoServices;
    }

    public Laboratorio getIdLab(){
        return idLab;
    }

    public void setIdLab(Laboratorio idLab) {
        this.idLab = idLab;
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
            idLaboratorio=idLab.getId();
            if(idLaboratorio>0){
                equipoServices.registrarEquipo(nombre,estado,enUso,idLaboratorio);
                listaEquipos=new ArrayList<Equipo>();
                listaEquipos=getEquipos();
                for(int i=0;i<listaEquipos.size();i++){
                    if(listaEquipos.get(i).getNombre().equals(nombre)){
                        elementoServices.editElemento(ejemplo.getId(),listaEquipos.get(i).getId());
                        elementoServices.editElemento(ejemploDos.getId(),listaEquipos.get(i).getId());
                        elementoServices.editElemento(torre.getId(),listaEquipos.get(i).getId());
                        elementoServices.editElemento(raton.getId(),listaEquipos.get(i).getId());
                    }
                }
                FacesContext.getCurrentInstance().addMessage(null,new FacesMessage("Equipo creado con exito"));
                PrimeFaces current = PrimeFaces.current();
                current.executeScript("PF('dlg2').hide();");
            }
            else {
                FacesContext.getCurrentInstance().addMessage(null,new FacesMessage(FacesMessage.SEVERITY_ERROR,"Datos erroneos en la creacion","Error"));
            }
        }catch (TimeLimitExceptions ex){
            FacesContext.getCurrentInstance().addMessage(null,new FacesMessage(FacesMessage.SEVERITY_ERROR,"No se pudo crear el Equipo","Error"));
            throw ex;
        }
    }
    public ArrayList<Equipo> getEquipos()throws TimeLimitExceptions{
        ArrayList<Equipo>equipos=equipoServices.getEquipos();
        return equipoServices.getEquipos();
    }
    public void quitarElemento()throws TimeLimitExceptions {
        elementos=new ArrayList<Elemento>();
        //System.out.println(idequipo);
       // System.out.println("llega");
       // System.out.println(prueba);

        elementos=elementoServices.getElementos();
        for(int i=0;i<elementos.size();i++){
            if(elementos.get(i).getNombre().equals(prueba)&& elementos.get(i).getIdEquipo()==imaginacion.getId()){
                Cambio=elementos.get(i);
            }
        }
        ElementosDisponibles=new ArrayList<Elemento>();
        for(int i=0;i<elementos.size();i++){
            if(elementos.get(i).getNombre().equals(prueba)&& elementos.get(i).getIdEquipo()==0 && elementos.get(i).getIdEquipo()<89898){
                ElementosDisponibles.add(elementos.get(i));

            }
			
        }
        if(ElementosDisponibles.size()>0) {
            elementonuevo = ElementosDisponibles.get(0);
            elementoServices.borrarElemento(Cambio.getId());
            elementoServices.addElemento(elementonuevo.getId(),imaginacion.getId());

            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "El cambio se realizo efectivamente", "Succesfull"));

        }else {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "No hay Elementos disponibles para el cambio", "Error"));
        }


    }


}







