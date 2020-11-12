package edu.eci.cvds.TimeLimit.Persistence.mybatisimpl.mappers;

import edu.eci.cvds.TimeLimit.model.Equipo;
import org.apache.ibatis.annotations.Param;

public interface EquipoMapper {
    public void registrarEquipo(@Param("id")int id,@Param("nombre")String nombre,@Param("estado")String estado,@Param("enUso")String enUso,@Param("idLaboratorio")int idLaboratorio);

    public Equipo getEquipo(int id);
}
