package edu.eci.cvds.TimeLimit.services;

import edu.eci.cvds.TimeLimit.exceptions.TimeLimitExceptions;
import edu.eci.cvds.TimeLimit.model.Equipo;
import edu.eci.cvds.TimeLimit.model.Laboratorio;


import java.util.ArrayList;

public interface LaboratorioServices {

    public void registrarLaboratorio(String nombre,String horario,String descripcion)throws TimeLimitExceptions;

    public Laboratorio getLaboratorio(int id)throws TimeLimitExceptions;


    public ArrayList<Laboratorio> getLaboratorios()throws TimeLimitExceptions;

    public ArrayList<Equipo> getEquiposDeRedes()throws TimeLimitExceptions;

    public ArrayList<Equipo> getEquiposDePlataformas()throws TimeLimitExceptions;

    public ArrayList<Equipo> getEquiposDeSoftware()throws TimeLimitExceptions;



	
}