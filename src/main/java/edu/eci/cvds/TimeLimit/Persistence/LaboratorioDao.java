package edu.eci.cvds.TimeLimit.Persistence;

import edu.eci.cvds.TimeLimit.exceptions.TimeLimitExceptions;
import edu.eci.cvds.TimeLimit.model.Equipo;
import edu.eci.cvds.TimeLimit.model.Laboratorio;

import java.sql.Time;
import java.time.LocalDate;
import java.util.ArrayList;

public interface LaboratorioDao {
    public void registrarLaboratorio(String nombre, String horario, String descripcion, String cerrado)throws TimeLimitExceptions;

	public Laboratorio getLaboratorio(int id) throws TimeLimitExceptions;
    public ArrayList<Laboratorio>getLaboratorios()throws TimeLimitExceptions;
    public void cerrarLaboratorio(int cerrar)throws TimeLimitExceptions;


}
