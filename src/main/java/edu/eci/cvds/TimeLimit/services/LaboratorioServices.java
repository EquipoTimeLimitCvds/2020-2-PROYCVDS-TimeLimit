package edu.eci.cvds.TimeLimit.services;

import edu.eci.cvds.TimeLimit.exceptions.TimeLimitExceptions;
import edu.eci.cvds.TimeLimit.model.Equipo;
import edu.eci.cvds.TimeLimit.model.Laboratorios;

import java.sql.Time;
import java.util.List;

public interface LaboratorioServices {

    public void registrarLaboratorio(String nombre,String horario,String descripcion)throws TimeLimitExceptions;

    public Laboratorios getLaboratorio(int id)throws TimeLimitExceptions;

    public void imprimir() throws TimeLimitExceptions;
    
    public List<Laboratorios> consultarLaboratorios() throws TimeLimitExceptions;

	
}