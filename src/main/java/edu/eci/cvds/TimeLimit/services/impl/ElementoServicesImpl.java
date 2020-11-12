package edu.eci.cvds.TimeLimit.services.impl;

import com.google.inject.Inject;
import edu.eci.cvds.TimeLimit.Persistence.ElementoDao;
import edu.eci.cvds.TimeLimit.exceptions.TimeLimitExceptions;
import edu.eci.cvds.TimeLimit.model.Elemento;
import edu.eci.cvds.TimeLimit.services.ElementoServices;

public class ElementoServicesImpl implements ElementoServices {
    @Inject
    private ElementoDao elementoDao;


    @Override
    public void registrarElemento(int id, String nombre, String marca, String modelo, String caracteristicas, int idEquipo) throws TimeLimitExceptions {
        if(marca==null){
            throw new TimeLimitExceptions("El elemento no es correcto");
        }else{
            elementoDao.registrarElemento(id,nombre,marca,modelo,caracteristicas,idEquipo);
        }
    }

    @Override
    public Elemento getElemento(int id) throws TimeLimitExceptions {
        return null;
    }

    public void imprimir(){
        System.out.println("hola imprimir");
    }

}
