package edu.eci.cvds.TimeLimit.services.impl;

import com.google.inject.Inject;
import edu.eci.cvds.TimeLimit.Persistence.EquipoDao;
import edu.eci.cvds.TimeLimit.exceptions.TimeLimitExceptions;
import edu.eci.cvds.TimeLimit.model.Equipo;
import edu.eci.cvds.TimeLimit.services.EquipoServices;

import java.util.ArrayList;

public class EquipoServicesImpl implements EquipoServices {
    @Inject
    private EquipoDao equipoDao;


    @Override
    public void registrarEquipo(String nombre, String estado, String enUso, int idLaboratorio,String nombreLaboratorio) throws TimeLimitExceptions {
        if(estado==null){
            throw new TimeLimitExceptions("El equipo no es correcto");
        }else{
            equipoDao.registrarEquipo(nombre,estado,enUso,idLaboratorio,nombreLaboratorio);
        }
    }

    @Override
    public Equipo getEquipo(int id) throws TimeLimitExceptions {
        return null;
    }

    public void imprimir(){
        System.out.println("hola imprimir");
    }

    @Override
    public ArrayList<Equipo>getEquipos()throws TimeLimitExceptions{
        return equipoDao.getEquipos();

    }

}