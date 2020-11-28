package edu.eci.cvds.TimeLimit.services;

import edu.eci.cvds.TimeLimit.exceptions.TimeLimitExceptions;
import edu.eci.cvds.TimeLimit.model.Novedad;

import java.time.LocalDate;
import java.util.ArrayList;

public interface NovedadServices {

    public default void registrarNovedad(String descripcion, String estado, String tipo, int idElemento) throws TimeLimitExceptions {

    }

    public ArrayList<Novedad> getNovedades()throws TimeLimitExceptions;
}
