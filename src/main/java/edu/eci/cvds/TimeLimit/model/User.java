package edu.eci.cvds.TimeLimit.model;

public class User {
    private int id;
    private String nombre;
    private String apellido;
    private String cargo;
    private String clave;

    public User(int id,String nombre,String apellido,String cargo,String clave){
        this.id=id;
        this.nombre=nombre;
        this.apellido=apellido;
        this.cargo=cargo;
        this.clave=clave;
    }
    public String getNombre(){
        return this.nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}
