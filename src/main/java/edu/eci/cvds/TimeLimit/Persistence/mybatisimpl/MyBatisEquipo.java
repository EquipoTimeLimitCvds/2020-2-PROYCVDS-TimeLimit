package edu.eci.cvds.TimeLimit.Persistence.mybatisimpl;

import com.google.inject.Inject;
import edu.eci.cvds.TimeLimit.Persistence.EquipoDao;
import edu.eci.cvds.TimeLimit.Persistence.mybatisimpl.mappers.EquipoMapper;
import edu.eci.cvds.TimeLimit.exceptions.TimeLimitExceptions;
import edu.eci.cvds.TimeLimit.model.Equipo;

public class MyBatisEquipo implements EquipoDao {

    @Inject
    private EquipoMapper equipoMapper;

    public EquipoMapper getEquipoMapper() {
        return equipoMapper;
    }

    public void setEquipoMapper(EquipoMapper equipoMapper) {
        this.equipoMapper = equipoMapper;
    }

    @Override
    public Equipo getEquipo(int id) throws TimeLimitExceptions {
        try{
            return equipoMapper.getEquipo(id);
        }catch (Exception e){
            throw new TimeLimitExceptions("No puede obtener el equipo",e);
        }
    }
    public void registrarEquipo(int id,String nombre,String estado,Boolean enuso,int idLaboratorio) throws TimeLimitExceptions{
        try{
            equipoMapper.registrarEquipo(id,nombre,estado,enuso,idLaboratorio);
        }catch (Exception e){
            throw new TimeLimitExceptions("No se puede insertar el equipo",e);
        }
    }
}