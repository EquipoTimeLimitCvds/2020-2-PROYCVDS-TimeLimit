package edu.eci.cvds.TimeLimit.services;

import edu.eci.cvds.TimeLimit.exceptions.TimeLimitExceptions;

import java.time.LocalDate;

public interface NovedadServices {

    public default void registrarNovedad(String descripcion, String estado, String tipo, int idElemento) throws TimeLimitExceptions {
    }
}
