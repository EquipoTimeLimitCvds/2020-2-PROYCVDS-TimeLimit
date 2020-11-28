package edu.eci.cvds.TimeLimit.model;

public class Laboratorio {
    private int id;
    private String nombre;
    private String horario;
    private String descripcion;

    public void Laboratorio(int id,String nombre,String horario,String descripcion){
        this.id=id;
        this.nombre=nombre;
        this.horario=horario;
        this.descripcion=descripcion;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

   
}