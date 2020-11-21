package edu.eci.cvds.TimeLimit.Persistence.mybatisimpl;

import com.google.inject.Inject;
import edu.eci.cvds.TimeLimit.Persistence.ElementoDao;
import edu.eci.cvds.TimeLimit.Persistence.mybatisimpl.mappers.ElementoMapper;
import edu.eci.cvds.TimeLimit.exceptions.TimeLimitExceptions;
import edu.eci.cvds.TimeLimit.model.Elemento;

import java.sql.Time;
import java.util.ArrayList;

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
    
    @Override
    public void registrarElemento(String nombre,String marca,String modelo,String caracteristicas,int idEquipo) throws TimeLimitExceptions{
        try{
            elementoMapper.registrarElemento(nombre,marca,modelo,caracteristicas,idEquipo);
        }catch (Exception e){
            throw new TimeLimitExceptions("No se puede insertar el elemento",e);
        }
    }
    public ArrayList<Elemento>getElementos()throws TimeLimitExceptions{
        try{
            return elementoMapper.getElementos();
        }catch (Exception e){
            throw new TimeLimitExceptions("No se puede consultar los elementos",e);
        }
    }
    public void editElemento(int id,int idEquipo) throws TimeLimitExceptions {
        try{
            elementoMapper.editElemento(id,idEquipo);
        }catch (Exception e){
            throw new TimeLimitExceptions("no se puede asociar elemento con el equipo",e);
        }
    }

	@Override
	public void eliminarElemento(int id,String modelo) throws TimeLimitExceptions {
		try{
            elementoMapper.eliminarElemento(id, modelo);
        }catch (Exception e){
            throw new TimeLimitExceptions("No se puede dar de baja el elemento",e);
        }	
	}
	
    @Override
    public void addElemento(int id, int idequipo) throws TimeLimitExceptions {
        try{
            elementoMapper.addElemento(id,idequipo);
        }catch (Exception e){
            throw new TimeLimitExceptions("no se puede asociar elemento con el equipo",e);
        }
    }

    @Override
    public void borrarElemento(int id) throws TimeLimitExceptions {
        try{
            elementoMapper.borrarElemento(id);
        }catch (Exception e){
            throw new TimeLimitExceptions("no se puede borrarElemento",e);
        }
    }
}
