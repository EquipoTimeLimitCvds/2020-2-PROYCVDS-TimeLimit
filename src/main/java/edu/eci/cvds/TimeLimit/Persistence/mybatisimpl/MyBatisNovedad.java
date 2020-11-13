package edu.eci.cvds.TimeLimit.Persistence.mybatisimpl;

import com.google.inject.Inject;
import edu.eci.cvds.TimeLimit.Persistence.NovedadDao;
import edu.eci.cvds.TimeLimit.Persistence.mybatisimpl.mappers.NovedadMapper;
import edu.eci.cvds.TimeLimit.exceptions.TimeLimitExceptions;
import edu.eci.cvds.TimeLimit.model.Novedad;

import java.time.LocalDate;

public class MyBatisNovedad implements NovedadDao {

    @Inject
    private NovedadMapper novedadMapper;

    public NovedadMapper getNovedadMapper() {

        return novedadMapper;
    }

    public void setNovedadMapper(NovedadMapper novedadMapper)
    {
        this.novedadMapper = novedadMapper;
    }

    @Override
    public Novedad getNovedad(int id) throws TimeLimitExceptions {
        try{
            return novedadMapper.getNovedad(id);
        }catch (Exception e){
            throw new TimeLimitExceptions("No puede obtener la novedad",e);
        }
    }
    public void registrarNovedad(int id,String descripcion,String estado,String tipo,int idElemento) throws TimeLimitExceptions{
        try{
            LocalDate fecha=LocalDate.now();
            novedadMapper.registrarNovedad(id,fecha,descripcion,estado,tipo,idElemento);
        }catch (Exception e){
            throw new TimeLimitExceptions("No se puede insertar la Novedad",e);
        }
    }
}
