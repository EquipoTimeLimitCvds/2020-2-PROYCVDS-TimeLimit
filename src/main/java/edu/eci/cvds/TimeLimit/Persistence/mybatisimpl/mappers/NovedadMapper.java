package edu.eci.cvds.TimeLimit.Persistence.mybatisimpl.mappers;

import edu.eci.cvds.TimeLimit.model.Elemento;
import edu.eci.cvds.TimeLimit.model.Novedad;
import org.apache.ibatis.annotations.Param;

import java.time.LocalDate;
import java.util.Date;

public interface NovedadMapper {
    public void registrarNovedad(@Param("id")int id, @Param("fecha") LocalDate fecha, @Param("descripcion")String descripcion, @Param("estado")String estado, @Param("tipo")String tipo, @Param("idelemento")int idelemento);

    public Novedad getNovedad(int id);
}
