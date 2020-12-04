package edu.eci.cvds.TimeLimit.services.impl;
import com.google.inject.Inject;


import edu.eci.cvds.TimeLimit.Persistence.LaboratorioDao;
import edu.eci.cvds.TimeLimit.exceptions.TimeLimitExceptions;
import edu.eci.cvds.TimeLimit.model.Equipo;
import edu.eci.cvds.TimeLimit.model.Laboratorio;
import edu.eci.cvds.TimeLimit.services.LaboratorioServices;

import java.util.ArrayList;

public class LaboratorioServiceImpl implements LaboratorioServices{
	@Inject
    private LaboratorioDao laboratorioDao;


	@Override
	public void registrarLaboratorio(String nombre, String horario, String descripcion) throws TimeLimitExceptions {
		if(nombre==null){
			throw new TimeLimitExceptions("El laboratorio no es correcto");
		}else{
			laboratorioDao.registrarLaboratorio(nombre,horario,descripcion);
		}
	}

	@Override
	public Laboratorio getLaboratorio(int id) throws TimeLimitExceptions {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Laboratorio> getLaboratorios() throws TimeLimitExceptions {
		return laboratorioDao.getLaboratorios();
	}




}
