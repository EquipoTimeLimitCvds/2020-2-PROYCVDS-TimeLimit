package edu.eci.cvds.TimeLimit.services.impl;
import java.util.List;

import com.google.inject.Inject;


import edu.eci.cvds.TimeLimit.Persistence.LaboratoriosDao;
import edu.eci.cvds.TimeLimit.exceptions.TimeLimitExceptions;
import edu.eci.cvds.TimeLimit.model.Laboratorios;
import edu.eci.cvds.TimeLimit.services.ElementoServices;
import edu.eci.cvds.TimeLimit.services.LaboratorioServices;

public class LaboratoriosServiceImpl implements LaboratorioServices{
	@Inject
    private LaboratoriosDao laboratoriosDao;


	@Override
	public void registrarLaboratorio(String nombre, String horario, String descripcion) throws TimeLimitExceptions {
		if(nombre==null){
			throw new TimeLimitExceptions("El laboratorio no es correcto");
		}else{
			laboratoriosDao.registrarLaboratorio(nombre,horario,descripcion);
		}
	}

	@Override
	public Laboratorios getLaboratorio(int id) throws TimeLimitExceptions {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void imprimir() throws TimeLimitExceptions {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public List<Laboratorios> consultarLaboratorios() throws TimeLimitExceptions {
		
		return laboratoriosDao.consultarLaboratorios();
	}
	
	

}
