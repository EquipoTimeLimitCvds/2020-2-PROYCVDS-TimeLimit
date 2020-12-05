package edu.eci.cvds.TimeLimit.Persistence.mybatisimpl;

import com.google.inject.Inject;
import edu.eci.cvds.TimeLimit.Persistence.UserDAO;
import edu.eci.cvds.TimeLimit.exceptions.TimeLimitExceptions;
import edu.eci.cvds.TimeLimit.model.User;

import edu.eci.cvds.TimeLimit.Persistence.mybatisimpl.mappers.UserMapper;

import java.util.List;

public class MyBatisUser implements UserDAO {

    @Inject
    private UserMapper userMapper;
    public UserMapper getUserMapper() {
        return userMapper;
    }

    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public User getUser(String nombre) throws TimeLimitExceptions {
        try{
            return userMapper.getUser(nombre);
        }catch (Exception e){
            throw new TimeLimitExceptions("No puede obtener los usuario",e);
        }
    }
}
