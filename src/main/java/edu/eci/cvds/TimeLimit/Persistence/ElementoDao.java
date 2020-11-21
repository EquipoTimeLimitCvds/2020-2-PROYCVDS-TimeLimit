package edu.eci.cvds.TimeLimit.Persistence;

import edu.eci.cvds.TimeLimit.exceptions.TimeLimitExceptions;
import edu.eci.cvds.TimeLimit.model.Elemento;

import java.util.ArrayList;

public interface ElementoDao {
    public void registrarElemento(String nombre,String marca,String modelo,String caracteristicas,int idEquipo)throws TimeLimitExceptions;
    public Elemento getElemento(int id) throws TimeLimitExceptions;
    
    public void eliminarElemento(int id,String modelo)throws TimeLimitExceptions;

    public ArrayList<Elemento> getElementos()throws TimeLimitExceptions;

    public void editElemento(int id, int idEquipo) throws TimeLimitExceptions;
}

