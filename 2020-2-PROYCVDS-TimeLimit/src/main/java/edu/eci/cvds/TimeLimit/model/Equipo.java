package edu.eci.cvds.TimeLimit.model;

public class Equipo {
    private int id;
    private String nombre;
    private String estado;
    private String enUso;
    private int idLaboratorio;

    public void Equipo(int id,String nombre,String estado,String enUso,int idLaboratorio){
        this.id=id;
        this.nombre=nombre;
        this.estado=estado;
        this.enUso=enUso;
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

    public String getenuso() {
        return enUso;
    }

    public void setenuso(String enUso) {
        this.enUso = enUso;
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