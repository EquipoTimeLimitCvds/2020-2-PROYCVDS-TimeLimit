package edu.eci.cvds.TimeLimit.Persistence.mybatisimpl.mappers;

import edu.eci.cvds.TimeLimit.model.Equipo;
import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;

public interface EquipoMapper {
    public void registrarEquipo(@Param("nombre")String nombre,@Param("estado")String estado,@Param("enUso")String enUso,@Param("idLaboratorio")int idLaboratorio,@Param("nombreLaboratorio")String nombreLaboratorio);
    public Equipo getEquipo(int id);
    public ArrayList<Equipo> getEquipos();

    public void cambiarLaboratorio(@Param("id")int id);

    public void asignarLab(@Param("id") int id,@Param("idlaboratorio") int idLaboratorio,@Param("nombrelaboratorio") String nombreLaboratorio);
}
