package edu.eci.cvds.TimeLimit.services.impl;

import com.google.inject.Inject;
import edu.eci.cvds.TimeLimit.Persistence.UserDAO;
import edu.eci.cvds.TimeLimit.exceptions.TimeLimitExceptions;
import edu.eci.cvds.TimeLimit.model.User;
import edu.eci.cvds.TimeLimit.services.UserServices;
import java.util.List;

public class UserServicesImpl implements UserServices {
    @Inject
    private UserDAO userDao;

    /**
    @Override
    public List<User> getUsers() throws TimeLimitExceptions {
        return userDao.getUsers();
    }**/

    @Override
    public User getUser(String nombre) throws TimeLimitExceptions {
        return userDao.getUser(nombre);
    }

    @Override
    public boolean validateLogin(String nombre, String clave) throws TimeLimitExceptions {
        return false;
    }
}
