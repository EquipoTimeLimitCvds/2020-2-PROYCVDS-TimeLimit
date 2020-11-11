package edu.eci.cvds.TimeLimit.Persistence;

import edu.eci.cvds.TimeLimit.exceptions.TimeLimitExceptions;
import edu.eci.cvds.TimeLimit.model.Laboratorios;

public interface LaboratoriosDao {

	Laboratorios getLaboratorios(int id) throws TimeLimitExceptions;

}
