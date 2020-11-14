package edu.eci.cvds.TimeLimit.services;

import edu.eci.cvds.TimeLimit.exceptions.TimeLimitExceptions;
import edu.eci.cvds.TimeLimit.model.Elemento;

import java.sql.Time;

public interface ElementoServices {

    public void registrarElemento(String nombre ,String marca,String modelo,String caracteristicas,int idEquipo)throws TimeLimitExceptions;

    public Elemento getElemento(int id)throws TimeLimitExceptions;

    public void imprimir() throws TimeLimitExceptions;
}
