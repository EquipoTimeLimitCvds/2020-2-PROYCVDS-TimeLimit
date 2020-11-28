package edu.eci.cvds.TimeLimit.services;

import edu.eci.cvds.TimeLimit.exceptions.TimeLimitExceptions;
import edu.eci.cvds.TimeLimit.model.User;

import java.util.List;

public interface UserServices {
    //public List<User> getUsers() throws TimeLimitExceptions;

    public User getUser (String nombre) throws TimeLimitExceptions;

    public boolean validateLogin(String nombre, String clave) throws TimeLimitExceptions;
}
