package edu.eci.cvds.TimeLimit.model;

import java.time.LocalDate;

public class Laboratorio {
    private int id;
    private String nombre;
    private String horario;
    private String descripcion;
    private String cerrado;
    private LocalDate fechaDeCreado;
    private LocalDate fechaDeCerrado;

    public void Laboratorio(int id,String nombre,String horario,String descripcion,String cerrado,LocalDate fechaDeCreado,LocalDate fechaDeCerrado){
        this.id=id;
        this.nombre=nombre;
        this.horario=horario;
        this.descripcion=descripcion;
        this.cerrado=cerrado;
        this.fechaDeCreado=fechaDeCreado;
        this.fechaDeCerrado=fechaDeCerrado;
    }

    public void setFechaDeCreado(LocalDate fechaDeCreado) {
        this.fechaDeCreado = fechaDeCreado;
    }

    public void setFechaDeCerrado(LocalDate fechaDeCerrado) {
        this.fechaDeCerrado = fechaDeCerrado;
    }

    public LocalDate getFechaDeCreado() {
        return fechaDeCreado;
    }

    public LocalDate getFechaDeCerrado() {
        return fechaDeCerrado;
    }

    public String getCerrado() {
        return cerrado;
    }

    public void setCerrado(String cerrado) {
        this.cerrado = cerrado;
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