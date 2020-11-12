package edu.eci.cvds.TimeLimit.Persistence.mybatisimpl.mappers;

import org.apache.ibatis.annotations.Param;

import edu.eci.cvds.TimeLimit.model.Laboratorios;


public interface LaboratoriosMapper {

	public Laboratorios getLaboratorios(int id);

	public void registrarLaboratorios(@Param("id")int id,@Param("nombre")String nombre,@Param("horario")String horario,@Param("descripcion") String descripcion);

}
