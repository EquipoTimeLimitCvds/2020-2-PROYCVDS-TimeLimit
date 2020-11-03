package edu.eci.cvds.TimeLimit.model;

import javax.ejb.Local;
import java.time.LocalDate;

public class Novedad {

    private int id;
    private LocalDate fecha;
    private String descripcion;
    private String estado;
    private String tipo;
    private int idElemento;

    public void Novedad(int id, LocalDate fecha,String descripcion,String estado,String tipo,int idElemento){
        this.id=id;
        this.fecha=fecha;
        this.descripcion=descripcion;
        this.estado=estado;
        this.tipo=tipo;
        this.idElemento=idElemento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getIdElemento() {
        return idElemento;
    }

    public void setIdElemento(int idElemento) {
        this.idElemento = idElemento;
    }
}
