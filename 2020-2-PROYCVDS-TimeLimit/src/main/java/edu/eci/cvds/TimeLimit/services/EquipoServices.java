package edu.eci.cvds.TimeLimit.services;

import edu.eci.cvds.TimeLimit.exceptions.TimeLimitExceptions;
import edu.eci.cvds.TimeLimit.model.Equipo;

import java.sql.Time;
import java.util.ArrayList;

public interface EquipoServices {

    public void registrarEquipo(String nombre ,String estado,String enUso,int idLaboratorio)throws TimeLimitExceptions;

    public Equipo getEquipo(int id)throws TimeLimitExceptions;

    public void imprimir() throws TimeLimitExceptions;


    public ArrayList<Equipo> getEquipos()throws TimeLimitExceptions;
}