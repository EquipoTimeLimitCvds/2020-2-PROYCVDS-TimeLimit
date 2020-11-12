package edu.eci.cvds.TimeLimit.Persistence;

import edu.eci.cvds.TimeLimit.exceptions.TimeLimitExceptions;
import edu.eci.cvds.TimeLimit.model.Elemento;
import edu.eci.cvds.TimeLimit.model.Equipo;

public interface EquipoDao {

    public Equipo getEquipo(int id) throws TimeLimitExceptions;

	public void registrarEquipo(int id, String nombre, String estado, String enUso, int idLaboratorio) throws TimeLimitExceptions;


}
