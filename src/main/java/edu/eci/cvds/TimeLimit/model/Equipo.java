package edu.eci.cvds.TimeLimit.model;

public class Equipo {
    private int id;
    private String nombre;
    private String estado;
    private Boolean enuso;
    private int idLaboratorio;

    public void Equipo(int id,String nombre,String marca,String modelo,String caracteristicas,int idEquipo){
        this.id=id;
        this.nombre=nombre;
        this.estado=estado;
        this.enuso=enuso;
        this.idLaboratorio=idLaboratorio;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Boolean getenuso() {
        return enuso;
    }

    public void setenuso(Boolean enuso) {
        this.enuso = enuso;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdLaboratorio() {
        return idLaboratorio;
    }

    public void setIdLaboratorio(int idLaboratorio) {
        this.idLaboratorio = idLaboratorio;
    }

}