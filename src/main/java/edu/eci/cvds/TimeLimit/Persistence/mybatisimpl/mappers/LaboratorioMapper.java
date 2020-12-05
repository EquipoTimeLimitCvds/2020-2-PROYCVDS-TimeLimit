package edu.eci.cvds.TimeLimit.Persistence.mybatisimpl.mappers;

import edu.eci.cvds.TimeLimit.model.Equipo;
import edu.eci.cvds.TimeLimit.model.Laboratorio;
import org.apache.ibatis.annotations.Param;

import java.time.LocalDate;
import java.util.ArrayList;


public interface LaboratorioMapper {

	public Laboratorio getLaboratorio(int id);

	public void registrarLaboratorio(@Param("nombre")String nombre,@Param("horario")String horario,@Param("descripcion") String descripcion,@Param("cerrado")String cerrado,@Param("fechadecreado") LocalDate fechadecreado,@Param("fechadecerrado") LocalDate fechadecerrado);
	public ArrayList<Laboratorio>getLaboratorios();

    public ArrayList<Equipo> getEquiposDeRedes();
    public ArrayList<Equipo> getEquiposDePlataformas();
	public ArrayList<Equipo> getEquiposDeSoftware();

	public void cerrarLaboratorio(@Param("id")int id,@Param("fechadecerrado")LocalDate fechaDeCerrado);

}
