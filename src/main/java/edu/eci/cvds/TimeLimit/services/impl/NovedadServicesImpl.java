package edu.eci.cvds.TimeLimit.services.impl;

import com.google.inject.Inject;
import edu.eci.cvds.TimeLimit.Persistence.EquipoDao;
import edu.eci.cvds.TimeLimit.Persistence.NovedadDao;
import edu.eci.cvds.TimeLimit.exceptions.TimeLimitExceptions;
import edu.eci.cvds.TimeLimit.services.NovedadServices;

import java.time.LocalDate;

public class NovedadServicesImpl implements NovedadServices {
    @Inject
    private NovedadDao novedadDao;
    @Override
    public void registrarNovedad(String descripcion, String estado, String tipo, int idElemento) throws TimeLimitExceptions {
        if(descripcion==null){
            throw new TimeLimitExceptions(("La novedad no es correcta"));
        }else{
            novedadDao.registrarNovedad(descripcion,estado,tipo,idElemento);
        }
    }
}
