package edu.eci.cvds.TimeLimit.Persistence;

import edu.eci.cvds.TimeLimit.exceptions.TimeLimitExceptions;
import edu.eci.cvds.TimeLimit.model.Novedad;

public interface NovedadDao {
    public Novedad getNovedad(int id) throws TimeLimitExceptions;

}
