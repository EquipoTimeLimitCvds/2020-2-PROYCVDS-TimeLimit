package edu.eci.cvds.TimeLimit.model;

public class Elemento {
    private int id;
    private String nombre;
    private String marca;
    private String modelo;
    private String caracteristicas;
    private int idEquipo;

    public void Elemento(int id,String nombre,String marca,String modelo,String caracteristicas,int idEquipo){
        this.id=id;
        this.nombre=nombre;
        this.marca=marca;
        this.modelo=modelo;
        this.caracteristicas=caracteristicas;
        this.idEquipo=idEquipo;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdEquipo() {
        return idEquipo;
    }

    public void setIdEquipo(int idEquipo) {
        this.idEquipo = idEquipo;
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }
}
