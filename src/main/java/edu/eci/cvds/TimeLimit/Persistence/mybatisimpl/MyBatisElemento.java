package edu.eci.cvds.TimeLimit.Persistence.mybatisimpl;

import com.google.inject.Inject;
import edu.eci.cvds.TimeLimit.Persistence.ElementoDao;
import edu.eci.cvds.TimeLimit.Persistence.mybatisimpl.mappers.ElementoMapper;
import edu.eci.cvds.TimeLimit.exceptions.TimeLimitExceptions;
import edu.eci.cvds.TimeLimit.model.Elemento;

public class MyBatisElemento implements ElementoDao {

    @Inject
    private ElementoMapper elementoMapper;

    public ElementoMapper getElementoMapper() {
        return elementoMapper;
    }

    public void setElementoMapper(ElementoMapper elementoMapper) {
        this.elementoMapper = elementoMapper;
    }

    @Override
    public Elemento getElemento(int id) throws TimeLimitExceptions {
        try{
            return elementoMapper.getElemento(id);
        }catch (Exception e){
            throw new TimeLimitExceptions("No puede obtener el elemento",e);
        }
    }
    public void registrarElemento(int id,String nombre,String marca,String modelo,String caracteristicas,int idEquipo) throws TimeLimitExceptions{
        try{
            elementoMapper.registrarElemento(id,nombre,marca,modelo,caracteristicas,idEquipo);
        }catch (Exception e){
            throw new TimeLimitExceptions("No se puede insertar el elemento",e);
        }
    }
}
