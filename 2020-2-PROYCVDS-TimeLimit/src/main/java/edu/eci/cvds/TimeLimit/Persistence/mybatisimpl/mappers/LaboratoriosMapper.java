package edu.eci.cvds.TimeLimit.Persistence.mybatisimpl.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import edu.eci.cvds.TimeLimit.model.Laboratorios;


public interface LaboratoriosMapper {

	public Laboratorios getLaboratorios(int id);

	public void registrarLaboratorio(@Param("nombre")String nombre,@Param("horario")String horario,@Param("descripcion") String descripcion);
	
	public List<Laboratorios> consultarLaboratorios();

}
