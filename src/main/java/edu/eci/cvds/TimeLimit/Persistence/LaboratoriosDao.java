package edu.eci.cvds.TimeLimit.Persistence;

import edu.eci.cvds.TimeLimit.exceptions.TimeLimitExceptions;
import edu.eci.cvds.TimeLimit.model.Laboratorios;

public interface LaboratoriosDao {
    public void registrarLaboratorio(String nombre,String horario,String descripcion)throws TimeLimitExceptions;

	Laboratorios getLaboratorios(int id) throws TimeLimitExceptions;

}