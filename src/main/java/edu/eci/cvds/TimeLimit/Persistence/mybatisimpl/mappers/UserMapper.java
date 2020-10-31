package edu.eci.cvds.TimeLimit.Persistence.mybatisimpl.mappers;

import edu.eci.cvds.TimeLimit.model.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
public interface UserMapper {

    //public List<User>getUsers();

    public User getUser(@Param("nombre")String nombre);
}
