package edu.eci.cvds.TimeLimit.Persistence;

import edu.eci.cvds.TimeLimit.exceptions.TimeLimitExceptions;
import edu.eci.cvds.TimeLimit.model.Elemento;
import edu.eci.cvds.TimeLimit.model.Equipo;

import java.util.ArrayList;

public interface EquipoDao {

    public Equipo getEquipo(int id) throws TimeLimitExceptions;

	public void registrarEquipo(String nombre, String estado, String enUso, int idLaboratorio,String nombreLaboratorio) throws TimeLimitExceptions;


    public ArrayList<Equipo> getEquipos()throws TimeLimitExceptions;

    public void cambiarLaboratorio(int id)throws TimeLimitExceptions;

    public void asignarLab(int id,int idLaboratorio,String nombreLaboratorio) throws TimeLimitExceptions;

}
