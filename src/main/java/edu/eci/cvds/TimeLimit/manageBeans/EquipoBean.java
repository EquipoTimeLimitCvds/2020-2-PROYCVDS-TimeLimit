package edu.eci.cvds.TimeLimit.manageBeans;
import edu.eci.cvds.TimeLimit.exceptions.TimeLimitExceptions;
import edu.eci.cvds.TimeLimit.model.Elemento;
import edu.eci.cvds.TimeLimit.model.Equipo;
import edu.eci.cvds.TimeLimit.model.Laboratorio;
import edu.eci.cvds.TimeLimit.services.ElementoServices;
import edu.eci.cvds.TimeLimit.services.EquipoServices;
import edu.eci.cvds.TimeLimit.services.NovedadServices;
import edu.eci.cvds.TimeLimit.services.ServicesFactory;
import org.primefaces.PrimeFaces;
import org.primefaces.model.chart.PieChartModel;

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
    NovedadServices novedadServices= ServicesFactory.getInstance().getNovedadServices();

    private ArrayList<Equipo>equiposRedes=new ArrayList<Equipo>();
    private ArrayList<Equipo>equiposPlataformas=new ArrayList<Equipo>();
    private ArrayList<Equipo>equiposSoftware=new ArrayList<Equipo>();
    private PieChartModel torta;


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
    private Elemento proximo;
    private ArrayList<Elemento> ElementosDisponibles;

    public Elemento getProximo() {
        return proximo;
    }

    public void setProximo(Elemento proximo) {
        this.proximo = proximo;
    }

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
                        novedadServices.registrarNovedad("se creo el equipo"+nombre,"finalizada","Equipo",listaEquipos.size());
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
        elementos = new ArrayList<Elemento>();
        elementos = elementoServices.getElementos();
        try {
            for (int i = 0; i < elementos.size(); i++) {
                if (elementos.get(i).getNombre().equals(prueba) && elementos.get(i).getIdEquipo() == imaginacion.getId()) {
                    Cambio = elementos.get(i);
                }
            }
            elementos = elementoServices.getElementos();
            elementoServices.borrarElemento(Cambio.getId());
            elementoServices.addElemento(proximo.getId(), imaginacion.getId());
            novedadServices.registrarNovedad("Se asoció el elemento " + proximo.getId() + " y se asoció al equipo " + imaginacion.getId(),"finalizada","Elemento", Cambio.getId());
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "El cambio se realizo efectivamente", "Succesfull"));

        } catch (TimeLimitExceptions ex) {


            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "No hay Elementos disponibles para el cambio", "Error"));
            throw ex;
        }
    }
    public ArrayList<Elemento>getElementos() throws TimeLimitExceptions{
        return elementoServices.getElementos();
    }
    public ArrayList<Elemento>getElementosEditar() throws TimeLimitExceptions {
	    ArrayList<Elemento> editar=elementoServices.getElementos();
        ArrayList<Elemento> nueva=new ArrayList<Elemento>();

	    for (Elemento objeto:editar){

	        if(objeto.getNombre().equals(prueba)&& prueba!=null){
	            nueva.add(objeto);
            }
        }
        if(prueba==null){
            return editar;
        }else{
            return nueva;
        }

    }
    public void laboratoriosEquipos()throws TimeLimitExceptions {
        for (int i = 0; i < getEquipos().size(); i++) {
            if (getEquipos().get(i).getIdLaboratorio() == 1) {
                equiposRedes.add(getEquipos().get(i));
            } else if (getEquipos().get(i).getIdLaboratorio() == 2) {
                equiposSoftware.add(getEquipos().get(i));
            } else if (getEquipos().get(i).getIdLaboratorio()==3) {
                equiposPlataformas.add(getEquipos().get(i));
            }
        }
    }



    public void listar()throws TimeLimitExceptions{
            laboratoriosEquipos();
            graficar();
    }

    public void setEquiposPlataformas(ArrayList<Equipo> equiposPlataformas){
        this.equiposPlataformas = equiposPlataformas;
    }

    public void setEquiposSoftware(ArrayList<Equipo> equiposSoftware) {
        this.equiposSoftware = equiposSoftware;
    }

    public void setEquiposRedes(ArrayList<Equipo> equiposRedes) {
        this.equiposRedes = equiposRedes;
    }

    public ArrayList<Equipo> getEquiposPlataformas() {
        return equiposPlataformas;
    }

    public ArrayList<Equipo> getEquiposSoftware() {
        return equiposSoftware;
    }

    public ArrayList<Equipo> getEquiposRedes() {
        return equiposRedes;
    }

    public void graficar()throws TimeLimitExceptions{
        torta=new PieChartModel();
        torta.set("Laboratorio de Software",getEquiposSoftware().size());
        torta.set("Laboratorio de Plataformas",getEquiposPlataformas().size());
        torta.set("Laboratorio de Redes",getEquiposRedes().size());

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










