package edu.eci.cvds.TimeLimit.Persistence.mybatisimpl;

import com.google.inject.Inject;
import edu.eci.cvds.TimeLimit.Persistence.LaboratorioDao;
import edu.eci.cvds.TimeLimit.Persistence.mybatisimpl.mappers.LaboratorioMapper;
import edu.eci.cvds.TimeLimit.exceptions.TimeLimitExceptions;
import edu.eci.cvds.TimeLimit.model.Equipo;
import edu.eci.cvds.TimeLimit.model.Laboratorio;

import java.sql.Time;
import java.time.LocalDate;
import java.util.ArrayList;

public class MyBatisLaboratorio implements LaboratorioDao {

    @Inject
    private LaboratorioMapper laboratorioMapper;

    public LaboratorioMapper getLaboratoriosMapper() {

        return laboratorioMapper;
    }

    public void setLaboratoriosMapper(LaboratorioMapper laboratorioMapper) {
        this.laboratorioMapper = laboratorioMapper;
    }
    @Override
    public Laboratorio getLaboratorio(int id) throws TimeLimitExceptions {
        try{
            return laboratorioMapper.getLaboratorio(id);
        }catch (Exception e){
            throw new TimeLimitExceptions("No puede obtener los laboratorios",e);
        }
    }
    @Override
    public void registrarLaboratorio(String nombre, String horario, String descripcion, String cerrado) throws TimeLimitExceptions{
        try{
            LocalDate fechaDeCreado=LocalDate.now();
            laboratorioMapper.registrarLaboratorio(nombre,horario,descripcion,cerrado,fechaDeCreado,null);
        }catch (Exception e){
            throw new TimeLimitExceptions("No se puede insertar el laboratorio",e);
        }
    }
    @Override
    public ArrayList<Laboratorio>getLaboratorios()throws TimeLimitExceptions{
        try{
            return laboratorioMapper.getLaboratorios();
        }catch (Exception e){
            throw new TimeLimitExceptions("No puede obtener los laboratorios",e);
        }
    }
    @Override
    public void cerrarLaboratorio(int cerrar)throws TimeLimitExceptions{
        try{
            LocalDate fechaDeCerrado=LocalDate.now();
            laboratorioMapper.cerrarLaboratorio(cerrar,fechaDeCerrado);
        }catch (Exception e){
            throw new TimeLimitExceptions("No se puede cerrar el laboratorio");
        }
    }




}