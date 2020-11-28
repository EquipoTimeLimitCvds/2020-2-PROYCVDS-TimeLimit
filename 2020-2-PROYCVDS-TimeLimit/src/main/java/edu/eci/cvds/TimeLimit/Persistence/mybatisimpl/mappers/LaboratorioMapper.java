package edu.eci.cvds.TimeLimit.Persistence.mybatisimpl.mappers;

import edu.eci.cvds.TimeLimit.model.Laboratorio;
import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;


public interface LaboratorioMapper {

	public Laboratorio getLaboratorio(int id);

	public void registrarLaboratorio(@Param("nombre")String nombre,@Param("horario")String horario,@Param("descripcion") String descripcion);
	public ArrayList<Laboratorio>getLaboratorios();
}
