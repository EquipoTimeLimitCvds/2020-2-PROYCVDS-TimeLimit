package edu.eci.cvds.TimeLimit.Persistence;

import edu.eci.cvds.TimeLimit.exceptions.TimeLimitExceptions;
import edu.eci.cvds.TimeLimit.model.User;

import java.util.List;

public interface UserDAO {

    //public List<User> getUsers() throws TimeLimitExceptions;

    public User getUser(String nombre) throws  TimeLimitExceptions;
}
