package edu.eci.cvds.TimeLimit.Persistence;

import edu.eci.cvds.TimeLimit.exceptions.TimeLimitExceptions;
import edu.eci.cvds.TimeLimit.model.Novedad;

import java.time.LocalDate;

public interface NovedadDao {
    public Novedad getNovedad(int id) throws TimeLimitExceptions;
    public void registrarNovedad(String descripcion, String estado, String tipo, int idElemento)throws TimeLimitExceptions;
}
