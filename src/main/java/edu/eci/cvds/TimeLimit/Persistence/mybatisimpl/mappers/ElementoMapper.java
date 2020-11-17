package edu.eci.cvds.TimeLimit.Persistence.mybatisimpl.mappers;

import edu.eci.cvds.TimeLimit.model.Elemento;
import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;

public interface ElementoMapper {
    public void registrarElemento(@Param("nombre")String nombre,@Param("marca")String marca,@Param("modelo")String modelo,@Param("caracteristicas")String caracteristicas,@Param("idEquipo")int idEquipo);

    public Elemento getElemento(int id);

    public ArrayList<Elemento> getElementos();

    public void editElemento(@Param("id")int id,@Param("idequipo")int idequipo);
}
