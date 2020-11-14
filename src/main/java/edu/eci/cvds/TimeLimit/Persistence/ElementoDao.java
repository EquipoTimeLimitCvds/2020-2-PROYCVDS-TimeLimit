package edu.eci.cvds.TimeLimit.Persistence;

import edu.eci.cvds.TimeLimit.exceptions.TimeLimitExceptions;
import edu.eci.cvds.TimeLimit.model.Elemento;

public interface ElementoDao {
    public void registrarElemento(String nombre,String marca,String modelo,String caracteristicas,int idEquipo)throws TimeLimitExceptions;
    public Elemento getElemento(int id) throws TimeLimitExceptions;


}

