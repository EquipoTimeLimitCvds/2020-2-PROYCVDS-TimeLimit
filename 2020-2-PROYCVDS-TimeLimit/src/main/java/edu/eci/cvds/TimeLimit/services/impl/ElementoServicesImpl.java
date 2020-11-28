package edu.eci.cvds.TimeLimit.services.impl;

import com.google.inject.Inject;
import edu.eci.cvds.TimeLimit.Persistence.ElementoDao;
import edu.eci.cvds.TimeLimit.exceptions.TimeLimitExceptions;
import edu.eci.cvds.TimeLimit.model.Elemento;
import edu.eci.cvds.TimeLimit.services.ElementoServices;

import java.sql.Time;
import java.util.ArrayList;

public class ElementoServicesImpl implements ElementoServices {
    @Inject
    private ElementoDao elementoDao;


    @Override
    public void registrarElemento(String nombre, String marca, String modelo, String caracteristicas, int idEquipo) throws TimeLimitExceptions {
        if(marca==null){
            throw new TimeLimitExceptions("El elemento no es correcto");
        }else{
            elementoDao.registrarElemento(nombre,marca,modelo,caracteristicas,idEquipo);
        }
    }
    
    @Override
    public void eliminarElemento(int id,String modelo) throws TimeLimitExceptions {
    	elementoDao.eliminarElemento(id,modelo);
    }

    @Override
    public Elemento getElemento(int id) throws TimeLimitExceptions {
        return null;
    }

    public void imprimir(){
        System.out.println("hola imprimir");
    }

    public ArrayList<Elemento>getElementos()throws TimeLimitExceptions {
        return elementoDao.getElementos();
    }
    @Override
    public void editElemento(int id,int idEquipo)throws TimeLimitExceptions{
        elementoDao.editElemento(id,idEquipo);
    }

    @Override
    public void borrarElemento(int id) throws TimeLimitExceptions {
        elementoDao.borrarElemento(id);
    }

    @Override
    public void addElemento(int id, int idequipo) throws TimeLimitExceptions {
        elementoDao.addElemento(id,idequipo);

    }

}
