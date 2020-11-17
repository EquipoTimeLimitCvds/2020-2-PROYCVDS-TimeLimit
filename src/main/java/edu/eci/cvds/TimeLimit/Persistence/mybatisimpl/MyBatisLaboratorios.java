package edu.eci.cvds.TimeLimit.Persistence.mybatisimpl;

import com.google.inject.Inject;
import edu.eci.cvds.TimeLimit.Persistence.LaboratoriosDao;
import edu.eci.cvds.TimeLimit.Persistence.mybatisimpl.mappers.LaboratoriosMapper;
import edu.eci.cvds.TimeLimit.exceptions.TimeLimitExceptions;
import edu.eci.cvds.TimeLimit.model.Laboratorios;

import java.time.LocalDate;
import java.util.List;

public class MyBatisLaboratorios implements LaboratoriosDao {

    @Inject
    private LaboratoriosMapper laboratoriosMapper;

    public LaboratoriosMapper getLaboratoriosMapper() {

        return laboratoriosMapper;
    }
    
    public void setLaboratoriosMapper(LaboratoriosMapper laboratoriosMapper) {
        this.laboratoriosMapper = laboratoriosMapper;
    }
    @Override
    public Laboratorios getLaboratorios(int id) throws TimeLimitExceptions {
        try{
            return laboratoriosMapper.getLaboratorios(id);
        }catch (Exception e){
            throw new TimeLimitExceptions("No puede obtener los laboratorios",e);
        }
    }
    @Override
    public void registrarLaboratorio(String nombre,String horario,String descripcion) throws TimeLimitExceptions{
        try{
            laboratoriosMapper.registrarLaboratorio(nombre,horario,descripcion);
        }catch (Exception e){
            throw new TimeLimitExceptions("No se puede insertar el laboratorio",e);
        }
    }

	@Override
	public List<Laboratorios> consultarLaboratorios() throws TimeLimitExceptions  {
		
		//return laboratoriosMapper.consultarLaboratorios();
		return laboratoriosMapper.consultarLaboratorios();
	}

}